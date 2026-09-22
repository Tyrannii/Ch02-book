/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Colten Aguilar
 * @version 9/21/26
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    // Add the methods here ...
    
    /**
     * getAuthor
     * @return name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * getTitle
     * @return name of the title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * 
     * @return number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Prints the title, author, and pages
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
        
        if (refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
            System.out.println("Reference Number: ZZZ");
        }
        
        System.out.println("Times Borrowed: " + borrowed);
    }
    
    /**
     * Sets the reference number of the book.
     */
    public void setRefNumber(String ref)
    { if (ref.length() >= 3)
    {
        refNumber = ref;
    }
    else
    {
        System.out.println("Error: reference number must be at least 3 characters.");
    }
}
    /**
     * Returns the reference number
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * Records the books borrowed
     */
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    /**
     * Returns the number of times a book was borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
}
