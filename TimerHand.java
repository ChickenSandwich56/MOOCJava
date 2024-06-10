public class TimerHand{
    private int limit;
    private int value;

    public TimerHand(int timerLimit){
        this.value = 0;
        this.limit = timerLimit;
    }

    public void advance()
    {
        this.value = this.value + 1;
        if(this.value>=this.limit)
        {
            this.value = 0;
        }
    }

    public int value()
    {
        return this.value;
    }
    public String toString()
    {
        if(this.value < 10)
        {
            return "0"+this.value;
        }
        return "" + this.value; 
    }
}