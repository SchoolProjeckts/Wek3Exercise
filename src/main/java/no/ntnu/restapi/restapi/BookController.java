package no.ntnu.restapi.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Rest controller for the book.
 */
@RestController
public class BookController {

    //A list of books.
    List<Book> books = new ArrayList<>();

    /**
     * Start the bookcontroller.
     */
    public BookController() {
        initilazeData();
    }

    /**
     * Initialize the data
     */
    public void initilazeData() {
        Book book1 = new Book(1,"A Game of Thrones",1996, 694);
        Book book2 = new Book(2,"A Clash of Kings",1999, 768);
        Book book3 = new Book(3,"A Storm of Swords",2000, 973);
        Book book4 = new Book(4,"A Feast for Crows",2005, 753);
        Book book5 = new Book(5,"A Dance with Dragons",2011, 1056);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
    }

    /**
     * Return all books in the list on HTTP Get request
     * @return all boks in the list
     */
    @GetMapping("/books")
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Return info on a given ID on a HTTP Get request.
     * @param id of the book you want info on
     * @return the book with a given request
     */
    @GetMapping("/books/{id}")
    public ResponseEntity<List<Book>> getBooksId(@PathVariable int id) {
        List<Book> booksWhitGivenID = new ArrayList<>();
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getID() == id) {
                booksWhitGivenID.add(books.get(i));
            }
        }
        if (booksWhitGivenID.isEmpty()) {
            return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Book>>(booksWhitGivenID, HttpStatus.OK);
    }

    /**
     * Create a new book on an HTTP POST request.
     * @param book the new book.
     */
    @PostMapping("/books")
    public ResponseEntity createBook(@RequestBody Book book) {
        this.books.add(book);
        Boolean bookWasCreatedAndAddedToTheBookList = false;

        //Checks if the book was added to the book list
        if(this.books.get(this.books.size() - 1).getID() == book.getID()) {
            bookWasCreatedAndAddedToTheBookList = true;
        }

        //Return a created respond if the book was created and added to the book list.
        if(bookWasCreatedAndAddedToTheBookList) {
            return new ResponseEntity(HttpStatus.CREATED);
        }

        //If the book was no created a bad request respond is return.
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
