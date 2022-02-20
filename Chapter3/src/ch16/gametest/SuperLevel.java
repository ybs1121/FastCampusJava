package ch16.gametest;

public class SuperLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("아주 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높게 jump");

    }

    @Override
    void turn() {
        System.out.println("turn 합니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("********고급자*********");
    }
}
