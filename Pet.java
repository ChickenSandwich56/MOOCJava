public class Pet {

    private String petName;
    private String petBreed;
    private int petAge;

    public Pet(String name, String breed, int age){
        this.petBreed = breed;
        this.petName = name;
        this.petAge = age;
    }

    public String getName()
    {
        return this.petName;
    }
    public String getBreed()
    {
        return this.petBreed;
    }
    public int getPetAge()
    {
        return this.petAge;
    }
    public String toString()
    {
        return this.petName+" who is a "+this.petAge+" year old "+this.petBreed;
    }
    
}
