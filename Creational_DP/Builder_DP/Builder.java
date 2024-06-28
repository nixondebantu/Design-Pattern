package Creational_DP.Builder_DP;

public interface Builder {
    public Builder setOs(String os);

    public Builder setRam(int ram);

    public Builder setProcessor(String processor);

    public Builder setScreensize(double screensize);

    public Builder setBattery(int battery);
}
