import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class OOPTwo {

    public static void main(String []args)
    {

        Scanner scanner = new Scanner(System.in);


        Room room = new Room();
        System.out.println("Empty Room? "+room.isEmpty());

        
        room.addPerson(new Person("Leah", 22, 140, 165));
        room.addPerson(new Person("Blaire", 32, 120, 145));
        room.addPerson(new Person("Cain", 41, 180, 175));
        room.addPerson(new Person("Niamh", 29, 132, 159));
        room.addPerson(new Person("Joe", 34, 190, 184));

        System.out.println("Empty Room? "+room.isEmpty());
        for(Person person: room.getPeople()){
        System.out.println(person);
        }

        //System.out.println(room.shortest());
        room.take(room.shortest());
        for(Person person: room.getPeople())
        {
            System.out.println(person);
        }

        /* SimpleCollection simpleCollection = new SimpleCollection();
        simpleCollection.add("Nibbles");
        simpleCollection.add("Toffee");
        simpleCollection.add("Jamwaaa");
        simpleCollection.add("Omwaaa");
        
        System.out.println(simpleCollection.longestName()); */
        
        /* Gift gift1 = new Gift("Cadbury dairy milk", 1);
        Gift gift2 = new Gift("Cumberland Sausages", 4);
        Gift gift3 = new Gift("Fanta Multipack",2);

        System.out.println(gift1.toString());
        System.out.println(gift2.toString());
        System.out.println(gift3.toString());
        Package giftPackage = new Package();
        giftPackage.addGift(gift1);
        giftPackage.addGift(gift2);
        giftPackage.addGift(gift3);
        System.out.println(giftPackage.toString()); */
        
        
        /* SimpleCollection list = new SimpleCollection();

        System.out.println(list);

        list.add("Hi");
        System.out.println(list);
        list.add("Bye");
        System.out.println(list);
        list.add("Goodnight");

        System.out.println(list); */



        
       /*  MessagingService messagingService = new MessagingService();

         messagingService.addMessages("Hi");
        messagingService.addMessages("Hi");
        messagingService.addMessages("Why won't you talk to me?");
        messagingService.addMessages("I'm a nice guy");
        messagingService.addMessages("Fine fuck you bitch");
        messagingService.addMessages("Hihhhhhhhhhhskjafkjsdjkasdkjsahdjkhsadhksahdkhsakjdhasjhdjkhsakdhsakjdhkshfkjhaskjdhasjkhdkjhasdkjhhfjkhsshdskjahdhsjahdkjhsakjfhskjhdkjhaskjhdkajhsjkhsafjhsjahdshakhdsjahdjhsajdhjkashfhuwhfjkbjskaudwhdbksjabkjbsudkjbdkjasudhwjkbjksbabwduwibdkjsb");
        messagingService.getMessages(); */

       /*  Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        stack.add("value");
        stack.add("chocolate");
        stack.add("cookie");
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        
        String remove = stack.takeOffValue();
        System.out.println(remove);
        System.out.println(stack.values()); */

        


       /* Menu menu = new Menu();
       menu.addMeal("Chocolate Sundae");
       menu.addMeal("Sausage Casserole");
       menu.addMeal("Chocolate Sundae");
       menu.addMeal("Sausage Casserole");
       menu.addMeal("Bacon and Eggs");
       menu.addMeal("Seafood Stirfry");

       menu.printMeals();
       menu.clearMenu();

       System.out.println();
       menu.addMeal("Tomato and Mozarella Salad");
       menu.printMeals(); */


       
       
        /*  Money money = new Money(50, 25);
        Money money2 = new Money(34,22);
        System.out.println("Money Object 1: "+money.toString());
        System.out.println("Money Object 2: "+money2.toString());
        Money money3 = money.plus(money2);
        System.out.println("Money1 + Money2 Objects: "+ money3.toString());
        System.out.println(money.lessThan(money3));
        System.out.println(money3.lessThan(money));
        System.out.println("Money3 - Money1 Object: " + money3.minus(money)); */




       /*  SimpleDate date = new SimpleDate(12, 12, 2023);

        System.out.println("Current date: "+ date.toString());

        System.out.println("Advancing date by one day, using .advance()");

        date.advance();

        System.out.println("New Date: "+ date.toString());

        System.out.println("Adavancing date by 18 days using overloaded .advance(int days) method");

        date.advance(18);

        System.out.println("New Date: "+ date.toString());

        System.out.println("Advancing date by 40 days using afterHowManyDays() method which returns a SimpleDate Object");

        SimpleDate laterDate = date.afterNumberOfDays(40);
        

        System.out.println("New Date: "+ laterDate.toString());

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
    
            week = week + 1;
        } */
    

        /* ArrayList<Item> items = new ArrayList<>();

        System.out.println("How many items do you wish to add?");
        int numOfItems = Integer.valueOf(scanner.nextLine());
        while(true){
            for(int i = 0;i<numOfItems;i++){
                
        System.out.println("Item?");
        String itemInput = scanner.nextLine();
        System.out.println("Identifier?");
        String identifier = scanner.nextLine();

        Item item = new Item(itemInput, identifier);
        
                
        
        if(items.contains(item)){
            System.out.println("Item Already Added");
        }
        else{
        
            items.add(item);
        }
        
                
            }

        System.out.println("Press 's' to view item list.");

        String input = scanner.nextLine();

        if(input.equals("s"))
        {
            System.out.println("===Items===");
            for(int i =0;i<items.size();i++)
            {
                
                System.out.println(items.get(i).toString());
                
            }
        }
        if(input.equals(" "))
        {
            System.out.println("Programme ending...");
            break;
        }
    } */



        /* ArrayList<Book> books = new ArrayList<>();
        boolean areBooksSame = false;
        System.out.println("Press S to start");
        String viewBooks = scanner.nextLine();

        if(viewBooks.equals("s")|| viewBooks.equals("S"))
                            {

        
        while(true){
            
        System.out.println("Book Name (Empty will stop): ");
        String bookName = scanner.nextLine();
        if(bookName.equals(" "))
        {
            System.out.println("Programme Ending...");
            break;
        }
        System.out.println("Publication Year (0 will stop): ");
        int publicationYear = Integer.valueOf(scanner.nextLine());
        System.out.println("Page Count (0 will stop): ");
        int bookPages = Integer.valueOf(scanner.nextLine());
        Book book = new Book(bookName, bookPages, publicationYear);    
                                
                                    if(books.contains(book))
                                    {
                                        
                                        
                                        System.out.println("These books are the same...");
                                        System.out.println(books.size());
                                        
                                        
                                        
                                    }
                                    else{
                                        System.out.println("Book added to list");
            
                                        books.add(book);
                                        System.out.println("Total Books Added: "+books.size());
                                    }
                                    
                            
                            
                            
        
            
            

                            System.out.println("Press 'I' to view book list, Press 'Enter' to add more books, press 'E' to end");
                            viewBooks = scanner.nextLine();
                            if(viewBooks.equals("i")|| viewBooks.equals("I"))
                            {
                                for(int i = 0;i<books.size();i++)
                                {
                                    System.out.println(books.get(i));
                                }
                            }
                            if(viewBooks.equals("e")|| viewBooks.equals("E"))
                            {
                                System.out.println("Programme Ending...");
                                break;
                            }
            
        
        }
    } */
        /* SimpleDate daveDOB = new SimpleDate(9, 7, 1987);
        SimpleDate steveDOB = new SimpleDate(5, 7, 1995);

        Person dave = new Person("Dave", daveDOB, 80, 179);
        Person steve = new Person("Steve", steveDOB, 89, 183);

        if(dave.equals(steve))
        {
            System.out.println("Are you twins?");
        }
        else{
            System.out.println("You're definitely different people");
        }
        Person daveClone = new Person("Dave", daveDOB, 80, 179);
        if(dave.equals(daveClone))
        {
            System.out.println("How is this possible?!");
        }
        else{
            System.out.println("You're definitely different people");
        } */
        

        /* song newSong = new song("Babydoll", "Ari Abdul", 135);
        song newSong1 = new song("Babydoll", "Ari Abdul", 135);

        if(newSong.equals(newSong1))
        {
            System.out.println("Songs are the same");
        }
        if(!(newSong.equals(newSong1)))
        {
            System.out.println("The songs aren't the same");
        } */

        /* Apartment apartmentOne = new Apartment(3, 55, 125);
        Apartment apartmentTwo = new Apartment(2, 25, 154);
        System.out.println("Price difference: Apartment Two vs Apartment One £"+ apartmentTwo.priceDifference(apartmentOne));

        System.out.println("Apartment One larger than Apartment Two? "+apartmentOne.largerThanOtherApartment(apartmentTwo));
 */
        /* Pet barry = new Pet("Barry", "Belgian Malinois", 3);
        Person Steve = new Person("Steve", barry, 32);
        System.out.println(Steve); */

       /*  BetterPaymentCard petesCard = new BetterPaymentCard(30);
        CashBalance petesCash = new CashBalance(13);
         
         System.out.println("Successfully withdrawn? "+ petesCard.withdraw(45));
         System.out.println("Successfully withdrawn? "+ petesCard.withdraw(25));
         petesCard.addMoney(21);
         System.out.println(petesCard.balance());
         PaymentTerminal payTerminal = new PaymentTerminal(400, 32, 21);
         payTerminal.displayStock();
         payTerminal.eatAffordably(petesCard);
         payTerminal.eatHeartily(petesCard);
         payTerminal.eatHeartily(petesCash, 10);
         System.out.println(petesCard.toString());
         payTerminal.addMoneyToCard(petesCard, 12);
         payTerminal.displayStock();
         payTerminal.eatAffordably(petesCard);
         System.out.println(payTerminal.toString());
         System.out.println("Pete's "+petesCard.toString());
         System.out.println("Pete's "+petesCash.toString()); */

        /* HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 7, 110);
        Person peter = new Person("Peter", 33, 85, 176);

        System.out.println(ethan.getName() + "weight: "+ childrensHospital.weigh(ethan)+ " kilos");
        System.out.println(peter.getName() + "weight: "+ childrensHospital.weigh(peter)+ " kilos");

        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);

        System.out.println(ethan.getName() + "weight: "+ childrensHospital.weigh(ethan)+ " kilos");
        System.out.println(peter.getName() + "weight: "+ childrensHospital.weigh(peter)+ " kilos");

        System.out.println("Number of weighings that have taken place: "+childrensHospital.weighings()); */

        /* BuildingProducts products = new BuildingProducts("Tape Measure");
        BuildingProducts products1 = new BuildingProducts("Plaster", "Home Improvement Section");
        BuildingProducts products2 = new BuildingProducts("Tyre", 5);
        
        System.out.println(products.toString());
        System.out.println(products1.toString());
        System.out.println(products2.toString()); */

        // double heartRatePercentage = 0.5;

        // Fitbyte assistant = new Fitbyte(30, 60);
        // while(heartRatePercentage<1.0)
        // {
        //     double target = assistant.targetHeartRate(heartRatePercentage);
        //     System.out.println("Target " + (heartRatePercentage*100) + "% of maximum: "+ target);
        //     heartRatePercentage+=0.1;
        // }
        

        //Cube cube = new Cube(5);
        //System.out.println(cube.toString());
        
       // BookClass book = new BookClass("JK Rowling", "Harry Potter and the Philosopher's Stone", 223);
        //System.out.println(book.toString());
        /* Timer timer = new Timer();
        while(true)
        {
            System.out.println(timer);
            timer.advance();
            try{
                Thread.sleep(10);

            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        } */
        
    }
    
}
