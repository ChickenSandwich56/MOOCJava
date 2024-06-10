import java.util.ArrayList;
public class Package {
    ArrayList<Gift> giftList;
    private int totalWeight;
    public Package(){
        this.giftList = new ArrayList<>();

        this.totalWeight = 0;

    }
    public void addGift(Gift gift)
    {
        giftList.add(gift);
    }
    public int totalWeight()
    {
        
        for(int i = 0;i<giftList.size();i++)
        {
            totalWeight+=giftList.get(i).getWeight();
        }
        return totalWeight;
    }
    public String toString()
    {
        return "Total Weight of products: "+this.totalWeight()+"kg";
    }
    
}
