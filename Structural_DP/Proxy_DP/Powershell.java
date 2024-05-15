package Structural_DP.Proxy_DP;

public class Powershell implements Terminal{

    @Override
    public void execute(String command) {
        System.out.println("PowerShell executed command: " + command + " successfully!");
    }

}
