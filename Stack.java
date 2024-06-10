import java.util.ArrayList;
public class Stack {
    private ArrayList<String> strings = new ArrayList<>();
    public Stack()
    {
        this.strings = new ArrayList<>();
    }
    public boolean isEmpty()
    {
        if(this.strings.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void add(String value)
    {
        this.strings.add(value);
    }
    public ArrayList<String> values()
    {
        
        return this.strings;
        
    }
    public String takeOffValue()
    {
        System.out.println("String removed from list: "+strings.getLast());
        this.strings.remove(strings.getLast());
        return "Removed.";
        
        
    }

}
