package P1.formate;

import P1.base.Base;

public class Highlighting extends Formate {

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return super.getFormate() + "+ Highlighting ";
    }

    public Highlighting(Base base) {
        super(base);
        System.out.println("Text Highlighted");
    }

}
