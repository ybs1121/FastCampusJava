package ch16.gametest;

public abstract class PlayerLevel {



    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();


    final void go(int i){
        run();
        for(int count = 0; count < i; count ++){
            jump();
        }
        turn();

    };

}
