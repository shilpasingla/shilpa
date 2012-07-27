import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 20/7/12
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class library {
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Book> reservedList = new ArrayList<Book>();
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    String[] movie_names = {"sholay","housefull","peepli","znmd","aag"};
    String[] director_names = {"ramesh sippy","sajid khan","aamir khan","zoya akhtar","ram gopal verma"};
    int[] ratings = {9,7,7,9,5};
    private Output output;
    private Input input;

     public library() {
        addBooks();
         addMovies();
     }

    private void addMovies() {
        for(int i=0;i<5;i++)  {
            Movie movie = new Movie(movie_names[i],director_names[i],ratings [i]) ;
            addMovie(movie) ;
        }
    }


    private void addBooks() {
        Book book1 = new Book("head first java");
        Book book2 = new Book("programming in c");
        addBook(book1);
        addBook(book2);
    }

    public  ArrayList<Book> get_all_books() {
        return bookList;

    }


    public void addBook(Book book) {

        bookList.add(book) ;

    }
    public void addMovie(Movie movie) {


        movieList.add(movie);

    }

    public boolean  reserve_book(library lib,Book bb) {

        if(!(lib.reservedList.contains(bb)))  {
            reservedList.add(bb);
             return true;
        }
            else
            return false;
        }


    public ArrayList<Movie> get_all_movies() {
        return movieList;
    }
}
