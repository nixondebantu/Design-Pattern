package Behavioral_DP.Command_DP.command;

import Behavioral_DP.Command_DP.receiver.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
