package Behavioral_DP.CoR;

public class UsernamePasswordAuthenticationHandler implements AuthenticationHandler {
    private AuthenticationHandler authenticationHandler;

    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        if (!userName.equals("admin") || !password.equals("admin123")) {
            System.out.println("UsernamePasswordAuthenticationHandler: Authentication failed.");
            return false;
        } else if (authenticationHandler != null) {
            System.out.println("UsernamePasswordAuthenticationHandler: Authentication successful.");
            return authenticationHandler.authenticate(userName, password);
        } else {
            System.out.println("UsernamePasswordAuthenticationHandler: Authentication successful.");
            return true;
        }
    }

}
