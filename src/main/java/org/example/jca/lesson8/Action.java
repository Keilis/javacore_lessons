package org.example.jca.lesson8;

public interface Action {
    boolean run(int line);

    boolean jump(int line);

    String getName();
}
