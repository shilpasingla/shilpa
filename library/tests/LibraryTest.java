import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 7:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {
    @Test
    public void shouldReturnAllBooks() {
        Library lib = new Library() ;
        ArrayList<Book> books = lib.viewBooks() ;
        assertEquals(0,books.size());
        lib.addBook(new Book("head first java"));
        assertEquals(1, books.size());
        assertEquals("head first java",books.get(0).name);
        lib.addBook(new Book("programming in c"));
        assertEquals(2, books.size());
        assertEquals("head first java",books.get(0).name);
        assertEquals("programming in c",books.get(1).name);
    }

    @Test
    public void shouldReserveBook() {
        Library lib = new Library();
        Boolean b = lib.reserveBook(new Book());
        assertFalse(b) ;
       Book book = new Book("head first java") ;
        lib.addBook(book) ;
       b = lib.reserveBook(book);
        assertTrue(b) ;
        b = lib.reserveBook(book);
        assertFalse(b) ;

    }

    @Test
    public void shouldAddBook()  {
        Library lib = new Library();
        ArrayList<Book> books = lib.viewBooks() ;
        assertEquals(0,books.size());
        lib.addBook(new Book()) ;
        assertEquals(1,books.size());
        lib.addBook(new Book()) ;
        assertEquals(2,books.size());

    }

     @Test
    public void shouldReturnAllMovies() {
        Library lib = new Library() ;
        ArrayList<Movie> movies = lib.viewMovies();
        assertEquals(0, movies.size());
        Movie movie1 = new Movie("sholay","ramesh sippy",9);
        //lib.addMovie(movie1);
        MovieData.movieList.add(movie1);
        assertEquals(1,movies.size());
        assertEquals("sholay",movies.get(0).name) ;
        assertEquals("ramesh sippy",movies.get(0).director) ;
        assertEquals(9,movies.get(0).rating) ;
    }

}