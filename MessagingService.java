import java.util.ArrayList;

public class MessagingService {

    private ArrayList<String> messages;
    private boolean continueMessage;
    public MessagingService()
    {
        this.messages = new ArrayList<>();
        this.continueMessage = true;
    }

    public void addMessages(String message)
    {

        if(message.length()>120)
        {
            System.out.println("Message cannot exceed 280 characters.");
        }
        else{
            messages.add(message);
        }
    }
    public void getMessages()
    {
        for(String message: this.messages)
        {
            System.out.println(message);
        }
    }
    
}
