package no.ntnu.restapi.restapi;

/**
 * This class represent an author.
 */
public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private int birthYear;

    /**
     * Creates a new author..
     * @param id of the author.
     * @param firstName of the author.
     * @param lastName of the author.
     * @param birthYear of the author.
     */
    public Author(int id, String firstName, String lastName, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    /**
     * Returns the id of the author.
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the first name of the author.
     * @return first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the author.
     * @return last name.
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Returns the birthYear of the author.
     * @return birth year.
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the ID of the author.
     * @param id new ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the first name of the author.
     * @param firstName new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the author.
     * @param lastName new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the birth year of the author.
     * @param birthYear new birth year.
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
