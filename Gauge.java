public class Gauge {

    private int value;

    public Gauge()
    {
        this.value = 0;
    }

    public void increase()
    {
        if(this.value<=5){
        this.value+=1;
        }
        else{
            System.out.println("Gauge is now full!");
        }
    }
    public void decrease()
    {
        if(this.value>0){
        this.value -=1;
        }
        else{
            System.out.println("Cannot decrease guage below 0!");
        }
    }
    public int value()
    {
        return this.value;
    }
    public boolean isFull()
    {
        if(this.value>=5){
            System.out.println("Full!");
        return true;
        }
        else{
            System.out.print("Not Full! ");
            return false;
        }
    }
    
}
