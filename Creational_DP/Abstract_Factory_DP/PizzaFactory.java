package Creational_DP.Abstract_Factory_DP;

public interface PizzaFactory {
    Pizza createPizza();
    Cheese createCheese(Pizza pizza);
    Pepperoni createPepperoni(Pizza pizza);
}
