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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
}
