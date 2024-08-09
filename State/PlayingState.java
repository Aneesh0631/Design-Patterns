package State;

public class PlayingState extends State{

    public PlayingState(Game game){
        super(game);
        System.out.println("-- Game in playing state");
    }
    @Override
    public void onWelcomeScreen() {
        System.out.println("Not Allowed");
    }

    @Override
    public void onPlaying() {
        System.out.println("Currently playing");
    }

    @Override
    public void onBreak() {
        game.ChangeState(new BreeakState(game));
    }

    @Override
    public void onEndGame() {
        game.ChangeState(new EndGame(game));
    }
}
