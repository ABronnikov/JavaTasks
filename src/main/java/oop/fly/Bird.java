package oop.fly;

/**
 * Исправить ошибку в структуре из пакета fly на правильную.
 */

public class Bird implements Flyable {

    @Override
    public void isFlying() {
        System.out.println("I fly like a bird.");
    }

    public void isEating() {
        System.out.println("I eat like a bird.");
    }
}