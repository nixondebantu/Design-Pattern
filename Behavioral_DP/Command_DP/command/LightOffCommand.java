package Behavioral_DP.Command_DP.command;

import Behavioral_DP.Command_DP.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
