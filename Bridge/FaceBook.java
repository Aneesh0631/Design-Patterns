package Bridge;

public class FaceBook implements App{
    private PhoneOs os;

    public FaceBook(PhoneOs os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        os.upload("Facebook Upload");
        os.download("Face.com");
        os.display("Facebook display");
    }
}
