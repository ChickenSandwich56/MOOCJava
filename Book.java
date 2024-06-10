public class Book {

    private String name;
    private int pages;
    private int publicationYear;

    public Book(String bookName, int bookPages, int bookPublicationYear)
    {
        this.name = bookName;
        this.pages = bookPages;
        this.publicationYear = bookPublicationYear;
    }
    public String toString()
    {
        return "Book Name: "+this.name+ ", Page Count: "+this.pages+", Publication Year: "+this.publicationYear;
    }
    public boolean equals(Object compared)
    {
        if(this == compared)
        {
            return true;
        }
        if(!(compared instanceof Book))
        {
            return false;
        }
        Book comparedBook = (Book) compared;

        if(this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear && this.pages == comparedBook.pages)
        {
            return true;
        }
        else{

        return false;
        }
    }
    
    
}
