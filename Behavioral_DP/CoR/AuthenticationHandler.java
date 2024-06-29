package Behavioral_DP.CoR;

public interface AuthenticationHandler {
    void setNextHandler(AuthenticationHandler authenticationHandler);

    boolean authenticate(String userName, String password);
}
