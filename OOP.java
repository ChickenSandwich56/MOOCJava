import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class OOP{


    public static void main(String args[])
    {
        
        Scanner scanner1 = new Scanner(System.in);
       

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy:hh:mm:ss");
        ArrayList<Items> items = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        ArrayList<Book> Books = new ArrayList<>();
        ArrayList<String> bookNameList = new ArrayList<>();
        ArrayList<Integer> pageCountList = new ArrayList<>();
        ArrayList<Integer> publicationYearList = new ArrayList<>();
        
        
        String bookName;
        int bookPubYear;
        int bookPageCount;

        System.out.println("Press 1 to start");
        int startNum = Integer.valueOf(scanner1.nextLine());

        if(startNum == 1)
        {
            while(true)
            {
                if(startNum == 1){
                System.out.println("Book Name: ");
                bookName = scanner1.nextLine();
                bookNameList.add(bookName);
                System.out.println("Page Count: ");
                bookPageCount = Integer.valueOf(scanner1.nextLine());
                System.out.println("Publication Year: ");
                pageCountList.add(bookPageCount);
                bookPubYear = Integer.valueOf(scanner1.nextLine());
                publicationYearList.add(bookPubYear);
        
                Book book = new Book(bookName, bookPageCount, bookPubYear);
                Books.add(book);
                
                System.out.println("Press 2 to search and display data, Press 1 to add more data, Press 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                }
                if(startNum == 0)
                {
                    System.out.println("Programme Ending...");
                    break;
                }
                if(startNum == 2)
                {
                    System.out.println("Please enter the following: ");
                    System.out.println("'everything' - to view all data ");
                    System.out.println("'name' - to view book names ");
                    System.out.println("'pages' - to view page counts ");
                    System.out.println("'date' - to view publication years ");
                    String input = scanner1.nextLine();
                    if(input.equals("everything"))
                    {
                        System.out.println("You have selected to view all book data...");
                        for(int i = 0;i<Books.size();i++)
                        {
                            System.out.println(Books.get(i));
                        }
                        System.out.println("Press 2 to search and display data, Press 1 to add more data, Press 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                    }

                    if(input.equals("name"))
                    {
                        System.out.println("You have selected to view book name data...");
                        for(int i = 0;i<bookNameList.size();i++)
                        {
                            System.out.println(bookNameList.get(i));
                        }
                        System.out.println("Press 2 to search and display data, Press 1 to add more data, Press 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                    }

                    if(input.equals("date"))
                    {
                        System.out.println("You have selected to view book publication data...");
                        for(int i = 0;i<publicationYearList.size();i++)
                        {
                            System.out.println(publicationYearList.get(i));
                        }
                        System.out.println("Press 2 to search and display data, Press 1 to add more data, Press 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                    }
                    if(input.equals("pages"))
                    {
                        System.out.println("You have selected to view book page count data...");
                        for(int i = 0;i<pageCountList.size();i++)
                        {
                            System.out.println(pageCountList.get(i));
                        }
                        System.out.println("Press 2 to search and display data, Press 1 to add more data, Press 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                    }
                    
                }
                continue;

            }

        }


        

        

      


    }

}


  /* String tvName;
        int tvDuration;
        ArrayList<TelevisionProgramme> tvPrograms = new ArrayList<>();
        System.out.println("Press 1 to start");
        int startNum = Integer.valueOf(scanner1.nextLine());
        if(startNum == 1)
        {
            System.out.println("Please enter maximum programme duration.");
            int durationLim = Integer.valueOf(scanner1.nextLine());
            while(true){
                System.out.print("Programme Name: ");
                tvName = scanner1.nextLine();
                System.out.print("Programme Duration: ");
                tvDuration = Integer.valueOf(scanner1.nextLine());
                
                TelevisionProgramme tvProgram = new TelevisionProgramme(tvName, tvDuration);
                if(tvDuration<durationLim){
                tvPrograms.add(tvProgram);
                }
                System.out.println("Press 1 to add more data, 0 to exit");
                startNum = Integer.valueOf(scanner1.nextLine());
                if(startNum == 0)
                {
                    System.out.println("Programme Ending...");
                    //System.out.println("TV programmes you entered:");
                    System.out.println("Programmes under " + durationLim + " Minutes: ");
                    
                    
                    
                    for(int i = 0;i<tvPrograms.size();i++)
                    {
                        
                        
                        
                        System.out.println( tvPrograms.get(i));
                        
                    }
                
                    break;
                }

            }
        } */

        
        
         /*  String enterFirstName ;
        String enterLastName ;
        int pInfo ;
        ArrayList<PersonalInformationCollection> pICList = new ArrayList<>();
        System.out.println("Please press 1 to start");
        int option = Integer.valueOf(scanner1.nextLine());
        if(option == 1)
        {
            while(true){
                System.out.println("First Name: ");
                enterFirstName = scanner1.nextLine();
                System.out.println("Second Name: ");
                enterLastName = scanner1.nextLine();
                System.out.println("Identification Number: ");
                pInfo = Integer.valueOf(scanner1.nextLine());

                PersonalInformationCollection pInfoColl = new PersonalInformationCollection(enterFirstName, enterLastName, pInfo);
                pICList.add(pInfoColl);

                System.out.println("Press 1 to enter more data, 0 to exit.");
                option = Integer.valueOf(scanner1.nextLine());
                if(option == 0){
                    System.out.println("Programme Ending...");
                    System.out.println("Your Data is below:");
                    for(int i = 0;i<pICList.size();i++)
                    {
                        
                       System.out.println( pICList.get(i));
                    }
                    break;
                }
            }

        }
 */
        //System.out.println(pIC.toString());

        
/* while(true){
            System.out.println("Please enter an item name");
            String name = scanner1.nextLine();
            if(name.isEmpty() || name.equals(" ")){
                System.out.println("Empty string entered, programme ending");
                break;
                }
            Items item = new Items(name);
            System.out.println(item.toString());
            
            items.add(item);
            
        }
        for(int i = 0; i<items.size();i++)
        {
            System.out.println(items.get(i) + "created at: ("+dtf.format(now)+")");
        } */
        

 // Gauge gauge = new Gauge();
        // Agent agent = new Agent("James", "Bond");
        // Agent agent2 = new Agent("Jamie", "Bond");
        // Multiplier multiplier = new Multiplier(5);

        /* Statistics counter = new Statistics();
        Statistics oddSum = new Statistics();
        Statistics evenSum = new Statistics();
        int num = 0;
        int oddTotal = 0;
        int evenTotal = 0;

        System.out.println("Please enter numbers to generate some statistics.");
        System.out.println("Please enter -1 to exit.");
        while(num !=-1){
         num = Integer.valueOf(scanner1.nextLine());
         System.out.println("Number added: "+num);
         counter.addNumber(num);
         
         if(num%2==0){
            evenSum.addNumber(num);
         }
         if(num%2>0){
         oddSum.addNumber(num);
         }

        }
        System.out.println("-1 has been entered: programme wil end.");
        System.out.println("Here are some statistics regarding the numbers you entered: ");
        System.out.println("You entered: "+counter.getCount()+" numbers into the programme.");
        System.out.println("Current total: " + counter.sum());
        System.out.println("Current total of odd numbers: " + oddSum.sum());
        System.out.println("Current total of even numbers: " + evenSum.sum());
        System.out.println("Current average: " + counter.average()); */



        /* counter.addNumber(4);
        counter.addNumber(9);
        counter.addNumber(2);
        counter.addNumber(6);
        System.out.println("Current count: "+counter.getCount());
        System.out.println("Current total " + counter.sum());
        System.out.println("Current average " + counter.average());

        counter.addNumber(6);
        counter.addNumber(6);
        counter.addNumber(6);

        System.out.println("Current count: "+counter.getCount());
        System.out.println("Current total " + counter.sum());
        System.out.println("Current average " + counter.average()); */



        /* System.out.println("Multiply 5 by 6... "+multiplier.multiply(6));

        System.out.println("The name is Bond. "+agent);
        System.out.println("Buuuut my alter-ego is.... " +agent2);

        while(!gauge.isFull())
        {
            gauge.increase();
            System.out.println("Gauge Level: "+gauge.value());
            
        }
        gauge.increase(); */

        /* Film film1 = new Film("Toy Story 2", 3);

        System.out.println("Please enter your age.");
        
        int customerAge  = Integer.valueOf(scanner1.nextLine());

        if(customerAge<film1.ratingOfFilm())
        {
            System.out.println("You're too young to view this film.");
        }
        else{
            System.out.println("Enjoy the film!");
        } */

         //song song1 = new song("The Greatest", 25611);

        //System.out.println("Song name: "+song1.name()+"Length: "+ song1.length()); 

        /* Debt newDebt = new Debt(500.45, 1.15);

        newDebt.printBalance();
        newDebt.waitOneYear();
        newDebt.waitMultipleYears(22);
        newDebt.printBalance(); */


      


       
   


  /* Counter counter1 = new Counter(2);
        counter1.printCounter();
        counter1.decrementCounter();
        counter1.printCounter();
        counter1.decrementCounter();
        counter1.printCounter();
        counter1.decrementCounter();
        counter1.resetCounter();
        counter1.printCounter();

        Product chicken = new Product("Chicken", 5, 11);
        chicken.printProduct();

        Door door1 = new Door();
        door1.knockKnock();
        door1.knockKnock();

        Whistle duckWhistle = new Whistle("Quaaack");
        Whistle roosterWhistle = new Whistle("Baakkwwaaaa");
        roosterWhistle.makeSound();
        duckWhistle.makeSound();
        roosterWhistle.makeSound();

        Account myAccount = new Account("Personal Account", 0);
        Account matthewsAccount = new Account("Matthew's Account", 1000);

        System.out.println("Matthew's Account balance: £"+matthewsAccount.balance);
        System.out.println("My Account Balance: £"+ myAccount.balance);

        System.out.println("Matthew will withdraw £100");
        matthewsAccount.withdraw(100);
        System.out.println("Matthew will transfer £100 to my account.");
        myAccount.deposit(100);

        System.out.println("Final balance, Matthew's Account: £"+ matthewsAccount.balance);
        System.out.println("Final Balance, my Account: £" + myAccount.balance); */

 /* Account omarAccount = new Account("Omar's Account", 100);

        System.out.println("Initial State: "+omarAccount);
        System.out.println("Initial Balance: "+omarAccount.balance);
        System.out.println("Depositing £20 to Omar's Checking Account");
        omarAccount.deposit(20);
        System.out.println("New balance: "+omarAccount.balance);
        System.out.println("End State: "+omarAccount); */

        /* public class Song {

    private String songName;
    private int songLength;

    public Song(String initialName, int initialLength)
    {
            this.songName = initialName;
            this.songLength = initialLength;
    }

    public String name()
    {
        return this.songName;
    }
    public int length()
    {
        return this.songLength;
    }
    
} */
/* PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul's card balance: "+paulsCard.toString());
        System.out.println("Matt's card balance: "+mattsCard.toString());
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul's card balance: "+paulsCard.toString());
        System.out.println("Matt's card balance: "+mattsCard.toString());
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul's card balance: "+paulsCard.toString());
        System.out.println("Matt's card balance: "+mattsCard.toString()); */