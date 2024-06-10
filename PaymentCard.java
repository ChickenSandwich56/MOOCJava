public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance)
    {
        this.balance = openingBalance;
    }
    public String toString()
    {
        return "The card has a balance of: "+ this.balance+ " euros";
    }
    public void eatAffordably()
    {
        if(this.balance>=2.40){
        this.balance -=2.40;
        }
        if(this.balance < 2.40){
        System.out.println("You cannot afford this menu item!");
        }
    }
    public void eatHeartily(){
        if(this.balance>=4.60){
        this.balance-=4.60;
        }
        if(balance <4.60){
        System.out.println("You cannot afford this menu item!");
        }
    }
    public void addMoney(double amount)
    {
        if(amount <0)
        {
            System.out.println("Cannot top up with negative amount");
        }
        if(amount >= 0){
        this.balance+=amount;
        System.out.println(amount+" Euros added, current balance is now: "+ this.balance);
        }
        
        
    }
}
