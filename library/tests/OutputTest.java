import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class OutputTest {
    @Test
    public void testPrint() throws Exception{
        Output mockOutput = mock(Output.class);
        library lib = new library();
        menu menuu = new menu(mockOutput ,new Input() ,lib) ;
        verify(mockOutput).print("Welcome to the Bangalore Public Library System");
    }
}
