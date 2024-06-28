package HW.Abstract_Factory_DP;

public class PepperoniDecorator implements Pepperoni {
    private Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
