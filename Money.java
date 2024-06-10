public class Money {

    private int euros;
    private int cents;

    public Money( int euros, int cents)
    {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros()
    {
        return euros;
    }
    public int cents()
    {
        return cents;
    }
    public String toString()
    {
        String zero = "";
        if(cents<=10)
        {
            zero = "0";
        }
        return euros + "."+zero+cents+ "e";
    }
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);

        return newMoney;
    }
    public Money minus(Money subtraction)
    {
        Money newMoney = new Money(this.euros - subtraction.euros , this.cents - subtraction.cents);
        return newMoney;
    }

    public boolean lessThan(Money comparedMoney)
    {
        if(this.cents < comparedMoney.cents)
        {
            
            return true;
        }
        if(this.cents == comparedMoney.cents && this.euros< comparedMoney.euros){
            
            return true;

        }
        else{
            
        return false;
        }
    }
    
}
