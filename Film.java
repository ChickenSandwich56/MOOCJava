public class Film {

    private String filmName;
    private int filmRating;

    public Film(String initialName, int initialRating)
    {
        this.filmName = initialName;
        this.filmRating = initialRating;
    }

    public String nameOfFilm()
    {
        return this.filmName;
    }
    public int ratingOfFilm()
    {
        return this.filmRating;
    }
    
}
