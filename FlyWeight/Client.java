package FlyWeight;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int toDraw = 1000;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();
        for(int i=0;i<toDraw;i++){
            switch (random.nextInt(2)){
                case 0: currentRank = FighterRank.PRIVATE;
                break;
                case 1: currentRank = FighterRank.SERGENT;
                default:currentRank = FighterRank.MAJOR;
            }
            army.spawnFighter(currentRank);
        }
        army.drawArmy();
    }
}
