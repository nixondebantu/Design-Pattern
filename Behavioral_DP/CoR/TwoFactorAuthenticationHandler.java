package Behavioral_DP.CoR;

public class TwoFactorAuthenticationHandler implements AuthenticationHandler {
    private AuthenticationHandler authenticationHandler;

    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        // Simulating two-factor authentication
        if (!verifyOTP("123456")) {
            System.out.println("TwoFactorAuthenticationHandler: Authentication failed.");
            return false;
        } else if (authenticationHandler != null) {
            System.out.println("TwoFactorAuthenticationHandler: Authentication successful.");
            return authenticationHandler.authenticate(userName, password);
        } else {
            System.out.println("TwoFactorAuthenticationHandler: Authentication successful.");
            return true;
        }
    }

    private boolean verifyOTP(String otp) {
        // Simulated OTP verification logic
        return otp.equals("123456");
    }

}
