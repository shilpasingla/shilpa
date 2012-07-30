import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 28/7/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interface {

     public static void main(String[] args) throws Exception
    {
        Library lib = new Library() ;
        MovieData.init();
        UserData.init();
        lib.addBook(new Book("head first java")) ;
        Output.print("Welcome to Bangalore Public Library System");
        selectMenu(lib);
    }

    public static void selectMenu(Library lib) throws Exception {
        System.out.println("\nMain Menu\n");
        System.out.println("1. View List of Books\t2. Make a Reservation\n3.List of movies4.sign in5. Exit");
        System.out.print("Enter your choice");
        switch (Input.read()){
            case 1:
                Output.print("View Books");
                ArrayList<Book> books = lib.viewBooks() ;
                break;
            case 2:
                Output.print("Reserve a Book");
                Output.print("enter name of book");
                String s = Input.readString() ;
                Boolean reserved = lib.reserveBook(new Book(s));
                if(reserved == true)
                    Output.print("Thank You! Enjoy the book");
                else
                   Output.print("Sorry we don't have that book yet");
                break;
            case 3:
                Output.print("list of movies");
                lib.viewMovies() ;
                break;
            case 4:
                Output.print("enter username");
                String username = Input.readString() ;
                Output .print("enter password") ;
                String password = Input.readString() ;
                Entry.checkLoginDetails(username,password) ;
                break;
            case 5:
                Output.print("Exit");
                break;
            default:
                Output.print("Select a Valid Option");
                break;

        }
    }


}
