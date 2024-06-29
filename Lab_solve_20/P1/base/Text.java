package P1.base;

public class Text implements Base {
    private String data;

    public Text(String data) {
        this.data = data;
    }

    @Override
    public String getFormate() {
        return "Normal Text ";
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
