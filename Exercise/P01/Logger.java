package Exercise.P01;

public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String logTxt) {
        System.out.println(logTxt);
    }
}
