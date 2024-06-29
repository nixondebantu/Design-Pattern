package P1;

import P1.base.Base;
import P1.base.Text;
import P1.formate.Bold;
import P1.formate.Highlighting;
import P1.formate.Italic;
import P1.formate.SpellChecking;

public class Client {
    public static void main(String[] args) {
        Base text = new Text("Sample Text");
        text = new Italic(text);
        text = new SpellChecking(text);
        System.out.println("Text: " + text.getData());
        System.out.println("Formate: " + text.getFormate());
        text = new Highlighting(text);
        text = new Bold(text);
        text.setData("New Text");
        System.out.println("Text: " + text.getData());
        System.out.println("Formate: " + text.getFormate());
    }
}
