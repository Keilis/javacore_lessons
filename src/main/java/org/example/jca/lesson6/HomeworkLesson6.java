package org.example.jca.lesson6;

public class HomeworkLesson6 {
    public static void main(String[] args) {

        int countAnimal = 0;
        int countCat = 0;
        int countDog = 0;

        Animal[] animals = {
                new Cat("Мурзик"),
                new Dog("Макс"),
                new Cat("Барсик"),
                new Cat("Белыш"),
                new Dog("Бобик"),
                new Dog("Кеша"),
        };

        for (Animal animal : animals) {
            animal.swim(10);
            animal.run(150);
            System.out.println();
            countAnimal++;
            if (animal instanceof Cat) {
                countCat++;
            } else {
                countDog++;
            }
        }
        System.out.printf("Количество животных: %s\nКоличество котиков: %s\nКоличество пёсиков: %s\n", countAnimal, countCat, countDog);
    }
}
