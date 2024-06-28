package HW.Abstract_Factory_DP;

public class Client {
    public static void main(String[] args) {
        // Create a plain pizza factory
        PizzaFactory pizzaFactory = new PlainPizzaFactory();

        // Create a plain pizza
        Pizza pizza = pizzaFactory.createPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese to the pizza
        Cheese cheese = pizzaFactory.createCheese(pizza);
        System.out.println(cheese.getDescription() + " Cost: $" + cheese.getCost());

        // Add pepperoni to the pizza
        Pepperoni pepperoni = pizzaFactory.createPepperoni(pizza);
        System.out.println(pepperoni.getDescription() + " Cost: $" + pepperoni.getCost());
    }
}