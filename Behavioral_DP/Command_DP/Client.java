package Behavioral_DP.Command_DP;

import Behavioral_DP.Command_DP.command.LightOffCommand;
import Behavioral_DP.Command_DP.command.LightOnCommand;
import Behavioral_DP.Command_DP.invoker.RemoteControl;
import Behavioral_DP.Command_DP.receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
