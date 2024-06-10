public class Timer {
    private TimerHand hundredthSecondTimerHand;
    private TimerHand secondTimerHand;

    public Timer()
    {
        this.hundredthSecondTimerHand = new TimerHand(100);
        this.secondTimerHand = new TimerHand(60);
    }

    public void advance()
    {
        this.hundredthSecondTimerHand.advance();
        if(this.hundredthSecondTimerHand.value()==0)
        {
            this.secondTimerHand.advance();
            
        }
    }

    public String toString()
    {
        return "milliseconds: "+this.hundredthSecondTimerHand+" seconds: "+this.secondTimerHand;
    }
}
