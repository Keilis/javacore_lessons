package org.example.jca.lesson6;

public abstract class Animal {
    protected String name;

    public Animal(String name, String type) {
        this.name = name;
    }

    public abstract void run(int runLine);

    public abstract void swim(int swimLine);
}
