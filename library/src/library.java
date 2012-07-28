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
    private Output output;
    private Input input;

      library()
      {
         addMovies();
      }

    public void addMovies() {
        movieLibrary m = new movieLibrary() ;
        for(int i=0;i<m.total_movies ;i++)  {
            Movie movie = new Movie(m.movie_names[i],m.director_names[i],m.ratings [i]) ;
            addMovie(movie) ;
        }

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
