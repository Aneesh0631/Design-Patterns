package State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = "";

        do{
            System.out.println("-- Please input command");
            try {
                string = reader.readLine().trim().toLowerCase();
                switch (string){
                    case "w": game.state.onWelcomeScreen();
                    break;
                    case "p": game.state.onPlaying();
                    break;
                    case "b":game.state.onBreak();
                    break;
                    case "e":game.state.onEndGame();
                    break;
                    default:
                        System.out.println("Unknown command");
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while (string != "exit");
    }
}
