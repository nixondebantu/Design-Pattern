package Structural_DP.Decorator_DP;

import Structural_DP.Decorator_DP.component.Coffee;
import Structural_DP.Decorator_DP.component.SimpleCoffee;
import Structural_DP.Decorator_DP.decorator.MilkDecorator;
import Structural_DP.Decorator_DP.decorator.SugarDecorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
