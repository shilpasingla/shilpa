import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieDataTest {
    @Test
    public void shouldStoreAllMovies() {
        MovieData.init();
        assertEquals(5,MovieData.movieList.size());
    }
}
