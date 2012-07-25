import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 25/7/12
 * Time: 8:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book_test {
    Book book = new Book("data structures");

    @Test
    public void testGetName() throws Exception {
        assertEquals(book.getName(),"data structures");
    }
}
