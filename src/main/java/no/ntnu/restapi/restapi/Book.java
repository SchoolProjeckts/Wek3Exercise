package no.ntnu.restapi.restapi;

/**
 * This class represent a book.
 */
public class Book {

    private int id;
    private String title;
    private int year;
    private int numberOfPages;

    /**
     * Creates a new book.
     * @param id of the book.
     * @param title of the book.
     * @param year of the book.
     * @param numberOfPages of the book.
     */
    public Book(int id, String title, int year, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Returns the ID of the book.
     * @return ID.
     */
    public int getID() {
        return this.id;
    }

    /**
     * Returns the title of the book.
     * @return title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the year of the book.
     * @return year.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Returns the number of pages of the book.
     * @return number of pages.
     */
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    /**
     * Set the ID of the book.
     * @param id new ID.
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Set the tile of the book.
     * @param title new title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set the year of the book.
     * @param year new year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Set the number of pages of the book.
     * @param numberOfPages new number of pages.
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
