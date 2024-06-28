package Creational_DP.Abstract_Factory_DP.factories;

import Creational_DP.Abstract_Factory_DP.buttons.Button;
import Creational_DP.Abstract_Factory_DP.buttons.WindowsButton;
import Creational_DP.Abstract_Factory_DP.checkboxes.Checkbox;
import Creational_DP.Abstract_Factory_DP.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

}
