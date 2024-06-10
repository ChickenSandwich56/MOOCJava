import java.util.ArrayList;
import java.util.Scanner;



public class arrayLists3 {

    public static int sum(ArrayList <Integer> numbers )
    {
        int sum = 0;
        
        
        for(int i = 0;i<numbers.size();i++){
            
            
            sum = sum + numbers.get(i);

        }

        

        return sum;

    }
    public static String removeEnd(ArrayList <String> wordList)
    {
       
        return  wordList.removeLast();
    }

    
    public static void main(String []args){

    

    Scanner scanner = new Scanner(System.in);
    ArrayList <String> nameList = new ArrayList();
    ArrayList<Integer> sumOfNumbers = new ArrayList();
    ArrayList<String> someWords = new ArrayList();

    someWords.add("Hi");
    someWords.add("Bye");
    someWords.add("Goodbye");
    
    removeEnd(someWords);
    removeEnd(someWords);
    System.out.println(someWords);
    sumOfNumbers.add(4);
    sumOfNumbers.add(44);
    sumOfNumbers.add(7);
    sumOfNumbers.add(23);

    System.out.println(sum(sumOfNumbers));

    System.out.println("Please enter the number of names you wish to use");
    int nameLimit = Integer.valueOf(scanner.nextLine());
    for(int i =0;i<nameLimit;i++){
        String names = scanner.nextLine();
        nameList.add(names);
    }
    System.out.println("Names are printed below:");
    for(int i =0;i<nameLimit;i++){
        System.out.println(nameList.get(i));
    }
    
    System.out.println("Press 9 to search for a name");
    int searchNum = Integer.valueOf(scanner.nextLine());
    if(searchNum == 9)
    {
        System.out.println("Please enter a name to search for");
        String searchName = scanner.nextLine();
        if(nameList.contains(searchName))
        {
            System.out.println("Name: "+searchName+" Found!" +"at position "+nameList.indexOf(searchName));
            //System.out.println("Press 9 to Search Again");
            //searchNum = Integer.valueOf(scanner.nextLine());
        }
    }


    }
    
    
}
