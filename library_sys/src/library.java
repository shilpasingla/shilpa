import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 20/7/12
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class library {
    ArrayList<String> bookList = new ArrayList<String>();
    ArrayList<String> reservedList = new ArrayList<String>();


    public  ArrayList<String> get_all_books() {
        return bookList;

    }

    public void addBook(Book book) {

        bookList.add(book.book_name) ;

    }

    public ArrayList<String> reserve_book(Book book) {
        ArrayList<String> List = new ArrayList<String>() ;
        if(bookList.contains(book.book_name) && !(reservedList.contains(book.book_name) ))  {
            reservedList.add(book.book_name);

        return reservedList ;
        }
        else
            return List;
    }
}
