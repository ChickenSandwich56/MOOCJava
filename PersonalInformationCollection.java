public class PersonalInformationCollection {

    private String firstname;
    private String lastName;
    private int identificationNum;

    public PersonalInformationCollection(String firstname, String lastname, int identificationNum)
    {
        this.firstname = firstname;
        this.lastName = lastname;
        this.identificationNum = identificationNum;
    }

    public String toString()
    {
        return this.firstname +" "+ this.lastName;
    }

    


    
}
