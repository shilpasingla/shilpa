/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 17/7/12
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class library_sysTest {
    library_sys lb = new library_sys();
    //@Test
    /*public void testread() throws Exception {

        assertEquals(lb.read("1"), "list of books") ;
        assertEquals(lb.read("2"),"enter book code" ) ;
        assertEquals(lb.read("3"),"exit" ) ;
        assertEquals(lb.read("4"),"Select a valid option!!!" ) ;
    }  */
    @Test
    public void testview() throws Exception {
            String i = "1";
             int l = Integer.parseInt(i)  ;
        String books[] = {"head first java","programming in C++"};
        for(Map.Entry<Integer, String> entry : lb.List.entrySet()) {
            assertEquals(i,entry.getKey())  ;
            assertEquals(books[l-1],entry.getValue());
        }


    }
    @Test
    public void testissue() throws Exception {
        assertEquals(lb.issuebook(1), "issued") ;
        assertEquals(lb.issuebook(4),"not issued" ) ;
    }
}
