package P1.formate;

import P1.base.Base;

public class Italic extends Formate {

    public Italic(Base base) {
        super(base);
        System.out.println("Add Italic style.");
    }

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return super.getFormate() + "+ Italic ";
    }

    @Override
    public String getData() {
        // TODO Auto-generated method stub
        return super.getData();
    }

}
