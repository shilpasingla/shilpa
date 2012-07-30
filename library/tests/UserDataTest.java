import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDataTest {
    @Test
    public void shouldStoreAllUsers() {
        UserData.init();
        assertEquals(5,UserData.userList.size());
    }
}
