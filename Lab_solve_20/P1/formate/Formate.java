package P1.formate;

import P1.base.Base;

public abstract class Formate implements Base {
    private Base base;

    public Formate(Base base) {
        this.base = base;
    }

    @Override
    public String getFormate() {
        // TODO Auto-generated method stub
        return base.getFormate();
    }

    @Override
    public String getData() {
        // TODO Auto-generated method stub
        return base.getData();
    }

    @Override
    public void setData(String data) {
        // TODO Auto-generated method stub
        base.setData(data);
    }

}
