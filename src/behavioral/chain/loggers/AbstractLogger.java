package behavioral.chain.loggers;

public abstract class AbstractLogger {

    public static int ERROR = 3;
    public static int DEBUG = 2;
    public static int INFO = 1;

    public int level;

    public AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger a){
        nextLogger = a;
    }

    public void logMessage(int messageLevel, String message){
        if(level <= messageLevel)
            write(message);

        if(nextLogger != null)
            nextLogger.logMessage(messageLevel,message);
    }

    public abstract void write(String message);
}
