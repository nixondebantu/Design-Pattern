package Creational_DP.Abstract_Factory_DP;

import Creational_DP.Abstract_Factory_DP.buttons.Button;
import Creational_DP.Abstract_Factory_DP.checkboxes.Checkbox;
import Creational_DP.Abstract_Factory_DP.factories.GUIFactory;
import Creational_DP.Abstract_Factory_DP.factories.MacOSFactory;
import Creational_DP.Abstract_Factory_DP.factories.WindowsFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;
    private GUIFactory factory;

    public Application(String OS) {
        if (OS.trim().equalsIgnoreCase("MAC")) {
            factory = new MacOSFactory();
            System.out.println("Mac factory started");
        } else {
            factory = new WindowsFactory();
            System.out.println("Windows factory started");
        }
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
