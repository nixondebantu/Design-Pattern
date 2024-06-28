package Creational_DP.Abstract_Factory_DP;

public class CheeseDecorator implements Cheese {
    private Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}
