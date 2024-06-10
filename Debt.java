public class Debt {
    private double balance;
    private double interestRate;
    private double years;

    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
        
    }

    public void printBalance(){
        System.out.println("Your initial balance: £"+this.balance+ " at a fixed rate of: "+this.interestRate+"%");
    }
    public void waitOneYear(){
        
        this.balance=this.balance*this.interestRate;
        System.out.println("Your total debt after 1 year: £"+this.balance);

    }
    public void waitMultipleYears(double howManyYears)
    {

        this.years = howManyYears;
        for(int i = 0;i<howManyYears;i++)
        {
            this.balance=this.balance*this.interestRate;
        }
        System.out.println("Your total debt after "+howManyYears+" years: £"+this.balance);
        
    }
}
