package Creational_DP.Builder_DP;

public class Client {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setBattery(4000).getPhone();
        System.out.println(p);
    }
}
