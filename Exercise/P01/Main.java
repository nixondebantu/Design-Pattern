package Exercise.P01;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        logger1.log("This is logger1");

        Logger logger2 = Logger.getLogger();
        logger2.log("This is logger2 which works same as logger1");

        System.out.println("They are both same instance: " + (logger1 == logger2));
    }
}
