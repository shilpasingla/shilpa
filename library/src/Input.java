import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 24/7/12
 * Time: 6:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Input {
    public int read()throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int MenuOption = Integer.parseInt(s);
        return MenuOption;
    }
    public String readString()throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();

        return s;
    }
}
