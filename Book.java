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
    private String refNumber;

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
        refNumber = "";
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
    
    public String getRefNumber(){
     return this.refNumber;   
    }
    
    //2.90
    public void setRefNumber(String _refNumber){
        
        if (_refNumber.length() >= 3){
            this.refNumber = _refNumber; 
            System.out.println("Reference Number Updated");
        } else {
         System.out.println("Error: The Reference Number should be a string with 3 or more characters");   
        }
        
       
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
    
    // 2.87 printDetails
    /**
     * Method that prints the details of the author, title, and pages to the terminal window
     * format appropriately
     * 
     */
    
    public void printDetails(){
     System.out.println("Title: " + this.title);
     System.out.println("Author: " + this.author);
     System.out.println("Pages: " + this.pages);
     
     if (this.refNumber.length() > 0){
         System.out.println("Reference Number: " + refNumber);
        } else {
            System.out.println("Reference Number: " + "ZZZ");
        }
     
    }
    // Add the methods here ...
}
