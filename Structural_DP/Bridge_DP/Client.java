package Structural_DP.Bridge_DP;

import Structural_DP.Bridge_DP.devices.Radio;
import Structural_DP.Bridge_DP.remotes.AdvancedRemote;
import Structural_DP.Bridge_DP.remotes.BasicRemote;

public class Client {
    public static void main(String[] args) {
        Radio radio = new Radio();
        BasicRemote basicRemote = new BasicRemote(radio);
        basicRemote.power();
        basicRemote.channelUp();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
        radio.printStatus();
    }
}
