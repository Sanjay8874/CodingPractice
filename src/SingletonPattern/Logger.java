package SingletonPattern;

public class Logger {

    private static Logger logger;

    private Logger() {

    }

    public static Logger getLoggerInstance() {

        if (logger == null) {

            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String msg) {

        System.out.println(msg);
    }
}
