package behavioral.chain.loggers;

public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Debug Logger: " + message);
    }
}
