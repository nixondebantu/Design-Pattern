package Creational_DP.Abstract_Factory_DP.factories;

import Creational_DP.Abstract_Factory_DP.buttons.Button;
import Creational_DP.Abstract_Factory_DP.buttons.MacOSButton;
import Creational_DP.Abstract_Factory_DP.checkboxes.Checkbox;
import Creational_DP.Abstract_Factory_DP.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
