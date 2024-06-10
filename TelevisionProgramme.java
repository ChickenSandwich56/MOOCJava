public class TelevisionProgramme {

    private String name;
    private int duration;
    private int hourCount;

    public TelevisionProgramme(String pName, int pDuration)
    {
        this.name = pName;
        this.duration = pDuration;
    }

    public String toString(){
        //if(this.duration<60){
        return this.name +", "+ this.duration +" minutes";
        //}
        
        //else return this.name+ ", "+ this.hourCount+" hours, "+(this.duration-(60*hourCount)) + " minutes";

    }
    
}
