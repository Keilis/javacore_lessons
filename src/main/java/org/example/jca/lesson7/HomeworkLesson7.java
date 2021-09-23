package org.example.jca.lesson7;

public class HomeworkLesson7 {
    public static void main(String[] args) {
        catsAndBowls();
    }

    private static void catsAndBowls() {

        Cat[] cats = {
                new Cat("Мурзик", 10),
                new Cat("Барсик", 50),
                new Cat("Васька", 40)
        };

        Bowl bowl = new Bowl(100);

        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(Cat.getFullness());
            System.out.println();
        }

        System.out.printf("В миске осталось: %s грамм корма", bowl.getFoodAmount());
    }
}
