public class BookClass {

    private String author;
    private String name;
    private int pages;

    public BookClass(String bookAuthor, String bookName, int bookPages)
    {
        this.author = bookAuthor;
        this.name = bookName;
        this.pages = bookPages;

    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getName()
    {
        return this.name;
    }
    public String toString()
    {
        return "Author: "+this.author + ", Name: "+this.name+", Page Count: "+ this.pages;
    }
    
}
