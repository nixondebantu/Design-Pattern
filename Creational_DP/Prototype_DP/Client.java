package Creational_DP.Prototype_DP;

public class Client {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red", 0, 0, 10);
        Circle c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
    }
}
