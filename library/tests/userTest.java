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
        User user = new User("111-1111","1");

@Test
public void testGetName() throws Exception {
        assertEquals(user.getName(),"111-1111");
}


    @Test
    public void testGetPasswd() throws Exception {
        assertEquals(user.getPasswd() ,"1");
    }
    @Test
    public void testEquals() throws Exception {
        User user1 = new User("111-1111","1") ;
        User user2 = new User("111-1111","1") ;
        Boolean b = user1.equals(user2) ;
        assertEquals(user1,user2) ;
    }
}
