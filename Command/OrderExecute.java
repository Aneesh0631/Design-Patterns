package Command;

public class OrderExecute implements Command{
    int id;

    public OrderExecute(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Order id " + id + " executed");
    }
}
