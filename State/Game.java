package State;

public class Game {

    public State state = new WelcomeScreenState(this);

    public void ChangeState(State state){
        this.state = state;
    }
}
