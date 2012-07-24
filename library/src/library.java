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

           selectMenu();



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
    public void selectMenu() throws IOException {
        output.print("Please Select one of the following menu options\n1. View Books\n2. Reserve a Book\n3. Exit");
        while(true){
            try {int menuOption = input.read();
                if(menuOption == 1){
                    output.print("List of Books");

                    ArrayList<String> books = get_all_books();

                    for(int i=0;i<2;i++)
                        output.print(books.get(i)) ;
                    output.print("Please Select one of the following menu options\n1. Reserve a Book\n2. Go to Main Menu\n3. Exit");
                    try {
                        selectSecondOption();} catch (IOException ioe){System.exit(1);}
                    break;
                }
                else if(menuOption == 2){

                    output.print("reserve a book");
                    output.print("enter name of book");
                    String bookname = input.readString();
                    Book bb = new Book(bookname);
                    ArrayList<String> list = reserve_book(bb);
                    if(list.size() == 0)
                        output.print("Sorry we don't have that book yet.");
                    else
                        output.print("Thank You! Enjoy the book");
                    break;
                }
                else if(menuOption == 3) {
                    output.print("Exit");
                    break;
                }
                else
                    output.print("Select a Valid Option");

            }catch(IOException ioe) {System.out.println("ERROR");}
    }    }


    public void selectSecondOption() throws IOException {
        while(true){
            try {int menuOption = input.read();
                if(menuOption == 1){
                    output.print("Reserve a Book");
                    output.print("\n enter name of book");
                    String bookname = input.readString();
                    Book bb = new Book(bookname);
                    ArrayList<String> list = reserve_book(bb);
                    if(list.size() == 0)
                        output.print("Sorry we don't have that book yet.");
                    else
                        output.print("Thank You! Enjoy the book");
                    break;

                }
                else if(menuOption == 2){
                    selectMenu();
                    break;
                }
                else if(menuOption == 3) {
                    output.print("Exit");
                    break;
                }
                else
                    output.print("Select a Valid Option");

            }catch(IOException ioe) {System.out.println("ERROR");}
        }
    }


    public void addBook(Book book) {

        bookList.add(book.book_name) ;

    }

    public ArrayList<String> reserve_book(Book bb) {
        ArrayList<String> List = new ArrayList<String>() ;
        if(bookList.contains(bb.book_name) && !(reservedList.contains(bb.book_name) ))  {
            reservedList.add(bb.book_name);

        return reservedList ;
        }
        else
            return List;
    }
    public static void main(String[] args) throws IOException {
        Output out = new Output();
        Input in = new Input();
        library lib = new library(out,in);

    }
}
