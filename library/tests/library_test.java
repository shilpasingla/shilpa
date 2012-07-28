
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 20/7/12
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class library_test {


        @Test
        public void shouldAddBook() {
            library lib = new library() ;
            lib.addBook(new Book());
            ArrayList<Book> books = lib.get_all_books();
            assertEquals(1, books.size()) ;

            lib.addBook(new Book());
            books = lib.get_all_books();
            assertEquals(2, books.size()) ;


        }

        @Test
        public void shouldReturnAllBooks()  {
            library lib = new library();
            ArrayList <Book> books = lib.get_all_books();

            Book books1 = new Book("head first java");
            Book books2 = new Book("programming in c");
            lib.addBook(books1) ;

            assertEquals("head first java",books.get(0).book_name );

            lib.addBook(books2) ;
            assertEquals( "head first java",books.get(0).book_name );
            assertEquals("programming in c",books.get(1).book_name );

        }

        @Test
        public void shouldReserveBook() {
            Book br1 = new Book("C++");
            library lib = new library() ;
            Boolean reserved;

            lib.addBook(br1) ;
            reserved = lib.reserve_book(lib,br1) ;
            assertEquals(true,reserved);

            Book br2 = new Book("data structures");
            lib.addBook(br2);
            reserved = lib.reserve_book(lib,br2) ;
            assertEquals(true,reserved );



        }
    @Test
    public void shouldAddMovie() {
        library lib = new library() ;
        lib.addMovie(new Movie());
        movieLibrary m = new movieLibrary() ;
        ArrayList<Movie> movies = lib.get_all_movies();
        assertEquals(m.total_movies +1, movies.size()) ;

        lib.addMovie(new Movie());
        movies = lib.get_all_movies();
        assertEquals(m.total_movies +2, movies.size()) ;


    }

    @Test
    public void shouldReturnAllMovies()  {
        library lib = new library();
        ArrayList <Movie> movies = lib.get_all_movies();
        Movie movie1 = new Movie("sholay","ramesh sippy",9);
        Movie movie2 = new Movie("housefull","sajid khan",7);
        lib.addMovie(movie1) ;
        assertEquals(movies.get(0).name, "sholay");
        assertEquals(movies.get(0).director, "ramesh sippy");
        assertEquals(movies.get(0).rating, 9);
        lib.addMovie(movie2) ;
        assertEquals(movies.get(0).name, "sholay");
        assertEquals(movies.get(0).director, "ramesh sippy");
        assertEquals(movies.get(0).rating, 9);
        assertEquals(movies.get(1).name, "housefull");
        assertEquals(movies.get(1).director, "sajid khan");
        assertEquals(movies.get(1).rating, 7);
    }

    @Test
    public void shouldAddMovies()  {
        library lib = new library();
        movieLibrary m = new movieLibrary() ;
       assertEquals(m.total_movies ,lib.movieList.size() ) ;
    }

}
