/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Matt Trecozzi G00248431)
 * @version (Feb 4, 2019)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // Added pages field and appropriate constructor.
    public Book(String bookAuthor, String bookTitle, int _pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = _pages;
    }
    
    // 2.83 
    /**
     * Provide access ot the string holding the author's name
     * @return author
     */
    public String getAuthor(){
        return this.author;
    }
    
    public String getTitle(){
     return this.title;   
    }
    
    // 2.85 pages Accessor
    public int getPages(){
     return this.pages;   
    }
    
    //2.84 create print methods that print the Author and Title fields respectively,
    // to the terminal window
    public void printAuthor() {
        System.out.println(this.author);
    }
    
    public void printTitle(){
        System.out.println(this.title);
    }

    // As of 2.86 the book objects we create are currently immuatble
    // Add the methods here ...
}
