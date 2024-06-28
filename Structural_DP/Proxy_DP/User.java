package Structural_DP.Proxy_DP;

public class User {
    public static String role = "user";
    public static void updateRole(int i){
        if(i == 1 && role != "user"){
            role = "user";
        }
        else if(i == 0 && role != "admin"){
            role = "admin";
        }
    }
}
