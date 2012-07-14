/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 14/7/12
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 14/7/12
 * Time: 8:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class library{

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Bangalore Public Library System");
        System.out.println("");
        System.out.println("1.view all books")    ;
        System.out.println("2.reserve a book")    ;
        System.out.println("3. exit")    ;
        System.out.println("enter your choice")     ;
        String CurLine = ""; // Line read from standard in

        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        CurLine = in.readLine();
        if ((CurLine.equals("1"))){
            viewbooks();
        }
        else if ((CurLine.equals("2"))){
            reservebook();
        }
        else if ((CurLine.equals("3"))){

        }
        else{
            System.out.println("select a valid option!!");
        }
    }

    private static void reservebook() throws IOException {
        ArrayList<Integer> reservedList = new ArrayList<Integer>();
        System.out.println("enter book code");
        String CurLine = ""; // Line read from standard in
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        CurLine = in.readLine();
        int i = Integer.parseInt(CurLine);
        if(!reservedList.contains(i)){
            reservedList.add(i);
            System.out.println("Thank You! Enjoy the book.");

        }

        else{
            System.out.println("Sorry we don't have that book yet.");
        }


        //To change body of created methods use File | Settings | File Templates.
    }

    public static void viewbooks() {
        HashMap<Integer,String> List = new HashMap<Integer, String>();

        List.put(1,"head first java") ;
        List.put(2,"programming in C++")   ;
        for(Map.Entry<Integer, String> entry : List.entrySet())
            System.out.println(entry.getKey() + "   " + entry.getValue());
        //To change body of created methods use File | Settings | File Templates.
    }


}
