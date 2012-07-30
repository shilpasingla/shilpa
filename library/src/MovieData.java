import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieData {
           static ArrayList<Movie> movieList = new ArrayList<Movie>() ;
            public static void init() {
                movieList.add(new Movie("sholay","ramesh sippy",9));
                movieList.add(new Movie("znmd","zoya akhtar",8));
                movieList.add(new Movie("shaitan","anurag kashyap",7));
                movieList.add(new Movie("metro","anurag kashyap",8));
                movieList.add(new Movie("agneepath","karan johar",9));
            }
}
