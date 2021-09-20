package org.example.jca.lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, "кот");
    }

    @Override
    public void swim(int swimLine) {
        System.out.printf("кот %s лёг на берегу и никуда не поплыл\n", name);
    }

    @Override
    public void run(int runLine) {

        if (runLine > 0 & runLine <= 200) {
            System.out.printf("кот %s пробежал %s метров. Хороший котик\n", name, runLine);
        } else if (runLine > 200) {
            System.out.printf("кот %s пробежал 200 метров, устал и лёг спать\n", name);
        } else {
            System.out.printf("кот %s ничего не понимая, пошёл есть\n", name);
        }
    }

}
