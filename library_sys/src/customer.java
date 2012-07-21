import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 20/7/12
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class customer {
    customer() {

    }
    customer (library lib)
    {
        System.out.println("enter your choice")     ;
        String CurLine = ""; // Line read from standard in

        Book b1 = new Book();
        try {
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        CurLine = in.readLine();
        }
        catch (Exception ex){

        }
        if ((CurLine.equals("1"))){
            ArrayList<String> books = lib.get_all_books();
             System.out.println(books) ;
        }
        else if ((CurLine.equals("2"))){
               System.out.println("enter name of book");
            try {
                InputStreamReader cnverter = new InputStreamReader(System.in);
                BufferedReader inn = new BufferedReader(cnverter);
                b1.book_name = inn.readLine();
            }
            catch (Exception ex){

            }
            ArrayList<String> res_books = lib.reserve_book(b1);
            if(res_books.isEmpty())
                System.out.println("Sorry we don't have that book yet.");
            else
                System.out.println("Thank You! Enjoy the book."   );
        }
        else if ((CurLine.equals("3"))){

        }
        else{
            System.out.println("select a valid option!!");
        }
    }
                }
