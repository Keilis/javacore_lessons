package org.example.jca.lesson3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeworkLesson3 {
    private static final Scanner scanner = new Scanner(System.in);

    static void task1() {
        int[][] intArray = new int[5][5];
        int i = intArray.length - 1;

        for (int y = 0; y < intArray.length; y++) {
            intArray[y][y] = 1;
            intArray[i][y] = 1;
            i--;
        }
        image(intArray);
    }

    static void image(int[][] intArray) {
        for (int[] arr : intArray) {
            for (int x = 0; x < intArray.length; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.println();
        }
    }

    static void guessNumberGame() {
        System.out.println("Ваша задача угадать число.");
        int number = (int) (Math.random() * 10);
        int numberOfTries = 3;
        System.out.println("Угадайте число от 0 до 9. У вас есть три попытки. Введите число:");

        while (numberOfTries > 0) {
            int inputNumber;

            while (true) {
                try {
                    inputNumber = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите число от 0 до 9, пожалуйста");
                    scanner.nextLine();
                }
            }

            if (inputNumber == number) {
                System.out.println("Вы угадали");
                break;
            } else if (inputNumber > number) {
                System.out.println("Загаданное число меньше");
                numberOfTries--;
            } else {
                System.out.println("Загаданное число больше");
                numberOfTries--;
            }
        }

        if (numberOfTries == 0) {
            System.out.println("Вы не угадали");
        }

        replayGame();
    }

    static void replayGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int choiceNumber = scanner.nextInt();

        while (choiceNumber != 0 && choiceNumber != 1) {
            System.out.println("Введите 1 – да / 0 – нет");
            choiceNumber = scanner.nextInt();
        }

        if (choiceNumber == 1) {
            guessNumberGame();
        } else {
            System.out.println("Спасибо за игру");
        }
    }

    static void wordGame() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int fruitNumber = (int) (Math.random() * words.length);
        String secretWord = words[fruitNumber];
        System.out.println("Загадан фрукт. Ваша задача угадать, какой из предложенных фруктов загадан:");
        System.out.println(Arrays.toString(words));
        System.out.println("Рекомендация: Используйте только маленькие буквы.");

        while (true) {
            String choiceWord = scanner.next();

            if (choiceWord.equals(secretWord)) {
                System.out.println("Вы угадали");
                break;
            } else {
                char[] result = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

                int sw = secretWord.length();
                int cw = choiceWord.length();
                int minLengthWord = Math.min(sw, cw);

                for (int i = 0; i < minLengthWord; i++) {
                    char letterSW = secretWord.charAt(i);
                    char letterCW = choiceWord.charAt(i);

                    if (letterCW == letterSW) result[i] = letterSW;
                }
                System.out.println(result);
                System.out.println("Вы не угадали");
                System.out.println("С подсказкой попробуйте угадать ещё раз");
            }
        }
    }

    public static void main(String[] args) {
        task1();

        guessNumberGame();

        wordGame();
    }
}
