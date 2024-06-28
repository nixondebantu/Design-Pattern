package Creational_DP.Factory_DP;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for IOS and 2 for Android:");
        int paltform = sc.nextInt();
        ButtonFactory buttonFactory = new ButtonFactory();
        Button btn = buttonFactory.getButton(paltform);
        btn.show();
    }

}
