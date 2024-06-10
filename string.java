import java.util.Scanner;
import java.util.ArrayList;

public class string {


    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter a Username");
        //String userName = scanner.nextLine();
        
        //for(int i =0;i<10;i++){
            while(true){
             //   System.out.println("How many lines of data do you wish to enter?");
           // int nameAgeLimit = Integer.valueOf(scanner.nextLine());

            System.out.println("Please enter the names and birth years, separated by a comma");

            String namesAndBirths = scanner.nextLine();
            int longestName=0;
            String longestNameName="";
            int yearSum = 0;
            double avgYear=0;

            String namesAndBirthYears[] = namesAndBirths.split(",");

                for(int i = 0;i<namesAndBirthYears.length-1;i+=2)
                {
                    if(longestName<=Integer.valueOf(namesAndBirthYears[i].length()))
                    {
                        longestName = Integer.valueOf(namesAndBirthYears[i].length());
                        longestNameName = namesAndBirthYears[i];
                    }
                }
                for(int i = 1;i<namesAndBirthYears.length;i+=2)
                {
                    yearSum = yearSum+Integer.valueOf(namesAndBirthYears[i]);


                }
                avgYear = 1.0*yearSum/(Integer.valueOf(namesAndBirthYears.length/2));

                System.out.println("Longest Name is "+longestNameName+" : " +longestName+ " letters");
                System.out.println("Average year of birth: "+ avgYear);

                if(namesAndBirths == " ")
                {
                    System.out.println("Programme will end");
                    break;
                }
                

            
            
                /* String pieces = scanner.nextLine();
               // System.out.println("Parsing data...");
                String namesAndAges[] = pieces.split(",");
            
                int highestAge = 0;
                String oldestName = "";
                
           
             for (int i = 1;i<=namesAndAges.length;i+=2){
                
                if(Integer.valueOf(namesAndAges[i])>highestAge){
                highestAge = Integer.valueOf(namesAndAges[i]);
                oldestName = namesAndAges[i-1];
                }
                
                
                
                

                //System.out.println(highestAge);

            } 
            System.out.println("The oldest person is: "+ oldestName+ " with an age of: "+ highestAge);
            
            
            
          
             */
                
            //System.out.println();

            /* if(pieces.equals(" "))
            {
                System.out.println("You entered an empty string. programme will end.");
                break;
            } */
        }
        //}
        





        /* if(!userName.equals("emma")&&!userName.equals("alex")){
            System.out.println("Username not recognised.");
        }
        if(userName.equals("alex"))
        {
            System.out.println("Please enter Password");
            String passWord = scanner.nextLine();
            if(passWord.equals("sunshine"))
            {
                System.out.println("Welcome to acme computing services!");
            }
            else{
                System.out.println("Password incorrect! Try again");
            }
        }
         


        if(userName.equals("emma"))
        {
            System.out.println("Please enter password");
            String passWord = scanner.nextLine();
            if(passWord.equals("haskell"))
            {
                System.out.println("Welcome to acme computing services!");
            }
            else{
                System.out.println("Password incorrect! Try again");
            }
        } */
         
        
        

    }
    
}
