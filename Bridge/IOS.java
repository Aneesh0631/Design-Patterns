package Bridge;

public class IOS implements  PhoneOs{
    @Override
    public void upload(String data) {
        System.out.println("Iphone uploading  data " + data);
    }

    @Override
    public void download(String URL) {
        System.out.println("Iphone downloading in URL " + URL);
    }

    @Override
    public void display(String data) {
        System.out.println("Iphone displaying  data " + data);
    }
}
