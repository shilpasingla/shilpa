import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 8:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {
    @Test
    public void testEquality() {
        assertTrue(new Book("head first java").equals(new Book("head first java")));
        assertFalse(new Book("head first java").equals(new Book("programming in c")));
    }

    @Test
    public void checkHashCode() {
        assertEquals(0,new Book().hashCode() );
    }
}
