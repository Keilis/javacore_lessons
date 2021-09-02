package org.example.jca.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeworkLesson2 {

    static void array1() {
        int[] intArray = new int[10];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[2] = 0;
        intArray[3] = 0;
        intArray[4] = 1;
        intArray[5] = 0;
        intArray[6] = 1;
        intArray[7] = 1;
        intArray[8] = 0;
        intArray[9] = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 1) {
                intArray[i] = 0;
            } else {
                intArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    static void array2() {
        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }
        System.out.println(Arrays.toString(intArray));
    }

    static void array3() {
        int[] ints = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 6) {
                ints[i] = ints[i] * 2;
            }
        }
        System.out.println(Arrays.toString(ints));
    }

    static void array4maxmin() {
        int[] intArray = {8, 5, 3, 2, 11, 4, 48, 2, 4, 8, 9, 1};
        int max = intArray[0];
        int min = intArray[0];
        for (int element : intArray) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println("max = " + max + " min = " + min);
    }

    static boolean array5(int[] intArray) {
//        int[] intArray = {2, 2, 2, 5, 2, 2, 10, 1};
        boolean checkBalance = false;
        int sumLeft = intArray[0];
        int sumRight = intArray[1];
        for (int i = 2; i < intArray.length; i++) {
            sumRight = sumRight + intArray[i];
        }
        for (int i = 1; i < intArray.length; i++) {
            if (sumLeft < sumRight) {
                sumLeft += intArray[i];
                sumRight -= intArray[i];
            } else if (sumLeft == sumRight) {
                checkBalance = true;
            }
        }
        return checkBalance;
    }

//    static void hardArray() {
//        int[] intArray = {2, 2, 2, 5, 2, 2, 10, 1};
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int d = 1;
//        for (int i = intArray.length; i > intArray.length - n; i--, d++) {
//            if (n > 0) {
//                intArray[i] = intArray[n - d];
//            }
//        }
//        for (int k = 0; k <= intArray.length - n; k++) {
//            if (n > 0) {
//                intArray[k] = intArray[k + n];
//            }
//        }
//        System.out.println(Arrays.toString(intArray));
//    }


    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4maxmin();

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(array5(arr));

    }
}

