package Command;

public class Client {
    public static void main(String[] args) {
        CommandProcess process = new CommandProcess();
        process.addCommand(new OrderAddCommand(1,12.99))
                .addCommand(new OrderAddCommand(2,24))
                .addCommand(new OrderAddCommand(3,56))
                .execute();
    }
}
