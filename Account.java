public class Account {
    String name;
    int balance;
     
    public Account(String name, int balance){
        
        this.name = name;
        this.balance = balance;
        
    
    }

    public int deposit(int depositAmount)
        {
            balance = balance+depositAmount;
            return balance;
        }
        public int withdraw(int withdrawAmount)
        {
            balance = balance-withdrawAmount;
            return balance;
        }
        public int balance(int balance)
        {
            return balance;
        }

    
}
