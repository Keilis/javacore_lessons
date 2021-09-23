package org.example.jca.lesson8;

public class Treadmill implements Barrier {
    private String name;
    private int length;

    public Treadmill(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean tries(Action action) {
        if (action.run(this.length)) {
            System.out.printf("%s пробежал %s метров по перпятствию %s\n", action.getName(), length, this.name);
            return true;
        } else {
            System.out.printf("%s не пробежал препятствие %s\n", action.getName(), this.name);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
