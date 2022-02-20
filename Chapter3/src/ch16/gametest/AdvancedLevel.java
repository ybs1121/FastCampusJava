package ch16.gametest;

public class AdvancedLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("빠르게 달립니다.");

    }

    @Override
    void jump() {
        System.out.println("높이 jump");


    }

    @Override
    void turn() {
        System.out.println("turn 불가");
    }

    @Override
    void showLevelMessage() {
        System.out.println("********중급자*********");
    }
}
