package Bridge;

public class Instagaram implements App{
    private PhoneOs os;

    public Instagaram(PhoneOs os) {
        this.os = os;
    }
    @Override
    public void runApp() {
        System.out.println();
        os.display("cached Data");
        os.upload("instagram.com");
        os.display("Instagram data");
    }
}
