public class InsufficientFundsException extends Exception{
    private double amount;

    public double getAmount(){
        return this.amount;
    }

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
}