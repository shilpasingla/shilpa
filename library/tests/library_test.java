
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
            ArrayList<String> books = lib.get_all_books();
            assertEquals(1, books.size()) ;

            lib.addBook(new Book());
            books = lib.get_all_books();
            assertEquals(2, books.size()) ;


        }

        @Test
        public void shouldReturnAllBooks()  {
            library lib = new library();
            ArrayList <String> books = lib.get_all_books();
            Book books1 = new Book("head first java");
            Book books2 = new Book("programming in c");
            lib.addBook(books1) ;
            assertEquals(books.get(0), "head first java");

            lib.addBook(books2) ;
            assertEquals(books.get(0), "head first java");
            assertEquals(books.get(1),"programming in c");

        }

        @Test
        public void shouldReserveBook() {
            Book br1 = new Book("head first java");
            library lib = new library() ;
            Boolean reserved;

            lib.addBook(br1) ;
            reserved = lib.reserve_book(br1) ;
            assertEquals(true,reserved);

            Book br2 = new Book("programming in c");
            lib.addBook(br2);
            reserved = lib.reserve_book(br2) ;
            assertEquals(true,reserved );



        }



}
