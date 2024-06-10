import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class array{

    public static int arraySum(int sumOfNums[])
    {
        int i = 0;
        int sum = 0;
        for(i = 0;i<sumOfNums.length;i++)
        {
            sum=sum+sumOfNums[i];
        }
        return sum;
    }
    public static void printNeatly(int sumOfNums[])
    {
        boolean isNumPrinted;
        int commaCounter = 0;
        for(int i = 0;i<sumOfNums.length;i++)
        {
            System.out.print(sumOfNums[i]);
            isNumPrinted = true;
            if(isNumPrinted == true && commaCounter<=sumOfNums.length-2)
            {
                
                System.out.print(", ");
                isNumPrinted = false;
                commaCounter++;
            }
            
        }
    }
    public static void printArrayInStars(int starArray[])
    {
        int elementNum = 0;
        for(int y = 0;y<starArray.length;y++){
        for(int i = 0;i<starArray[elementNum];i++)
        {
            System.out.print("*");
            
        }
        System.out.println();
        elementNum++;
    }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter the length of the array.");
        //int arrayNumSize = Integer.valueOf(scanner.nextLine());
        int searchIndex;
        int searchOption;
        int helper = 0;
        int[] nums = new int[8];
        nums[0] = 5;
        nums[1] = 25;
        nums[2] = 44;
        nums[3] = 52;
        nums[4] = 88;
        nums[5] = 29;
        nums[6] = 63;
        nums[7] = 79;

        printArrayInStars(nums);

        printNeatly(nums);

        System.out.println(" The total of the array elements: " + arraySum(nums));
        
        

            for(int i = 0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
            }

    System.out.println("Please provide 2 indices to swap. From 0 to "+(nums.length-1));
    int swapIndices = Integer.valueOf(scanner.nextLine());
    int swapIndices1 = Integer.valueOf(scanner.nextLine());  
    System.out.println("Array Values (swapIndices)"+nums[swapIndices]+" and (swapIndices1)"+nums[swapIndices1]+" currently at locations "+ swapIndices+" and "+swapIndices1+" respectively.");
    
    
            helper= nums[swapIndices];
            nums[swapIndices] = nums[swapIndices1];
            nums[swapIndices1] = helper;

            System.out.println("Values (swapIndices)"+nums[swapIndices]+" and (swapIndices1)"+ nums[swapIndices1] + " have swapped locations to: "+ swapIndices+" and " + swapIndices1 +" respectively." );
            System.out.println("The new order of values:");
            for(int i = 0;i<nums.length;i++)
            {
                System.out.println(nums[i]);
            }

            System.out.println("Press 9 to search for a value");
            searchOption = Integer.valueOf(scanner.nextLine());
            boolean found = false;
            if(searchOption == 9)
            {
                System.out.println("Please enter a number to search for");
         System.out.print("search for? ");   searchIndex = Integer.valueOf(scanner.nextLine());
                
                for(int i =0;i<nums.length;i++)
                {
                    if(searchIndex == nums[i])
                    {
                        System.out.println("Number: "+searchIndex+" found at position "+i);
                        found = true;
                    }
                    
                    
                }
                if(found == false)
                    {
                        System.out.println("Number: "+searchIndex+" was not found");
                        //found = true;
                    }
                
                System.out.println("End of programme.");

            }
    
        }
    
    
}

/* if(swapIndices < nums.length&& swapIndices>=0)
    {
        if(swapIndices1 < nums.length&& swapIndices1>=0){
           

        }
        else{
        System.out.println("Value"+ swapIndices1 + "Out of Range!");
        }
    }
        else{
            System.out.println("Value"+ swapIndices + "Out of Range!");
            } */