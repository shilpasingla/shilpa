import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserData {
    static ArrayList<User> userList = new ArrayList<User>() ;
    public static void init() {
        userList.add(new User("111-1111","1"));
        userList.add(new User("222-2222","2"));
        userList.add(new User("333-3333","3"));
        userList.add(new User("444-4444","4"));
        userList.add(new User("555-5555","5"));
    }
}
