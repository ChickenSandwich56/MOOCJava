public class Item {

    private String name;
    private String identifier;

    public Item(String itemName, String itemIdentifier)
    {
        this.name = itemName;
        this.identifier = itemIdentifier;
    }
    public String toString()
    {
        return this.identifier+": "+ this.name;
    }
    public boolean equals(Object theObject)
    {
        if(this == theObject)
        {
            return true;
        }
        if(!(theObject instanceof Item))
        {
            return false;
        }

        Item comparedItem = (Item) theObject;
        if(this.name.equals(comparedItem.name)&&this.identifier.equals(comparedItem.identifier)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
