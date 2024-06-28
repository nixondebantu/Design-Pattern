package Structural_DP.Proxy_DP;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        ProxyShell shell = new ProxyShell();
        while (true) {
            System.out.println("Select role or exit:");
            System.out.println("0(admin)   1(user)   2(exit)");
            System.out.print("PowerShell>");
            input = sc.nextInt();
            sc.nextLine();
            if(input == 2){
                System.out.println("Termianl closed successfully!!!");
                break;
            }
            User.updateRole(input);
            System.out.print("PowerShell ("+ User.role +") > ");
            shell.execute(sc.nextLine());

        }
    }
}
