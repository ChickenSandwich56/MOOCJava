public class Fitbyte {

    private int personAge;
    private int personHeartRate;

    public Fitbyte(int age, int restingHeartRate)
    {
        this.personAge = age;
        this.personHeartRate = restingHeartRate;

    }

    public double targetHeartRate(double percentageOfMaximum){
        return (((maxHeartRate())-this.personHeartRate)*(maxHeartRate()*0.75)) + this.personHeartRate;
    }

    public double maxHeartRate()
    {
        return (206.3 -(0.711*this.personAge));
    }
    
}
