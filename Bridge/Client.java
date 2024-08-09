package Bridge;

public class Client {
    public static void main(String[] args) {
        App app = new FaceBook(new IOS());
        App app1 = new Instagaram(new Android());

        app.runApp();
        app1.runApp();
    }
}
