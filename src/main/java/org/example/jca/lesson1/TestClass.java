package org.example.jca.lesson1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestClass {
    byte bV = 127;
    short sV = 32000;
    int iV = 10_000_000;
    long lV = 3_000_000_000L;

    char chV = '\u3234';

    boolean blV = (3 + 5) > 5;

    double dlV = 0.127;
    float fV = 2.127f;

    String stV = "Hello!";

    static Scanner scanner = new Scanner(System.in);
//
//    static String y;
//
//    static String k;
//
//    static String type;

    static float add(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    static boolean comparison() {
        System.out.println("Введите два целых числа");
//        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
//        Scanner scanner1 = new Scanner(System.in);
        int w = scanner.nextInt();
        boolean c = q + w > 10 && q + w < 20;
//        if ((q + w) > 10 && (q + w) < 20) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
        return c;
    }

    static String method(int t) {
        String y;
        if (t >= 0) {
            y = "положительное";
        } else {
            y = "отрицательное";
        }
        return y;
    }

    static String name(String k) {
        k = "Привет, " + k;
        k = k + "!";
        return k;
    }

    static String year() {
        System.out.print("Введите год: ");
        String type;
        int year = scanner.nextInt();
//        int p = year % 400;
//        int m = year % 100;
//        int v = year % 4;
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (year < 0) {
            type = "Сегодня это уже не важно";
        } else if (isLeapYear) {
            type = "високосный";
        } else {
            type = "не високосный";
        }
        return type;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3, 7, 2));

        System.out.println(comparison());

        System.out.println(method(50));

        System.out.println(name("Мария"));

        System.out.println(year());

    }

}
