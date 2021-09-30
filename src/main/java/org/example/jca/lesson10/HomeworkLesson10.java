package org.example.jca.lesson10;

import java.util.*;

public class HomeworkLesson10 {
    public static void main(String[] args) {
        task1();

        System.out.println();

        telephoneTask();
    }

    public static void task1() {
        List<String> list = new ArrayList<>();
        list.add("May");
        list.add("May");
        list.add("May");
        list.add("May");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("January");
        list.add("May");
        list.add("March");
        list.add("January");
        list.add("June");
        list.add("March");
        list.add("January");
        list.add("February");
        list.add("July");
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("July");
        list.add("July");
        list.add("July");
        list.add("July");

        List<String> copyList = new ArrayList<>(list);

        list.sort(Comparator.comparingInt(String::length));
        for (int i = 0; i < list.size(); i++) {
            for (int y = 0; y < list.size(); y++) {
                if (Objects.equals(list.get(y), list.get(i)) && y != i) {
                    list.remove(i);
                }
            }
        }
        int y = 0;
        for (int i = 1; i < list.size(); i++, y++) {
            if (Objects.equals(list.get(i), list.get(y))) {
                list.remove(y);
            }
        }
        for (String s : list) {
            int count = 0;
            for (y = 0; y < copyList.size(); y++) {
                if (Objects.equals(copyList.get(y), s)) {
                    count++;
                }
            }
            System.out.printf("Word %s repeat: %s times\n", s, count);
        }
        System.out.println("Unique word: " + list.size());
        System.out.println(list);
    }

    public static void telephoneTask() {

        Telephonebook telephone = new Telephonebook();
        telephone.add("Ivan", 89633335544L);
        telephone.add("Roma", 88521479632L);
        telephone.add("Kot", 87539518264L);
        telephone.add("Ivan", 81593574628L);
        telephone.add("Barsik", 87418529632L);
        telephone.add("Roma", 88529637419L);

        System.out.println("number of telephone Roma: " + telephone.get("Roma"));
    }


}


