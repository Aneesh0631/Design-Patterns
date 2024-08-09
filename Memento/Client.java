package Memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("Initial state");
        CareTaker careTaker = new CareTaker();
        careTaker.saveState(originator.createMemento());
        System.out.println("cuurent state is " + originator.state);

        originator.state = "state 1";
        careTaker.saveState(originator.createMemento());
        System.out.println("cuurent state is " + originator.state);

        originator.state = "state 2 ";
        careTaker.saveState(originator.createMemento());
        System.out.println("cuurent state is " + originator.state);

        System.out.println();

        originator.restoreMemento(careTaker.restoreState(1));
        System.out.println("cuurent state is " + originator.state);

        originator.restoreMemento(careTaker.restoreState(0));
        System.out.println("cuurent state is " + originator.state);


        originator.restoreMemento(careTaker.restoreState(2));
        System.out.println("cuurent state is " + originator.state);
    }
}
