public class CashBalance {

    private double balance;
    public CashBalance(double cashBalance)
    {
        this.balance = cashBalance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void addCash(double amount)
    {
        this.balance += amount;
    }
    public void reduceCash(double amount)
    {
        this.balance -= amount;
    }
    public String toString()
    {
        return "Current cash balance "+this.balance;
    }
    
}
