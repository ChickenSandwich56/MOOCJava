public class Statistics {
    private int count;
    private double sum;
    private double oddSum;
    private double evenSum;

    public Statistics(){

    }
    public void addNumber(int number){
        this.sum+=number;
       
        count++;
       /*  if(number % 2 == 0)
        {
            this.evenSum+=number;
        }
        this.oddSum+= number;*/
    }
    public int getCount(){
        return this.count;
    }
    public double average(){
        return (this.sum*1.0)/this.getCount();

    }
    public double sum(){

        return this.sum;

    }
    public double oddSum()
    {
        return this.oddSum();

    }
    public double evenSum(){
        return this.evenSum();

    }
    
}
