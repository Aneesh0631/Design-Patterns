package Observer;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();
        editor.events.subscribe("open",emailNotificationListener);
        editor.events.subscribe("save",emailNotificationListener);
        editor.events.subscribe("open",logOpenListener);

        editor.openFile("test.txt");
        editor.saveFile();
    }
}
