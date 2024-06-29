package P1.formate;

import P1.base.Base;

public class SpellChecking extends Formate{

    public SpellChecking(Base base) {
        super(base);
        System.out.println("Spell checking");
    }

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return super.getFormate() + "+ Spell Checker ";
    }

}
