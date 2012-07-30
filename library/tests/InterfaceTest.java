import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 28/7/12
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class InterfaceTest {

    @Test
    public void testSelectMenu() throws Exception {
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        Library lib = new Library();
        when(mockInput.read()).thenReturn(3).thenReturn(5).thenReturn(1).thenReturn(2).thenReturn(4).thenReturn(6) ;
        (new Interface()).selectMenu(lib);
        verify(mockOutput).print("list of movies");
        (new Interface()).selectMenu(lib);
        verify(mockOutput).print("exit");
        verify(mockOutput).print("View Books");
        (new Interface()).selectMenu(lib);
        verify(mockOutput).print("Reserve a Book");
        verify(mockOutput).print("enter username");
        verify(mockOutput).print("Select a Valid Option");
    }

}
