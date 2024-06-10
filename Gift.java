public class Gift {
    private String name;
    private int weight;
    public Gift(String giftName, int giftWeight){
        this.name = giftName;
        this.weight = giftWeight;

    }
    public String getName(){
        return this.name;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public String toString(){
        return"Gift: "+this.getName()+" ("+this.getWeight()+"kg)";
    }
    
}
