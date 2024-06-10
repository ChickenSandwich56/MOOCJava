public class Counter {

    private int value;

    public Counter(int initialValue)
    {
        this.value = initialValue;
    }

    public void printCounter()
    {
        System.out.println("Count value: "+this.value);
    }
    public void decrementCounter()
    {
        if(this.value >0){
        this.value = this.value-1;
        }
        else{
            System.out.println("Counter cannot be a negative number.");
        }
    }
    public void resetCounter()
    {
        this.value = 0;
        System.out.println("Counter reset to "+this.value);

    }
    
}
