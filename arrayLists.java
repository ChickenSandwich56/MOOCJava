import java.util.ArrayList;
import java.util.Scanner;
public class arrayLists {

    /* public static void printNumbersInRange(ArrayList<Integer>numbers, int upperLimit, int lowerLimit)
    {
        
        for(int i =0;i< numbers.size();i++){

        if(numbers.get(i)>lowerLimit && numbers.get(i)<upperLimit)
        {

            System.out.println(numbers.get(i));
            System.out.println("The numbers in the range "+"["+lowerLimit+", "+upperLimit+"] ---- "+numbers.get(i));
            
        }
        
        
        }
        
    }
    public static void main(String[] args){

    ArrayList<Integer> sumList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    ArrayList<String> nameList = new ArrayList<>();

    ArrayList<Integer> nums = new ArrayList<>();
    System.out.println("Please enter the number of values you wish to use");
    int numsSize = Integer.valueOf(scanner.nextLine());
    System.out.println("Please enter values");
    
    for(int i =0;i<numsSize;i++){

        int addNum = Integer.valueOf(scanner.nextLine());
        nums.add(addNum);
        sum = sum+addNum;

    }
    double average = 1.0*(Double.valueOf(sum))/(Double.valueOf(numsSize));
    System.out.println("Total value: "+sum);
    System.out.println("Average "+ average);
    System.out.println("Please enter the lower range");
    int lowerRange = Integer.valueOf(scanner.nextLine());
    System.out.println("Please enter the upper range");
    int upperRange=Integer.valueOf(scanner.nextLine());
    printNumbersInRange(nums, upperRange, lowerRange); */



   /*  System.out.println("Please enter length of list");
    int listLength = Integer.valueOf(scanner.nextLine());
    System.out.println("Please enter names");
    
    

    for(int i = 0;i<listLength;i++)
    {
        String enterNames = scanner.nextLine();
        nameList.add(enterNames);
        
    }
    System.out.println("Here are your numbers: ");
    for(int i = 0; i<listLength;i++)
    {
        System.out.println(nameList.get(i));
    }
    System.out.println("Press 9 to search for a name");
    int searchNum = Integer.valueOf(scanner.nextLine());
    String searchName;
    if(searchNum == 9)
    {
        System.out.println("Please enter a name to search for");
        searchName = scanner.nextLine();
        for(int i = 0;i<listLength;i++)
        {
            if(searchName.equals(nameList.get(i))){
            System.out.println("Name found at position: "+i);
            }
        }
        

    } */




    
   /*  System.out.println("Please specify the length of your list");
    int listLength = Integer.valueOf(scanner.nextLine());
    System.out.println("Please enter numbers into the list");
    
    for(int length = 0;length<listLength;length++)
    {
        int newNums = Integer.valueOf(scanner.nextLine());
        sumList.add(newNums);
        sum+=newNums;
        System.out.println("You've entered: " + newNums);
        
    }
    int average = (sum/listLength+1);
    System.out.println("Total:"+sum);
    System.out.println("Average:"+average);
    */
   // } 
    
}
