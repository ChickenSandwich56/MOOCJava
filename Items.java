public class Items {
    private String name;
    public Items(String itemName)
    {
        this.name = itemName;
    }
    public String toString()
    {
        return "New item: '"+this.name+"'";
    }

}
