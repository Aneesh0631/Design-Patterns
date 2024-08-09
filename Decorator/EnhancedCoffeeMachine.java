package Decorator;

public class EnhancedCoffeeMachine implements CoffeeMachine{
    private NormalCofeeMachine normalCofeeMachine;

    public EnhancedCoffeeMachine(NormalCofeeMachine normalCofeeMachine) {
        this.normalCofeeMachine = normalCofeeMachine;
    }

    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine making small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        normalCofeeMachine.makeLargeCoffee();
        //System.out.println("Enhanced coffee machine making large coffee");
    }

    public void makeMilkCoffee(){
        System.out.println("Enhanced coffee machine making milk coffee");
    }
}
