package Structural_DP.Proxy_DP;

import java.util.ArrayList;
import java.util.List;

public class ProxyShell implements Terminal{
    private Powershell powershell;
    private List<String> vulnerableCommand;
    
    public ProxyShell() {
        powershell = new Powershell();
        vulnerableCommand = new ArrayList<>();
        vulnerableCommand.add("rm -rf");
    }

    @Override
    public void execute(String command) {
        if(vulnerableCommand.contains(command) && User.role != "admin"){
            System.out.println("PowerShell can't this execute command.");
            System.out.println("Change role to admin to execute command: "+command);
        }
        else{
            powershell.execute(command);
        }
    }

}
