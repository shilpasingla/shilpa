import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class InputTest {
    @Test
    public void testRead() throws Exception{
        Input mockInput = mock(Input.class);

        when(mockInput.read()).thenReturn(0);
        assertEquals(mockInput.read(),0);
    }
    @Test
    public void testReadString() throws Exception{
        Input mockInput = mock(Input.class);

        when(mockInput.readString()).thenReturn("0");
        assertEquals(mockInput.readString(),"0");
    }
}
