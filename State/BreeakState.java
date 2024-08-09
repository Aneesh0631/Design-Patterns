package State;

public class BreeakState extends State{
    public BreeakState(Game game){
        super(game);
        System.out.println("-- Game on break state");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed");
    }

    @Override
    public void onPlaying() {
        game.ChangeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on break state");
    }

    @Override
    public void onEndGame(){
        System.out.println("Not Allowed");
    }
}
