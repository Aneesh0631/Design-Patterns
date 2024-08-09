package Bridge;

public class Android  implements  PhoneOs{
    @Override
    public void upload(String data) {
        System.out.println("Android uploading data " + data);
    }

    @Override
    public void download(String URL) {
        System.out.println("Android downloading in URL " + URL);
    }

    @Override
    public void display(String data) {
        System.out.println("Android displaying  data " + data);
    }
}
