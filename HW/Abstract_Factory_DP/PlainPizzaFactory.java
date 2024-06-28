package HW.Abstract_Factory_DP;

public class PlainPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PlainPizza();
    }

    @Override
    public Cheese createCheese(Pizza pizza) {
        return new CheeseDecorator(pizza);
    }

    @Override
    public Pepperoni createPepperoni(Pizza pizza) {
        return new PepperoniDecorator(pizza);
    }
}
