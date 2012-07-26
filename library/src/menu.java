import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 25/7/12
 * Time: 6:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class menu {
    private Output output;
    private Input input;

    menu() {

    }

    menu(Output output,Input input,library lib) throws IOException {
        this.output = output;
        this.input = input;
        output.print("Welcome to the Bangalore Public Library System");
        selectMenu(lib);
    }
    public void selectMenu(library lib) throws IOException {
        output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
         try {
        int menuOption = input.read();


        if(menuOption == 1){
                    output.print("List of Books");

                    ArrayList<String> books = lib.get_all_books();

                    for(int i=0;i<2;i++)
                        output.print(books.get(i)) ;
                    output.print("Please Select one of the following menu options\n1. Reserve a Book\n2. Go to Main Menu\n3. Exit");
                    try {
                        selectSecondOption(lib);} catch (IOException ioe){System.exit(1);}

                }
                else if(menuOption == 2){

                    output.print("reserve a book");
                    output.print("enter name of book");
                    String bookname = input.readString();
                    Book bb = new Book(bookname);
                    Boolean reserved = lib.reserve_book(bb);
                    if(reserved == false)
                        output.print("Sorry we don't have that book yet.");
                    else
                        output.print("Thank You! Enjoy the book");

                }
                else if(menuOption == 3) {
                    output.print("Exit");

                }
                else
                    output.print("Select a Valid Option");   }
         catch(Exception e) {
        System.out.println("error");
         }
                }


    public void selectSecondOption(library lib) throws IOException {
        try {
        int menuOption = input.read();

                if(menuOption == 1){
                    output.print("Reserve a Book");
                    output.print("\n enter name of book");
                    String bookname = input.readString();
                    Book bb = new Book(bookname);
                    Boolean reserved = lib.reserve_book(bb);
                    if(reserved == false)
                        output.print("Sorry we don't have that book yet.");
                    else
                        output.print("Thank You! Enjoy the book");


                }
                else if(menuOption == 2){
                    selectMenu(lib);

                }
                else if(menuOption == 3) {
                    output.print("Exit");

                }
                else
                    output.print("Select a Valid Option");   }
        catch(Exception e)
        {
            System.out.println("error");
        }



} }
