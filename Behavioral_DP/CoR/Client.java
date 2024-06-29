package Behavioral_DP.CoR;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler upHandler = new UsernamePasswordAuthenticationHandler();
        AuthenticationHandler tfaHandler = new TwoFactorAuthenticationHandler();
        AuthenticationHandler ipHandler = new IPWhitelistingHandler();

        ipHandler.setNextHandler(upHandler);
        upHandler.setNextHandler(tfaHandler);

        boolean isAuthenticated = ipHandler.authenticate("admin", "admin123");
        if (isAuthenticated) {
            // Proceed with server access
            System.out.println("Access granted.");
        } else {
            // Handle authentication failure
            System.out.println("Access denied.");
        }
    }

}
