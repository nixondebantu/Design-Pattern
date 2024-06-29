package P1.formate;

import P1.base.Base;

public class Bold extends Formate {

    public Bold(Base base) {
        super(base);
        System.out.println("Add Bold style.");
    }

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return super.getFormate() + "+ Bold ";
    }

    @Override
    public String getData() {
        // TODO Auto-generated method stub
        return super.getData();
    }

}
