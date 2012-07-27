/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 5:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    String name;
    String director;
    int rating;
    Movie() {}

    Movie(String name,String director,int rating)   {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }


    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }
}
