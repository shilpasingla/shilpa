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
         userData us = new userData() ;

        log.addUser(new User());
        ArrayList<User> users = log.get_all_users();
        assertEquals(us.total_users +1, users.size()) ;

        log.addUser(new User());
        users = log.get_all_users();
        assertEquals(us.total_users +2, users.size()) ;


    }
    @Test
    public void shouldCheckLoginDetails() {

        User user = new User("111-1111","1") ;

        login log = new login();

        Boolean bb = log.checkLoginDetails(user);
        assertEquals(true,bb);
    }

    @Test
    public void shouldAddUsers()  {
        login log = new login();
        userData  us = new userData() ;
        assertEquals(us.total_users ,log.userList.size() ) ;
    }

    @Test
    public void shouldReturnAllUsers()  {
        login log = new login();
        ArrayList <User> users = log.get_all_users();
        userData us = new userData() ;
        assertEquals(us.total_users,users.size() );

    }
}
