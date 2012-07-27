import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    Movie m = new Movie("sholay","ramesh sippy",9);
    @Test
    public void testGetName() throws Exception {

        assertEquals(m.getName(),"sholay");
    }

    @Test
    public void testGetDirector() throws Exception {
        assertEquals(m.getDirector(),"ramesh sippy");
    }

    @Test
    public void testGetRating() throws Exception {
        assertEquals(m.getRating(),9);
    }
}
