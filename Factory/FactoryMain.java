package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        OS factoryOS = new FactoryOS().getInstance("a");
        System.out.println(factoryOS.spec());
    }
}
