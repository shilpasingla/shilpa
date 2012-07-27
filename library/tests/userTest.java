import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 27/7/12
 * Time: 6:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class userTest  {
        User user = new User("111-1111","q");

@Test
public void testGetName() throws Exception {
        assertEquals(user.getName(),"111-1111");
}
}
