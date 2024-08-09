package Decorator;

public class Client {
    public static void main(String[] args) {
        NormalCofeeMachine normalCofeeMachine= new NormalCofeeMachine();
        EnhancedCoffeeMachine enhancedCoffeeMachine = new EnhancedCoffeeMachine(normalCofeeMachine);

        normalCofeeMachine.makeLargeCoffee();
        normalCofeeMachine.makeSmallCoffee();
        System.out.println();
        enhancedCoffeeMachine.makeSmallCoffee();
        enhancedCoffeeMachine.makeLargeCoffee();
        enhancedCoffeeMachine.makeMilkCoffee();
    }
}
