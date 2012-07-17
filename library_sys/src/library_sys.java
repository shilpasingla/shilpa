/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 17/7/12
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class library_sys {
    HashMap<Integer,String> List = new HashMap<Integer, String>();
    ArrayList<Integer> reservedList = new ArrayList<Integer>();
    int max_books = 2;
    public library_sys()
    {
        String welcm_str = "Welcome to Bangalore Public Library System";
        System.out.println(welcm_str);
        System.out.println("1.List books") ;
        System.out.println("2.Issue book") ;
        System.out.println("3.Exit")    ;

    }


    public String read(String s) throws IOException {
        String CurLine = " ";
        String result = " " ;
         int i = Integer.parseInt(s) ;
        switch(i) {
            case 1  :
                viewbooks();
                result = "list of books"  ;
                  break;
            case 2  :
                issuebook(2);
                 result = "enter book code"    ;
                break;
            case 3    :
                result = "exit"   ;
                     break;
            default :
                display();
                result = "Select a valid option!!!";

    }
        return result;
    }



    private void display() {
        System.out.println("Select a valid option!!");
    }

    public String issuebook(int i) throws IOException {

              String  result;
        if(!reservedList.contains(i) && i<max_books){
            reservedList.add(i);
            System.out.println("Thank You! Enjoy the book.");
               result = "issued";
        }

        else {
            System.out.println("Sorry we don't have that book yet.");
            result = "not issued";
        }
          return result;
    }

    private void viewbooks() {


        List.put(1,"head first java") ;
        List.put(2,"programming in C++")   ;
        for(Map.Entry<Integer, String> entry : List.entrySet())
            System.out.println(entry.getKey() + "   " + entry.getValue());
    }

    public static void main(String[] args) throws IOException   {
         library_sys lib = new library_sys();
        String CurLine = " ";
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        CurLine = in.readLine();
         lib.read(CurLine);

     }
}
