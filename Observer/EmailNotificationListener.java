package Observer;

public class EmailNotificationListener implements EventListner{
    @Override
    public void notify(String eventType, String file) {
        System.out.println("EmailNotification " + eventType +" performed on " + file);
    }
}
