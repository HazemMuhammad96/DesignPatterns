package behavioral.chain;

import behavioral.chain.exercise.dispensers.AbstractDispenser;
import behavioral.chain.loggers.AbstractLogger;
import behavioral.chain.loggers.InfoLogger;
import behavioral.chain.loggers.ErrorLogger;
import behavioral.chain.loggers.DebugLogger;

public class ChainMain {


    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debug = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger info = new InfoLogger(AbstractLogger.INFO);

        error.setNextLogger(debug);
        debug.setNextLogger(info);

        return error;
    }

    public static AbstractDispenser getChainOfDispensers(){
        AbstractDispenser d50 = new AbstractDispenser(50);
        AbstractDispenser d20 = new AbstractDispenser(20);
        AbstractDispenser d10 = new AbstractDispenser(10);
        d50.setNextDispenser(d20);
        d20.setNextDispenser(d10);
        return d50;
    }

    public static void main(String[] args) {
//        AbstractLogger loggerChain = getChainOfLoggers();
//
//        System.out.println("\nfirst msg");
//        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
//        System.out.println("\nsecond msg");
//        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
//        System.out.println("\nthird msg");
//        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

        AbstractDispenser dispenser = getChainOfDispensers();

//        dispenser.dispense(130);
        dispenser.dispense(40);
    }
}
