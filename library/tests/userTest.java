import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    @Test
    public void testEquality() {
        assertTrue(new User("111-1111","1").equals(new User("111-1111","1")));
        assertFalse(new User("111-1111","2").equals(new User("111-1111","1")));
        assertFalse(new User("111-1111","2").equals(new User("222-2222","2")));
        assertFalse(new User("111-1111","2").equals(new User("222-2222","1")));
    }

    @Test
    public void checkHashCode() {
        assertEquals(0,new Book().hashCode() );
    }
}
