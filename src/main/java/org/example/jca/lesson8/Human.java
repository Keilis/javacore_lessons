package org.example.jca.lesson8;

public class Human implements Action {
    private String name;
    private int lineRun;
    private int lineJump;

    public Human(String name, int lineRun, int lineJump) {
        this.name = name;
        this.lineRun = lineRun;
        this.lineJump = lineJump;
    }

    @Override
    public boolean run(int length) {
        return this.lineRun >= length;
    }

    public boolean jump(int height) {
        return this.lineJump >= height;
    }

    public String getName() {
        return this.name;
    }

    public int getLineRun() {
        return lineRun;
    }

    public int getLineJump() {
        return lineJump;
    }

    public void setLineRun(int lineRun) {
        this.lineRun = lineRun;
    }

    public void setLineJump(int lineJump) {
        this.lineJump = lineJump;
    }
}
