package behavioral.chain.exercise.dispensers;

public class AbstractDispenser {

    public int cashAmount;

    public AbstractDispenser nextDispenser;

    public AbstractDispenser(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void setNextDispenser(AbstractDispenser a) {
        nextDispenser = a;
    }

    public int withdraw(int neededAmount) {
        while (cashAmount <= neededAmount){
            System.out.print(" subtracted " + cashAmount);
            neededAmount -= cashAmount;
        }
        System.out.println("\tnew Needed Amount is " + neededAmount);
        return neededAmount;
    }

    public void dispense(int neededAmount) {
        if (cashAmount <= neededAmount)
            neededAmount = withdraw(neededAmount);

        if (nextDispenser != null)
            nextDispenser.dispense(neededAmount);
    }
}
