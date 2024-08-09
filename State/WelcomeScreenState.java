package State;

public class WelcomeScreenState extends State{
    public WelcomeScreenState(Game game) {
        super(game);
        System.out.println(" -- Game in welcome screen");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Currently on welcome screen");
    }

    @Override
    public void onPlaying() {
        game.ChangeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Not Allowed");
    }

    @Override
    public void onEndGame() {
        System.out.println("Not Allowed");
    }
}
