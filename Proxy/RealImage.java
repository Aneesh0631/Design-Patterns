package Proxy;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        System.out.println("Real image " + filename);
        this.filename = filename;
    }


    @Override
    public void display() {
        System.out.println("Real image displaying" + filename);
    }
}
