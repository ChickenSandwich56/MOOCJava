public class HealthStation{

    private int patientWeight; 
    private int weighingCount;
    

    public int weigh(Person person)
    {
        this.weighingCount++;
        return person.getWeight();
        
        

    }
    public int weighings()
    {
        return this.weighingCount;
    }
    public void feed(Person person)
    {   
       person.increaseWeight();
       
    }

}