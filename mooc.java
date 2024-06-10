import java.util.ArrayList;
import java.util.Scanner;
public class mooc {

    public static void main(String[] args){
        //scanner to allow for user input
        Scanner scanner = new Scanner(System.in);
        //ArrayList to store names
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> reverseNumList = new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        int newNum = 0;
        //int i =0;

        System.out.println("Please enter the quantity of numbers you wish to use" + "press -1 to exit");
        int numLimit = Integer.valueOf(scanner.nextLine());
        System.out.println("Please enter numbers into the list!" + "press -1 to exit");
        int index = 0;
        int i =0;
        int greatestNum = 0;
        int lowestNum = 0;
        
        
      
        while (index <numLimit){
            

            newNum = Integer.valueOf(scanner.nextLine());
            System.out.println("You've entered: "+newNum);
            numList.add(newNum);

            index++;
            
            


        }
        System.out.println("Your numbers are: ");
        for(i =0;i<numList.size();i++)
        {
            System.out.println(numList.get(i));
        }
        System.out.println("Enter from which index you wish to display your list");
        i = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter to which index you want to display until");
        int upperLim = Integer.valueOf(scanner.nextLine());
        
        if(i>=upperLim){
            System.out.println("ERROR, lower limit cannot exceed than upper limit");
            
        }
        if(upperLim>= numList.size())
        {
            System.out.println("ERROR upperLim cannot exceed list size");
        }
        System.out.println("The items between index "+i+" and "+upperLim +" are: ");

        while(i<=upperLim)
        {
            
            System.out.println(numList.get(i));
            if(greatestNum < numList.get(i))
            {
                greatestNum = numList.get(i);
            }
           
            i++;
            

        }
        int lowerLim = numList.get(0);
        System.out.println("The highest number in the list: "+greatestNum);
        for(i =0;i<numList.size();i++)
        {
            
            lowestNum = numList.get(i);   
           
            if(lowestNum > lowerLim)
            {
                lowestNum = lowerLim;
            }
            if(lowestNum == numList.get(i))
            {
                System.out.println("The lowest number in the list: "+lowestNum + " found at index: "+i);
            }
            

            

        }
        
        

        System.out.println("Enter 9 to search for a number");
        int searchOption = Integer.valueOf(scanner.nextLine());
        int searchNum;
        int searchNumIndex=0;
        int foundCounter = 0;
        if(searchOption == 9){
            System.out.println("Enter the number you wish to search for: ");
            searchNum = Integer.valueOf(scanner.nextLine());
            for(searchNumIndex=0;searchNumIndex<numList.size();searchNumIndex++)
            {
                if(searchNum == numList.get(searchNumIndex))
                {
                    System.out.println("Number "+searchNum+" has been found at position "+searchNumIndex);
                    foundCounter++;
                }
            }
            
            System.out.println("Number: " +searchNum+ " has been found "+foundCounter+ " times");
        }
        System.out.println("Programme Ending.");
        
        
        
        
        
        
        
         
       

       
        
       /*  System.out.println("Please enter names, enter 0 to leave");
        String newName = scanner.nextLine();
        int index = 0;
        
        while(!newName.equals("0"))
        {
            
            
        
        lastNameList.add(newName);
        newName = scanner.nextLine();
        if(newName.equals("0"))
        {
            
            System.out.println("Programme ending.");
            System.out.println("The first name you added: "+(lastNameList.get(0))+" The final name you added: "+(lastNameList.get(index)));
            break;
        }
        index++;
        }*/
        

        /* reverseNumList.add(1);
        reverseNumList.add(2);
        reverseNumList.add(3);
        reverseNumList.add(4);
        reverseNumList.add(5);

        for(int index=reverseNumList.size()-1;index>=0;index--)
        {
            System.out.println(reverseNumList.get(index));
        }
         */
        /*int numLimit = 0;
        System.out.println("Please enter up to 5 numbers");
        while(numLimit<5)
        {
            int newNum = Integer.valueOf(scanner.nextLine());
            numList.add(newNum);
            numLimit++;
        }
        int listSize = numList.size();
       /*  if(numLimit>numList.size())
        {
            throw new IndexOutOfBoundsException("Index "+numLimit+" is out of bounds!");
        }
        int sum = numList.get(2) + numList.get(3);
        System.out.println("You've reached the number limit!");
        System.out.println("The sum of the 2nd and 3rd numbers is: "+ sum);
        System.out.println("Total Number of names: "+listSize);*/
       


        //introducing a limit to the number of names that can be added to list
       /*  int nameLimit = 0;
        System.out.println("Please input names into the list. Enter 'bye' to end the programme");
        

        while(nameLimit <5){
        
        //User inputted Names are added to the string variable
        String newNames = scanner.nextLine();
        //ArrayList stores the user's inputted names
        nameList.add(newNames);

        
        

       
        if(nameLimit<3 && newNames.equals("bye"))
        {
            System.out.println("Programme ended.");
            break;
            
        }
        System.out.println("You've added a new name: "+newNames);
        nameLimit++;
        
        }
        
        System.out.println("Name Limit Reached!, Here is the third name in the list: "+ nameList.get(3));

        

*/
    }

}
