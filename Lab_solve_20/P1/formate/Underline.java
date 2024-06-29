package P1.formate;

import P1.base.Base;

public class Underline extends Formate {

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return super.getFormate() + "+ Underline ";
    }

    public Underline(Base base) {
        super(base);
        System.out.println("Add Underline Style.");
    }

}
