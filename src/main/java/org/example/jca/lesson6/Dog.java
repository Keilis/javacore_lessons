package org.example.jca.lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, "пёс");
    }

    @Override
    public void swim(int swimLine) {
        if (swimLine > 0 & swimLine <= 10) {
            System.out.printf("пёс %s проплыл %s метров. Хороший мальчик\n", name, swimLine);
        } else if (swimLine > 10) {
            System.out.printf("пёс %s отказался плыть, услышав ваши завышенные требования\n", name);
        } else {
            System.out.printf("пёс %s лёг на берегу и уснул\n", name);
        }
    }

    @Override
    public void run(int runLine) {
        if (runLine > 0 & runLine <= 500) {
            System.out.printf("пёс %s пробежал %s метров. Он молодец\n", name, runLine);
        } else if (runLine > 500) {
            System.out.printf("пёс %s пробежал 500 метров, устал и лёг\n", name);
        } else {
            System.out.printf("пёс %s ничего не понимая, пошёл есть\n", name);
        }
    }
}
