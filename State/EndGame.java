package State;

public class EndGame extends State{
    public EndGame(Game game){
        super(game);
        System.out.println("-- Game Ended");
    }

    @Override
    public void onWelcomeScreen() {
        game.ChangeState(new WelcomeScreenState(game));
    }

    @Override
    public void onPlaying() {
        System.out.println("Not allowed");
    }

    @Override
    public void onBreak() {
        System.out.println("Not allowed");
    }

    @Override
    public void onEndGame() {
        System.out.println("Currently on End Game state");
    }
}
