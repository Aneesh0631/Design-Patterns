package Strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy{
    @Override
    public String formatString(String input) {
        String output = "";
        Random random = new Random();
        for (Character character : input.toCharArray()){
            if(random.nextBoolean()){
                output+=character.toString().toLowerCase();
            }else {
                output+=character.toString().toUpperCase();
            }
        }
        return output;
    }
}
