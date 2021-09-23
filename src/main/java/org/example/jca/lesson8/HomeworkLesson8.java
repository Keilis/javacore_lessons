package org.example.jca.lesson8;

public class HomeworkLesson8 {
    public static void main(String[] args) {
        Action[] players = {
                new Cat("Барсик", 1500, 2),
                new Human("Владимир", 2500, 1),
                new Robot("А-310", 6000, 0),
                new Cat("Василий", 100, 4),
                new Robot("С-50", 5000, 5),
                new Human("Игорь", 2000, 3),
                new Cat("Мурзик", 500, 6),
                new Robot("В-4710", 3500, 1)
        };
        Barrier[] barriers = {
                new Treadmill("Первая дорожка", 100),
                new Wall("Первая стена", 2),
                new Wall("Вторая стена", 3),
                new Treadmill("Вторая дорожка", 3000),
                new Treadmill("Третья дорожка", 2500),
                new Treadmill("Четвертая дорожка", 5000),
                new Wall("Третья стена", 4),
                new Wall("Четвертая стена", 2)

        };

        for (Action action : players) {
            for (Barrier barrier : barriers) {
                if (!barrier.tries(action)) break;
                System.out.println();
            }
        }
    }
}
