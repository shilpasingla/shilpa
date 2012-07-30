import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class EntryTest {
    @Test
    public void shouldCheckLoginDetails() {
        UserData.init();
        boolean b = Entry.checkLoginDetails("111-1111","1") ;
        assertEquals(true,b);
         b =   Entry.checkLoginDetails("111-1111","2") ;
        assertEquals(false,b);

    }
}
