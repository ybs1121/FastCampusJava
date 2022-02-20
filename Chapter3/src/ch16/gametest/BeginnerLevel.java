package ch16.gametest;

public class BeginnerLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 불가");

    }

    @Override
    void turn() {
        System.out.println("turn 불가");

    }

    @Override
    void showLevelMessage() {
        System.out.println("********초급자*********");
    }
}
