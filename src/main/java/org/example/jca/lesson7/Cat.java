package org.example.jca.lesson7;

public class Cat {

    private static boolean fullness;
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        System.out.printf("Котик %s проснулся, потянулся и пошёл к миске кушать\n", this.name);
        bowl.decreaseFood(this.appetite);
    }

    public static void setFullness(int hungry) {
        if (hungry == 0) {
            fullness = true;
        } else {
            fullness = false;
        }
    }

    public static boolean getFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
