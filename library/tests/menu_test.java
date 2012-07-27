import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 25/7/12
 * Time: 7:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class menu_test {
    @Test
    public void testSelectMenu() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        library lib = new library();


        when(mockInput.read()).thenReturn(3).thenReturn(5).thenReturn(1).thenReturn(2);
        menu menuu = new menu(mockOutput ,mockInput ,lib);
        verify(mockOutput).print("View list of movies");
        menuu.selectMenu(lib) ;
        verify(mockOutput).print("Select a Valid Option");
        menuu.selectMenu(lib);
        verify(mockOutput).print("List of Books");

    }
    @Test
    public void testSelectSecondOption() throws Exception{
        Input mockInput = mock(Input.class);
        Output mockOutput = mock(Output.class);
        library lib = new library();
        menu menuu = new menu(mockOutput ,mockInput ,lib);
        when(mockInput.read()).thenReturn(1).thenReturn(3).thenReturn(4).thenReturn(1);

        menuu.selectSecondOption(lib) ;
        verify(mockOutput).print("Reserve a Book");
        menuu.selectSecondOption(lib) ;
        verify(mockOutput).print("Exit");
        //menuu.selectSecondOption(lib) ;
        verify(mockOutput).print("Select a Valid Option");
    }
    @Test
    public void testPrint() throws Exception{
        Output mockOutput = mock(Output.class);
        library lib = new library();
        menu menuu = new menu(mockOutput ,new Input() ,lib) ;
        verify(mockOutput).print("Welcome to the Bangalore Public Library System");
    }
}
