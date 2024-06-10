public class PaymentTerminal {

    private double balance;
    private int affordableMealStocked;
    private int heartyMealsStocked;
    private double totalCost;


    public PaymentTerminal(double initialBalance, int aMealStock, int hMealStock)
    {
        this.balance = initialBalance;
        this.affordableMealStocked = aMealStock;
        this.heartyMealsStocked = hMealStock;
    }
//paying with cash
    public void eatAffordably(CashBalance cash, double payment)
    {
        
        if(payment>=2.40){
            cash.reduceCash(2.40);
        this.balance+=2.40;
        this.affordableMealStocked--;
        this.totalCost+=2.40;

        if(payment>2.40){
            System.out.println("Change Returned: "+(payment-2.40));
            cash.addCash(payment-2.40);
        }
        }
        else if(payment<2.40){
            System.out.println("Insufficient payment.");
        }

    }
    public void eatHeartily(CashBalance cash, double payment)
    {
        if(payment>=5.60){
        cash.reduceCash(5.60);
        this.balance+=5.60;
        this.heartyMealsStocked--;
        this.totalCost+=5.60;
        if(payment>5.60){
            System.out.println("Change Returned: "+(payment-5.60));
        cash.addCash(payment-5.60);
        }
    }
        if(payment<5.60){
            System.out.println("Insufficient payment.");
        }

    }
    //paying with card
    public void eatAffordably(BetterPaymentCard userCard)
    {
        
        if(userCard.balance()>=2.40){
            userCard.withdraw(2.40);
        //this.balance+=2.40;
        this.affordableMealStocked--;
        this.totalCost+=2.40;

        
    }
        else if(userCard.balance()<2.40){
            System.out.println("Insufficient payment.");
        }

    }
   
    public void eatHeartily(BetterPaymentCard userCard)
    {
        if(userCard.balance()>=5.60){
        userCard.withdraw(5.60);
        //this.balance+=5.60;
        this.heartyMealsStocked--;
        this.totalCost+=5.60;
        
    }
        else if(userCard.balance()<5.60){
            System.out.println("Insufficient payment.");
        }

    }
    public void displayStock()
    {
        System.out.println("Hearty Meals Available: "+this.heartyMealsStocked);
        System.out.println("Affordable Meals Available: "+this.affordableMealStocked);
        
    }
    public void addMoneyToCard(BetterPaymentCard userCard, double amount)
    {
        userCard.addMoney(amount);
    }
    public String toString()
    {
        return "Total Cost: "+this.totalCost +", Hearty Meals Available: "+this.heartyMealsStocked+", Affordable Meals Available: "+this.affordableMealStocked;
    }


    
}
