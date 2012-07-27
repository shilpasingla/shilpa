import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class loginTest {
    @Test
    public void shouldAddUser() {
        login log = new login() ;
        log.addUser(new User());
        ArrayList<User> users = log.get_all_users();
        assertEquals(1, users.size()) ;

        log.addUser(new User());
        users = log.get_all_users();
        assertEquals(2, users.size()) ;


    }
    @Test
    public void shouldCheckLoginDetails() {
        String username = "111-1111";
        String password = "1";
        User user = new User(username ,password ) ;
        login log = new login();
          log.addUser(user) ;
        Boolean bb = log.checkLoginDetails(username, password);
        assertEquals(true,bb);
    }
}
