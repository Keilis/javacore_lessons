package org.example.jca.lesson8;

public class Wall implements Barrier {
    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean tries(Action action) {
        if (action.jump(this.height)) {
            System.out.printf("%s прыгнул %s метра по перпятствию %s\n", action.getName(), height, this.name);
            return true;
        } else {
            System.out.printf("%s не перепрыгнул препятствие %s\n", action.getName(), this.name);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
