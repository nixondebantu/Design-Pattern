package Creational_DP.Abstract_Factory_DP.factories;

import Creational_DP.Abstract_Factory_DP.buttons.Button;
import Creational_DP.Abstract_Factory_DP.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
