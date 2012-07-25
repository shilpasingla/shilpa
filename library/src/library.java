import java.io.IOException;
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
    private Output output;
    private Input input;

     public library() {

     }

    public library(Output output, Input input) throws IOException {
        this.output = output;
        this.input = input;

        output.print("Welcome to the Bangalore Public Library System");
        addBooks();





    }

    private void addBooks() {
        Book book1 = new Book("head first java");
        Book book2 = new Book("programming in c");
        addBook(book1);
        addBook(book2);
    }

    public  ArrayList<String> get_all_books() {
        return bookList;

    }


    public void addBook(Book book) {

        bookList.add(book.book_name) ;

    }

    public Boolean reserve_book(Book bb) {

        if(bookList.contains(bb.book_name) && !(reservedList.contains(bb.book_name) ))  {
            reservedList.add(bb.book_name);

        return true ;
        }
        else
            return false;
    }
    public static void main(String[] args) throws IOException {
        Output out = new Output();
        Input in = new Input();
        library lib = new library(out,in);
        menu menuu = new menu(out,in,lib);

    }
}
