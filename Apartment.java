public class Apartment {
    private int numberOfRooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int numberOfRooms, int squares, int pricePerSquare)
    {
        this.numberOfRooms = numberOfRooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThanOtherApartment(Apartment otherApartment)
    {
        if(this.squares > otherApartment.squares)
        {
            return true;
        }
        if(this.squares< otherApartment.squares)
        {
            return false;
        }
        else
        System.out.println("Apartments are same size");
        return false;
    }
    public int priceDifference(Apartment otherApartment)
    {
        
        if(this.pricePerSquare*this.squares> otherApartment.pricePerSquare*otherApartment.squares)
        {
            return (this.pricePerSquare*this.squares) - (otherApartment.pricePerSquare*otherApartment.squares);
        }
        if(this.pricePerSquare*this.squares< otherApartment.pricePerSquare*otherApartment.squares)
        {

            return (otherApartment.pricePerSquare*otherApartment.squares) - (this.pricePerSquare*this.squares);
        }
        else
        return 0;

    }
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        if(this.pricePerSquare*this.squares> otherApartment.pricePerSquare*otherApartment.squares)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString()
    {
        return "Rooms: "+this.numberOfRooms+"Squares: "+this.squares+" Price per square: "+this.pricePerSquare;
    }
    
}
