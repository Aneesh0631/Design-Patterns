package Observer;

public class LogOpenListener implements EventListner{
    @Override
    public void notify(String eventType, String file) {
        System.out.println("LogOpenListener " + eventType +" performed on " + file);
    }
}
