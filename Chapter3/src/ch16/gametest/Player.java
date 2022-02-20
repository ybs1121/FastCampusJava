package ch16.gametest;

public class Player{
    PlayerLevel playerLevel;

    public Player() {
        playerLevel = new BeginnerLevel();
        playerLevel.showLevelMessage();

    }

    PlayerLevel getLevel(PlayerLevel playerLevel){
        return playerLevel;
    }
    void upgradeLevel(PlayerLevel playerLevel){
        this.playerLevel =playerLevel;
        playerLevel.showLevelMessage();
    }
    void play(int i){
        playerLevel.go(i);
    }
}
