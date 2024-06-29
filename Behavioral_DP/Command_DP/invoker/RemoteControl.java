package Behavioral_DP.Command_DP.invoker;

import Behavioral_DP.Command_DP.command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Error:  Set Command First!");
        }
    }

}
