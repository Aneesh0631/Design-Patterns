package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Fighter> army = new ArrayList<>();

    public void spawnFighter(FighterRank fighterRank){
        Fighter f = FigterFactory.getFighter(fighterRank);
        army.add(f);
    }
    public void drawArmy(){
        for(Fighter fighter : army){
            switch (fighter.getRank()){

                case PRIVATE:
                    System.out.println("P");
                    break;

                case SERGENT:
                    System.out.println("S");
                    break;

                case null, default:
                    System.out.println("M");
            }
        }
    }
}
