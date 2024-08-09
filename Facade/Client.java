package Facade;

public class Client {
    public static void main(String[] args) {
        NetWorkCommunication netWorkCommunication = new NetWorkCommunication();
        netWorkCommunication.communicate();
    }
}
