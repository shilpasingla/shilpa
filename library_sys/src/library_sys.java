/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 17/7/12
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */

public class library_sys {
    public static void main(String[] args)   {
        System.out .println("Welcome to Bangalore Public Library System");
        System.out.println("1.view all books")    ;
        System.out.println("2.reserve a book")    ;
        System.out.println("3. exit")    ;
        library lib = new library();
        Book book1 = new Book("head first java");
        Book book2 = new Book("programming in c") ;
        lib.addBook(book1);
        lib.addBook(book2) ;

        customer c = new customer(lib);
    }

}
