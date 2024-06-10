import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class StoringRecords {

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner fileScanner = new Scanner(Paths.get(file)))
        {
            while(fileScanner.hasNextLine()){
            String row = fileScanner.nextLine();
            String pieces[] = row.split(",");
            String name = pieces[0];
            int age = Integer.valueOf(pieces[1]);
            Person person = new Person(name, age);
            persons.add(person);
            System.out.println(person.getName()+","+person.getAge());
            }
            
        }
        catch (IOException e)
        {
            System.out.println("ERROR "+ e.getMessage());
        }

        return persons;

    
    }

    public static void main(String args[])
    {
        System.out.println("Please enter a file name.");
        Scanner scanfile = new Scanner(System.in);
        String newFile = scanfile.nextLine();
        readRecordsFromFile(newFile);

        

    }


    

    
    
}
