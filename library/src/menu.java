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
        output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. View list of movies\n4. Exit");
         try {
        int menuOption = input.read();


        if(menuOption == 1){
                    output.print("List of Books");

                    ArrayList<Book> books = lib.get_all_books();

                    for(int i=0;i<2;i++)
                        output.print(books.get(i).book_name ) ;

                    try {
                        selectMenu(lib);} catch (IOException ioe){System.exit(1);}

                }
                else if(menuOption == 2){
                    Boolean reserved = false;
                    output.print("reserve a book");
                    output.print("enter name of book");
                    String bookname = input.readString();
                     for(int i=0;i<2;i++){
                         String s1 =  lib.bookList.get(i).book_name;
                         if(s1.equals(bookname) )  {

                             Book bb = lib.bookList.get(i);
                              reserved = lib.reserve_book(lib,bb);
                               break;
                         }    }
                         if(reserved == true)
                             output.print("Thank You! Enjoy the book");
                         else
                             output.print("Sorry we don't have that book yet.");







                }
                else if(menuOption == 3) {
                    output.print("View list of movies");
                    ArrayList<Movie> movies = lib.get_all_movies();
                    System.out.println("Name"+"   "+"Director"+"    "+"Rating");
                    for(int i=0;i<5;i++)
                        System.out.println(movies.get(i).name+" "+movies.get(i).director+" " +movies.get(i).rating);
                }
                else if(menuOption == 4) {
                    output.print("Exit");

                }
                else
                    output.print("Select a Valid Option");   }
         catch(Exception e) {
        System.out.println("error");
         }
                }



    public static void main(String[] args) throws IOException {
        Output out = new Output();
        Input in = new Input();
        library ll = new library();
        ll.addBook(new Book("head first java") ) ;
        menu menuu = new menu(out,in,ll);

    }
}
