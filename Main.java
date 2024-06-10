import java.util.Scanner;
public class Main{

public static void printUntilNumber(int untilNum)
{
    for(int i = 0;i<=untilNum;i++){
        System.out.println(i);
    }
}
public static void printFromNumberToOne(int fromNum){
    while (fromNum>=0)
    {
        System.out.println(fromNum);
        fromNum--;
    }
}
public static void division(double numerator, double denominator)
{
    double result = (numerator/denominator);
    System.out.println("The result of the division of "+numerator+ " by "+ denominator+" is "+result);
}
public static void divisibleByThreeInRange(int lowerLimit, int upperLimit)
{
    int counter = 0;
    for(int i = lowerLimit;i<upperLimit;i++)
    {
        if(i%3==0)
        {
            System.out.println(i);
            counter++;
        }
    }
    System.out.println("Between numbers "+lowerLimit+ " and " + upperLimit +" there are "+ counter+" numbers that are divisible by 3.");


}
public static int numeroUno(){
    return 1;
}
public static String word()
{
 return "hallo";
}
public static int sum(int num1, int num2, int num3, int num4)
{
    return num1+num2+num3+num4;
}
public static int smaller(int num1, int num2)
{
    if(num1<num2)
    {
        
        return num1;
    }
    else
    
    return num2;
}
public static int larger(int num1, int num2, int num3)
{
    if(num1>num2&&num1> num3)
    {
        return num1;
    }
    if(num2> num1 && num2>num3)
    {
        return num2;
    }
    else
        return num3;
    
}
public static double average(int number1, int number2, int number3, int number4)
{
    double total = sum(number1,number2,number3,number4);
    return total/4;
}


public static void printRectangle(int numberAcross, int numberDown)
{
    if(numberAcross<numberDown){
        System.out.println("Width needs to be higher than Length!");
    }
    else{
    for(int y=0;y<numberDown;y++)
        {
            printSpaces(numberAcross*2);
            
    for (int i = 0;i<numberAcross-1;i++)
    {
        
        System.out.print("*");
        
            
        }
        
        System.out.println("*");
        
        
        

    }
}
}
public static void printSquare(int number)
{
    for(int y=0;y<number;y++)
        {
            
    for (int i = 0;i<number;i++)
    {
        System.out.print("*");
        
            
        }
        System.out.println("*");
        

    }
}

public static void printStars(int number)
    {
        for(int i =0; i<number;i++)
        {
            System.out.print("*" );
        }
        System.out.println("");


    }

public static void printTriangle(int number)
{
    int count = number; //introduce a count variable that is equal to the number 
    for(int i = 0;i<number;i++)
    {
    
    printStars(number- count);//for the first loop, will only print 0 stars as count is equal to star number on first iteration
    count-=1;//decrement the count each iteration, which means more stars will be printed each iteration as the count variable is taking away less from the number
    }  
    
    

}
public static void printSpaces(int amount)
{
    for(int i =0;i<amount;i++)
    {
        System.out.print(" ");
    }
}
public static void printTriangleWithSpaces(int size)
{

    int spaceCount = size;
    int count = size; //introduce a count variable that is equal to the number 
    for(int i = 0;i<=size;i++)
    {
        printSpaces(spaceCount);
    printStars(size- count);
    
    spaceCount--;
    count-=1;
    }  
    

}
public static void treeTop(int size){
    int spaceCount = size;//size of the space created is equal to the size the player inputs into method
    int count = size-1; //count reduces the amount of space generated each loop, equals size minus 1 in order to generate an odd number of stars
    for(int i = 0;i<=size;i++)
    {
        printSpaces(spaceCount);
    printStars(size- count);
    
    spaceCount--;
    count-=2;
    }  
    
}
public static void treeBase(int height, int width){

    
   
    
    printRectangle(width, height);
    

    
   /*  for (int i =0; i< height;i++)
    {
        for(int y =0;y<width;y++)
        {
            printSpaces(count);
            System.out.print("*");
        }
        printSpaces(count);
        System.out.println("*");
        
    }*/
    
}

public static void christmasTree(int height)
{
    treeTop(height);
    
    //printSpaces(height/2);
   treeBase(2, 3);
   

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    christmasTree(7);
   // printRectangle(7, 6);

    


    /*  System.out.println("Please enter the first number");
     int number1 = Integer.valueOf(scanner.nextLine());
     System.out.println("Please enter the second number");
     int number2 = Integer.valueOf(scanner.nextLine());
     System.out.println("Please enter the third number");
     int number3 = Integer.valueOf(scanner.nextLine());
     System.out.println("Please enter the fourth number");
     int number4 = Integer.valueOf(scanner.nextLine());
    
    double average = average(number1, number2, number3, number4);
    System.out.println("The Average of the numbers entered is: "+ average);*/
    
     // int whichIsGreater = larger(number1,number2,number3);
     //System.out.println("Highest Number: "+whichIsGreater);



   /*  System.err.println("Please enter the first number.");
    int firstNum = Integer.valueOf(scanner.nextLine()); 
    System.err.println("Please enter the second number.");
    int secondNum = Integer.valueOf(scanner.nextLine());
    int whichIsSmaller = smaller(firstNum,secondNum);
    System.out.println("The smaller number is: " +whichIsSmaller);*/
    //int ans = sum(1,2,3,4);
    //System.out.println("Sum: "+ans);
    //divisibleByThreeInRange(14, 29);
    //printFromNumberToOne(30);
    //printUntilNumber(15);
    //division(15, 4);

    



    /*System.out.println("Give Numbers: ");
   
    double sum=0;
    double numQuantity = 0;
    double numAverage;
    int oddNumQuantity=0;
    int evenNumQuantity = 0;
    while(true){
    int num = Integer.valueOf(scanner.nextLine());
    if(num  == -1)
    {
        System.out.println("Thx Bye!");
        break;
    }
    if(num%2==0)
    {
        evenNumQuantity++;
    }
    if(num%2!=0){
        oddNumQuantity++;
    }
    if(num!=-1)
    {
        sum+=num;
        numQuantity++;
        continue;
    }
    
    }
    numAverage = sum/numQuantity;
    System.out.println("The sum of the numbers are: "+sum);
    System.out.println("The quantity number of used: "+numQuantity);
    System.out.println("The average of all the numbers used:"+numAverage);
    System.out.println("The quantity even number of used: "+evenNumQuantity);
    System.out.println("The quantity odd number of used: "+oddNumQuantity);*/

    /*System.out.println("Please give a number");
    int factorial = Integer.valueOf(scanner.nextLine());
    int i =0;
    int y = i+1;
    
    for (i =1;i<=factorial;i++)
    {
       
        y = y *i;
        
    }
    System.out.println("The factorial of number: "+factorial+" is: "+y);*/

   /*  System.out.println("Please write the first number of the sequence.");
    int firstNum = Integer.valueOf(scanner.nextLine());
    System.out.println("Please write the final number of the sequence.");
    int finalNum = Integer.valueOf(scanner.nextLine());
    int sum = 0;

    if(firstNum>finalNum){
        System.out.println("The first number cannot be higher than the last number! Try Again.");
    }
    else{
    for(int i = firstNum;i<=finalNum;i++)
    {
        sum=sum+i;
    }
    System.out.println("The result of the sum of numbers from " +firstNum+ " to " +finalNum+" is "+ sum);
}*/

    /*System.out.println("Please enter the final number");
    int finalNum = Integer.valueOf(scanner.nextLine());
    int sum =0;
    for(int i =0;i<=finalNum;i++){
        sum = sum + i;
        
    }
    System.out.println("The final sum of the numbers preceding and including number: " +finalNum+ " is: " +sum);*/
    

    /*  System.out.println("Please enter a number to count up to.");
    int toNum = Integer.valueOf(scanner.nextLine());
    System.out.println("Please enter a number to count from.");
    int fromNum = Integer.valueOf(scanner.nextLine());
    if(fromNum >toNum){
        System.out.println("The lower limit exceeds the upper limit! Try Again.");
    }
    for(int i =fromNum;i<=toNum;i++)
    {
        System.out.println(i);
    }*/

    /*System.out.println("Please enter a positive number between 0 and 100.");
    int num = Integer.valueOf(scanner.nextLine());
    if(num >100){
        System.out.println("Number is too high! Try Again.");
    }
    if(num < 0)
    {
        System.out.println("You've entered a negative number! Try Again");
    }
    if(num>0){
        for(int i = num; i<=100;i++)
        {
            System.out.println(i);
        }
    }*/
    
    
    
   /* double sum=0;
    double numOfNums=0;
    double average = 0;
    
    while(true)
    {
        System.out.println("Please enter a number, Use '0' to exit the program.");
        int num = Integer.valueOf(scanner.nextLine());
        if(num == 0){
            
            break;
            
           
        }
        if(num != 0){

            sum+=num;
            numOfNums+=1;
            if(num>0){
            average = sum/numOfNums;
            }
            
            
        }
        
    }
    if(sum>0){
    System.out.println("The Average of the Values Inputted: "+average);
    }
    else{
        System.out.println("No Average could be calculated!");
    }
    System.out.println("Total quantity of Values Inputted: "+numOfNums);
    System.out.println("Sum of Values Inputted: "+sum);
    */
    
    
   /*while(true){
    System.out.println("Please enter a positive number");
    num = Integer.valueOf(scanner.nextLine());
    if(num> 0)
    {
        System.out.println("You've entered number: "+num+ " which is: "+num*num+" when squared.");
    }
    else if(num < 0){
        System.out.println("This is a negative number! Try Again.");
        continue;
    }
    else if(num == 0){
        break;
   }
}
System.out.println("End of program.");*/
    
   /*while(true){
    System.out.println("Please enter a number, enter 4 to exit");
    int value = Integer.valueOf(scanner.nextLine());
    if(value == 4){
        break;
    }
    System.out.println("You entered number " +value);
   }
   System.out.println("End of program");*/

   /*while (true){
    System.out.println("Exit? Type 'no' to Exit");
    String input = scanner.nextLine();
    if(input.equals("no"))
    {
        break;
    }
    System.out.println("Programme will continue.");
   }
   System.out.println("Programme will end.");*/

   /*System.out.println("Please enter the first number.");
   int firstNum = Integer.valueOf(scanner.nextLine()); 
   System.out.println("Please enter the second number.");
   int secondNum = Integer.valueOf(scanner.nextLine());

   if(firstNum == secondNum)
   {
    System.out.println("Number "+firstNum+ " is equal to "+secondNum);
   }
   else if(firstNum > secondNum)
   {
    System.out.println("Number "+firstNum+ " is greater than "+secondNum);
   }
   else if(firstNum < secondNum)
   {
    System.out.println("Number "+firstNum+ " is less than "+secondNum);
   }*/
   /*  System.out.println("Please enter a number: ");
    int number = Integer.valueOf(scanner.nextLine());
    if(number >= 0)
    {
        System.out.println(number);
    }
    else{
        System.out.println(number*-1);
    }
*/

   /*System.out.println("Please enter the first number.");
   int number1 = Integer.valueOf(scanner.nextLine());
   System.out.println("Please enter the second number.");
   int number2 = Integer.valueOf(scanner.nextLine());
   double squareRoot = Math.sqrt(number1 + number2);
   System.out.println("The square root of the sum of numbers:  "+ number1 + " and " + number2 +" is " + squareRoot);*/

   /*int number = Integer.valueOf(scanner.nextLine());
   int square = number;
   System.out.println("The number "+number+" squared is: "+number*square);*/

   /*System.out.println("Please enter the value of the gift: ");
   double giftValue = Double.valueOf(scanner.nextLine());
   
    if(giftValue <5000)
    {
        System.out.println("No tax!");
    }
    else if(giftValue >= 5000 && giftValue < 25000)
    {
        System.out.println("Your Tax Rate: £"+(100 + (giftValue - 5000) *0.08));
            
    }
    else if(giftValue>=25000 && giftValue < 55000)
    {
        System.out.println("Your Tax Rate: £"+(100 + (giftValue - 5000) *0.1));
    }
    else if(giftValue >= 55000 && giftValue<200000)
    {
        System.out.println("Your Tax Rate: £"+(100 + (giftValue - 5000) *0.12));
    }
    else if(giftValue>= 200000 && giftValue < 1000000)
    {
        System.out.println("Your Tax Rate: £"+(100 + (giftValue - 5000) *0.15));
    }
    else if(giftValue>1000000){

        System.out.println("Your Tax Rate: £"+(100 + (giftValue - 5000) *0.17));

    }*/
    
   /*  System.out.println("Please give a year");
    int year = Integer.valueOf(scanner.nextLine());
    System.out.println("Please give the current year");
    int currentYear = Integer.valueOf(scanner.nextLine());
    if(year % 400 == 0 && year % 100 == 0 && year > currentYear)
    {
        System.out.println("The year: "+year+ " will be a leap year.");
    }
    else if (year % 400 == 0 && year % 100 == 0 && year < currentYear)
    {
        System.out.println("The year: "+year+ " was a leap year.");
    }
    else if (year % 400 == 0 && year % 100 == 0 && year == currentYear)
    {
        System.out.println("The year: "+year+ " is a leap year.");
    }
    else if (year%4 == 0 && year> currentYear)
    {
        System.out.println("The year: "+year+ " will be a leap year.");
    }
    else if (year%4 == 0 && year< currentYear)
    {
        System.out.println("The year: "+year+ " was a leap year.");
    }
    else if (year%4 == 0 && year == currentYear)
    {
        System.out.println("The year: "+year+ " is a leap year.");
    }
    else{
        System.out.println("The year: "+year+ " is not a leap year.");
    }*/

    
    
    /*int number = Integer.valueOf(scanner.nextLine());
    if(number % 5 == 0 && number % 3 == 0){
        System.out.println("FizzBuzz");
    }
    else if(number % 3 == 0)
    {
        System.out.println("Fizz");
    }
    else if(number % 5 == 0 )
    {
        System.out.println("Buzz");
    }
    else{
        System.out.println(number);
    }*/

  
   /*System.out.println("How old are you?");
   int age = Integer.valueOf(scanner.nextLine());
   if(age >= 0 && age <= 120)
   {
    System.out.println("Ok");
   }
   else{
   System.out.println("Impossible!");
   }*/



  /*  System.out.println("Please enter two words");
   System.out.println("First Word: ");
   String firstWord = scanner.nextLine();
   System.out.println("Second Word: ");
   String secondWord = scanner.nextLine();

   if(firstWord.equals(secondWord)){
    System.out.println("Same Words");
   }
   else{
    System.out.println("Different");
   }
   if(firstWord.equals("two words")&&secondWord.equals("two words")){
    System.out.println("Smart Arse");
   }
   else if(firstWord.equals("two words"))
   {
    System.out.println("Ha Ha Very Funny");
   }
   else if(secondWord.equals("two words"))
   {
    System.out.println("You think you're smart don't you?");
   }*/
   

   /*System.out.println("Password?");
   String password = scanner.nextLine();
   if(password.equals("Caput Draconis"))
   {
    System.out.println("Welcome");
   }
   else
   {
    System.out.println("Off with you!");
   }*/

   /*System.out.println("Give a number:");
   int number = Integer.valueOf(scanner.nextLine());
   if(number % 2 == 0){
    System.out.println("This number is Even!");
   }
   else{
    System.out.println("This number is Odd!");
   }*/
   
   /*System.out.println("Please enter a grade [0-100]");
   int grade = Integer.valueOf(scanner.nextLine());
   if(grade<0){
    System.out.println("Impossible!");
   }
    else if(grade>=0 && grade <= 49)
    {
        System.out.println("FAILED");
    }
    else if(grade >= 50 && grade <= 59 ){
        System.out.println("Grade 1 Acheived.");
    }
    else if(grade >= 60 && grade <= 69 ){
        System.out.println("Grade 2 Acheived.");
    }
    else if(grade >= 70 && grade <= 79 ){
        System.out.println("Grade 3 Acheived.");
    }
    else if(grade >= 80 && grade <= 89 ){
        System.out.println("Grade 4 Acheived.");
    }
    else if(grade >= 90 && grade <= 99 ){
        System.out.println("Grade 5 Acheived.");
    }
    else if(grade >= 100){
        System.out.println("Incredible!");
    }*/


   

 /*   System.out.println("Please enter your age");
   int age = Integer.valueOf(scanner.nextLine());
   if(age >= 18)
   {
   System.out.println("You are an adult");
   }
   if(age<18 && age >-1)
   {
   System.out.println("You are not an adult");
   }
   else{
    if(age < 0)
    {
        System.out.println("You haven't even been born!");
    }
   }
   */

  /*  System.out.println("Please enter a year");

   int year = Integer.valueOf(scanner.nextLine());

   System.out.println("Now please enter the current year");

   int currentYear = Integer.valueOf(scanner.nextLine());

   int yearsAgo = currentYear - year;

if(year> currentYear){
    System.out.println("Year " +year+" has not occured yet!");

} 

    if( year == currentYear)
    {
        System.out.println("This is the current year!");
    }
   if (year < 2015){
        System.out.println("Ancient History! "+year+ " was " + yearsAgo + " years ago!");
   }
   else{
    if(year<currentYear){
        System.out.println("Wow "+year+" was only "+ yearsAgo + " years ago!");
    }
    }*/
    
 


    


   
   
   /*System.out.println("Please enter your current speed");

   int speed = Integer.valueOf(scanner.nextLine());

   if(speed>30){
            System.out.println("You've been given a speeding ticket");
   }
   else{
            System.out.println("Thank you for maintaining the speed limit");
   }*/
   
   
   /*System.out.println("Give the first number: ");
    int firstNumber = Integer.valueOf(scanner.nextLine());
    System.out.println("Give the second number: ");
    int secondNumber = Integer.valueOf(scanner.nextLine());
    
    double average = (firstNumber + secondNumber )/2.0;
    System.out.println("The average is: " + average);
    int sum = firstNumber + secondNumber;
    System.out.println("Sum: " + firstNumber + " + " + secondNumber + " = " + sum);
    int difference = firstNumber - secondNumber;
    System.out.println("Difference: " + firstNumber + " - " + secondNumber + " = " + difference);
    int product = firstNumber * secondNumber;
    System.out.println("Product: " + firstNumber + " * " + secondNumber + " = " + product);
    int quotient = firstNumber/secondNumber;
    System.out.println("Quotient: " + firstNumber + " / " + secondNumber + " = " + quotient);*/

 
 
   /*System.out.println("Please provide the first number");
   int firstNum = Integer.valueOf(scanner.nextLine());
   System.out.println("Please provide the second number");
   int secondNum = Integer.valueOf(scanner.nextLine());
   System.out.println("Please provide the third number");
   int thirdNum = Integer.valueOf(scanner.nextLine());
   int sum = firstNum*secondNum*thirdNum;
   System.out.println(firstNum +" * "+ secondNum +" * "+ thirdNum +" = " + sum);*/
   
   //System.out.println( firstNum + " + " + secondNum+ " + " + thirdNum + "" + "" + " = "+ sum);
   


  /*  System.out.println("How many days would you like to convert to seconds?");
   int days = Integer.valueOf(scanner.nextLine());
   System.out.println(days*86400);
   */
   /*
   System.out.println("Give a string: ");
   String stringValue = scanner.nextLine();
   System.out.println("Give an Integer: ");
   int integerValue = Integer.valueOf(scanner.nextLine());
   System.out.println("Give a double: ");
   double doubleValue = Double.valueOf(scanner.nextLine());
   System.out.println("Give a boolean: ");
   boolean booleanValue = Boolean.valueOf(scanner.nextLine());
   System.out.println("in summary....");
   System.out.println("You gave the string: " + stringValue);
   System.out.println("You gave the integer: " +integerValue);
   System.out.println("You gave the double: " +doubleValue);
   System.out.println("You gave the boolean: " +booleanValue);
   */

   
   
   /*int chickenQuantity = 9000;
    double baconWeight = 0.1;
    String tractor = "Zetor";

    System.out.println("Chicken: " + chickenQuantity);
    System.out.println("Bacon (kg): " + baconWeight);
    System.out.println("Tractor: " + tractor);

    System.out.println("And Finally, a summary:");
    System.out.println(chickenQuantity);
    System.out.println(baconWeight);
    System.out.println(tractor);*/




  /*  System.out.println("I will tell you a story, but I need some information first");
   System.out.println("What is the main character called?");
   String charName = scanner.nextLine();
   System.out.println("What is their job?");
   String charJob = scanner.nextLine();
   System.out.println("Here is the story:");
   System.out.println("Once upon a time there was " + charName + ", who was a " + charJob );
  System.out.println ("On the way to work, " +charName+ " reflected on life.");
  System.out.println("Perhaps " + charName + " was not a " + charJob + " anymore.");

   System.out.println("Greetings! How are you today?");
  String response1 = scanner.nextLine();
  System.out.println("Oh, how interesting, tell me more!");
  String response2 = scanner.nextLine();
  System.out.println("Thanks for sharing!");
  

  System.out.println("What is your first name?");
  String firstName = scanner.nextLine();
  System.out.println("What is your middle name?");
  String middleName = scanner.nextLine();
  System.out.println("What is your Last Name?");
  String lastName = scanner.nextLine();
   String message = "Ada Lovelace";

    System.out.println("Welcome, " + firstName + " " + middleName + " " + lastName);*/
    


    

}

}
