import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 7:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    ArrayList<Book> bookList = new ArrayList<Book> ();


    public ArrayList<Book> viewBooks() {
        for(int i=0;i<bookList.size();i++) {
            Output.print(bookList.get(i).name);
        }
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean reserveBook(Book book) {
        for(int i=0;i<bookList.size();i++){
        if((bookList.get(i).equals(book) ) && bookList.get(i).hashCode() == book.hashCode()&& !(bookList.get(i).reserved) )  {
            bookList.get(i).reserved = true;
            return true;
        }}
        return false;
    }

    public ArrayList<Movie> viewMovies() {
        for(int i=0;i<MovieData.movieList.size();i++) {
            Output.print(MovieData.movieList.get(i).getName() + "\t"
                    + MovieData.movieList.get(i).getDirector() + "\t" + MovieData.movieList.get(i).getRating()  );
        }
        return MovieData.movieList;
    }


}
