package org.example.jca.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeworkLesson4 {

    static int sizeY = 3;
    static int sizeX = 3;

    static int numberOfMoves = sizeY * sizeX;
    static char emptyPoint = '.';
    static char GamerPoint = 'X';
    static char CompPoint = '0';
    private static final Scanner scanner = new Scanner(System.in);
    private static final char[][] field = new char[sizeY][sizeX];
    private static int choiceX;
    private static int choiceY;
    private static int scoreGamer = 0;
    private static int scoreComp = 0;
    private static int scoreCount = 1;

//    Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.

//    Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.

//    Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
//    Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

//*** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

    static void tacToy() {

        while (true) {
            playRound();
            System.out.printf("Счёт игрока    AI\n" +
                    "         %d      %d\n", scoreGamer, scoreComp);
            System.out.print("Хотите сыграть ещё раз? Yes or No >>>> ");
            if (!scanner.next().equals("Yes")) {
                System.out.println("Good bye!");
                break;
            } else {
                clearField();
                numberOfMoves = sizeX * sizeY;
            }
        }
    }

    private static void playRound() {
        System.out.printf("Раунд %d\n", scoreCount++);

        do {
            drawField();

            choiceGamer();
            if (isFinished()) break;

            choiceComputer();
            if (isFinished()) break;
        } while (numberOfMoves > 0);
    }


    private static void choiceGamer() {
        System.out.println("Введите координаты вашего выбора (х и у, через пробел):");
        choiceX = scanner.nextInt();
        choiceY = scanner.nextInt();

        // TODO try на некорректные значения
        if (field[choiceY - 1][choiceX - 1] == emptyPoint) {
            field[choiceY - 1][choiceX - 1] = GamerPoint;
//            checkResult();
        } else {
            System.out.println("Координаты заняты");
            choiceGamer();
        }
    }

    private static void choiceComputer() {
        choiceX = (int) (Math.random() * sizeX) + 1;
        choiceY = (int) (Math.random() * sizeY) + 1;

        if (field[choiceY - 1][choiceX - 1] == emptyPoint) {
            field[choiceY - 1][choiceX - 1] = CompPoint;
//            checkResult();
        } else {
            choiceComputer();
        }
    }

    private static boolean isFinished() {
        numberOfMoves--;
//        drawField();
        if (checkWin(GamerPoint)) {
            drawField();
            System.out.println("Игрок победил");
            scoreGamer++;
            return true;
        } else if (checkWin(CompPoint)) {
            drawField();
            System.out.println("Комп победил");
            scoreComp++;
            return true;
        } else if (numberOfMoves == 0) {
            drawField();
            System.out.println("Ничья");
            return true;
        } else {
            return false;
            // TODO проверка победы
        }

    }

    private static boolean checkWin(char dot) {


        //hor
        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;

        //ver
        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;

//        chekDiagonal();
        int k = field.length - 1;
        int aspiration = 0;
        int winLength = 3;

        for (int m = 0; m < field.length; m++) {
            if (field[k][m] == dot) {
                aspiration++;
                k--;
            } else if (field[m][m] == dot) {
                aspiration++;
            }
        }
        if (aspiration == winLength) {
            return true;
        }


        //diag
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
        return false;
    }

    private static void clearField() {
        for (int y = 0; y < sizeX; y++) {
            for (int i = 0; i < sizeY; i++) {
                field[i][y] = emptyPoint;
            }
        }
    }

    private static void drawField() {

        for (int y = 0; y < sizeX; y++) {
            for (int i = 0; i < sizeY; i++) {

                if (field[i][y] != GamerPoint && field[i][y] != CompPoint) {
                    field[i][y] = emptyPoint;
                }
            }
        }

        System.out.print("0 ");
        for (int j = 0; j < sizeY; j++) {
            System.out.print(j + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < sizeX; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < sizeY; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tacToy();
    }
}
