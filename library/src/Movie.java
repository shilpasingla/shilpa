/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    String name;
    String director;
    int rating;
    Movie() {}

    Movie(String name,String director,int rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
        }
    public String getName()
    {
        return this.name;

    }
    public String getDirector() {
        return this.director;
    }
    public int getRating() {
        return this.rating;
    }
}
