import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void shouldReturnName(){
        Movie movie1 = new Movie("sholay","ramesh sippy",9);
        String name = movie1.getName() ;
        assertEquals("sholay",name);
        Movie movie2 = new Movie("znmd","zoya akhtar",8);
        name = movie2.getName() ;
        assertEquals("znmd",name);
    }

    @Test
    public void shouldReturnDirector(){
        Movie movie1 = new Movie("sholay","ramesh sippy",9);
        String director = movie1.getDirector() ;
        assertEquals("ramesh sippy",director);
        Movie movie2 = new Movie("znmd","zoya akhtar",8);
        director = movie2.getDirector() ;
        assertEquals("zoya akhtar",director);
    }

    @Test
    public void shouldReturnRating(){
        Movie movie1 = new Movie("sholay","ramesh sippy",9);
        int rating = movie1.getRating() ;
        assertEquals(9,rating);
        Movie movie2 = new Movie("znmd","zoya akhtar",8);
        rating = movie2.getRating() ;
        assertEquals(8,rating);
    }
}
