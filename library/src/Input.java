import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 7:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Input {
    public static int read()throws IOException {
        BufferedReader brMenuOption = new BufferedReader(new InputStreamReader(System.in));
        String SMenuOption = brMenuOption.readLine();
        int MenuOption = Integer.parseInt(SMenuOption);
        return MenuOption;
    }

    public static String readString()throws IOException {
        BufferedReader brMenuOption = new BufferedReader(new InputStreamReader(System.in));
        String SMenuOption = brMenuOption.readLine();
        return SMenuOption;
    }
}
