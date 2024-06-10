import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
public class FileInput {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> numList = new ArrayList<>();
        
        System.out.println("Please enter filename");
        String fileName = scanner.nextLine();
        //ArrayList<String> rows = new ArrayList<>();
        int matchCount = 0;
                int homeTeamPoints = 0;
                int visitTeamPoints = 0;
                int homeTeamLosses = 0;
                int visitingTeamLosses = 0;

        try(Scanner fileScan = new Scanner(Paths.get(fileName)))
        {
            while(fileScan.hasNextLine())
            {
                boolean displayMatchCount = false;
                boolean teamfound = false;
                
                
                String row = fileScan.nextLine();
                System.out.println(row);
                //rows.add(row);
                String pieces[] = row.split(",");
                  String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homePoints = Integer.valueOf(pieces[2]);
                int visitingPoints = Integer.valueOf(pieces[3]);
                if(!fileScan.hasNextLine()){
                System.out.println("To query data press 1, to exit, press 0");
                int select = Integer.valueOf(scanner.nextLine());
                if(select == 1){
                 System.out.println("Please enter a team name, to view team data");
                String enterTeamName = scanner.nextLine();
                

                if(enterTeamName.equals(homeTeam)||enterTeamName.equals(visitingTeam))
                {
                    matchCount++;
                }

                if(homeTeam.equals(enterTeamName)&& homePoints>visitingPoints)
                {
                    homeTeamPoints++;
                }
                else if(homeTeam.equals(enterTeamName)&& homePoints<visitingPoints)
                {
                    homeTeamLosses++;
                }
                if(visitingTeam.equals(enterTeamName)&&visitingPoints>homePoints)
                {
                    visitTeamPoints++;
                }
                else if(visitingTeam.equals(enterTeamName)&&visitingPoints<homePoints)
                {
                    visitingTeamLosses++;
                }
                
                    
                    /* for (int i = 0;i<rows.size();i++){

                        
                            if(rows.get(i).contains(enterTeamName))
                            {
                                teamfound = true;
                                displayMatchCount = true;
                                System.out.println("FOUND element "+enterTeamName+" in row: "+rows.get(i));
                                matchCount++;
                            }
                            displayMatchCount = false;
                            teamfound = false;
                            if(Integer.valueOf(rows.get(i+2)) > Integer.valueOf(rows.get(i+3)))
                            {
                                homePoints++;
                            }
                            if(Integer.valueOf(rows.get(i+2)) < Integer.valueOf(rows.get(i+3)))
                            {
                                visitTeamPoints++;
                            }
                        }
                        if(displayMatchCount == false)
                        {
                            System.out.println("Team: "+enterTeamName +", has played "+matchCount+ " games.");
                        }
                        if(teamfound == false)
                        {
                            System.out.println("Unable to find element: "+ enterTeamName);
                        }
                        
                        
 */

                        System.out.println("Games: "+matchCount);
                        System.out.println("Home Team: Wins: "+ homePoints +", Losses: " + homeTeamLosses);
                        System.out.println("Visiting Team: Wins: "+ visitingPoints +", Losses: " + visitingTeamLosses);

                   
                    
                    
                }
        }
        }
    }
        catch(IOException e)
        {
            System.out.println("ERROR: "+e.getMessage());
        }


        
        
        
        



    }
    
}


    /* try(Scanner fileScanner = new Scanner(Paths.get(fileName)))
        {
            while(fileScanner.hasNextLine())
            {
                String row = fileScanner.nextLine();
                
                String parts[] = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
               
                if(age > 1 || age < 1){
                System.out.println(name+", age: "+age+" years");
                }
                if(age == 1){
                System.out.println(name+", age: "+age+" year");
                }
                
                
                

                
                  
                  
            }

            
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } */
        

        
        /* System.out.println("Please enter an lower and upper limit of number ranges");
        System.out.print("Lower Limit: ");int lowerLim = Integer.valueOf(scanner.nextLine()); 
        System.out.print("Upper Limit: ");int upperLim = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Please enter a file name containing numbers:");
        String numFile = scanner.nextLine();
        try(Scanner fileScan = new Scanner(Paths.get(numFile)))
        {

            while(fileScan.hasNextLine())
            {

                String row = fileScan.nextLine();
                System.out.println(row);
                numList.add(row);

            }

            System.out.println("File has been read, please enter 1 to sift through contents, or 0 to exit");

                int select = Integer.valueOf(scanner.nextLine());

                
                    if(select == 1)
                    {
                        for(int i =0;i<numList.size();i++)
                        {
                            if(Integer.valueOf(numList.get(i))< upperLim && Integer.valueOf(numList.get(i))> lowerLim){
                                numCounter++;
                            }
                        }
                        System.out.println("There are "+numCounter+" numbers bewteen "+lowerLim+" and "+upperLim);
                    }
                    if(select == 0)
                    {
                        System.out.println("Programme ending...");
                        
                    }


        }
        catch(Exception e)
        {
            System.out.println("Error "+e.getMessage() +": no such file exists");
        } */

       
        

        /* String cubedNum = "";
        int count = 0;

        while(!cubedNum.equals("end"))
        {
            cubedNum = scanner.nextLine();
            if(!cubedNum.equals("end")){
            System.out.println(Integer.valueOf(cubedNum)*Integer.valueOf(cubedNum)*Integer.valueOf(cubedNum));
            count++;
            }
        }
        System.out.println(count); */

        
 


 /* String fileName = scanner.nextLine();
        String checkName = "";
        ArrayList<String> nameList = new ArrayList<>();

        try(Scanner fileScanner = new Scanner(Paths.get(fileName)))
        {
            while(fileScanner.hasNextLine())
            {

               String row = fileScanner.nextLine();
                //System.out.println(row);
                nameList.add(row);
                System.out.println("Please enter 1 to search for names");
                int option = Integer.valueOf(scanner.nextLine());
                if(option == 1)
                {
                    System.out.println("Enter Name:");
                    checkName = scanner.nextLine();
                    for(int i = 0;i<nameList.size();i++){
                    if(row.contains(checkName))
                    {
                        System.out.println(checkName+" is on the list.");
                    }
                    if(!row.contains(checkName))
                    {
                        System.out.println(checkName+" is not on the list.");
                    }
                    
                }

                System.out.println("Please enter 1 to search for names");
                    option = Integer.valueOf(scanner.nextLine());
                    if(option!=1)
                    {
                        return;
                    }
                }
                

            }
        }
            catch(Exception e){
                System.out.println("Error reading the file "+ e.getMessage()+" failed!");
            } */
