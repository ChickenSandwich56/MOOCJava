public class BetterPaymentCard {

    private double balance;
    private double amountTaken;

    public BetterPaymentCard(double cardBalance)
    {
        this.balance = cardBalance;
    }

    public double balance()
    {
        return this.balance;
    }
    public void addMoney(double amount)
    {
        this.amountTaken = amount;
        this.balance= this.balance + amount;
    }
    public boolean withdraw(double amount)
    {
        this.amountTaken = amount;
        if(this.balance>= amount)
        {
            this.balance -= amount;
            return true;
        }
        else 
        {
            return false;
        }
    }
    public String toString()
    {
        return "Card Balance: "+this.balance;
    }
    
    
}
