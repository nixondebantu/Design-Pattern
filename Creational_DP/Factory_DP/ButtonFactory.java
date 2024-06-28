package Creational_DP.Factory_DP;

public class ButtonFactory {
    public Button getButton(int paltform) {
        if (paltform == 1) {
            return new IOSButton();
        } else if (paltform == 2) {
            return new AndroidButton();
        } else {
            return new PotatoButton();
        }
    }

}
