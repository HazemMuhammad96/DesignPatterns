package behavioral.chain.loggers;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Info Logger: " + message);
    }
}
