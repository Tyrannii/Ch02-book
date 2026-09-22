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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
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
}
