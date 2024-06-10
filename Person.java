public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private SimpleDate dateOfBirth;
    //private Pet petName;

    public Person(String name){
        this(name,0,0,0);
    }

    public Person(String firstName, int personAge, int personWeight, int personHeight)
    {
        this.age = personAge;
        this.name=firstName;
        this.height = personHeight;
        this.weight = personWeight;
        
    }
    public Person(String firstName, SimpleDate dOB, int personWeight, int personHeight)
    {
        
        this.name=firstName;
        this.dateOfBirth = dOB;
        this.height = personHeight;
        this.weight = personWeight;
        
    }
    
   /*  public Person(String firstName, Pet pet, int personAge)
    {
        this.age = personAge;
        this.name= firstName;
        this.petName = pet;

    } */
    public void personDOB(SimpleDate dateOfBirth)
    {

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setWeight(int personWeight)
    {
        this.weight = personWeight;
    }
    public void setHeight(int personHeight)
    {
        this.height = personHeight;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public int getHeight()
    {
        return this.height;
    }
    public void increaseWeight()
    {
        this.weight = this.weight+1;
    }
    public double bdyMassIndex()
    {
        double heightPerHundred = this.height/100.0;
        return this.weight/(heightPerHundred*heightPerHundred);
    }

    public boolean equals(Object compared)
    {
        if(this == compared)
        {
            return true;
        }
        if(!(compared instanceof Person))
        {
            
            return false;
        }
        Person comparedPerson = (Person) compared;
        if(this.dateOfBirth == comparedPerson.dateOfBirth&&
        this.name == comparedPerson.name&&
        this.height==comparedPerson.height)
        {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return this.name+", age "+this.age + " Weight: ("+this.weight+"lbs)"+" Height: ("+this.height+"cm)"/* " has a friend, " +petName.toString()*/;
    }

}
