/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    String username;
    String password;
    User(String username,String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean equals(Object object) {
        User user= (User) object;
        return username.equals(user.username) && password.equals(user.password);
    }

    public int hashCode() {
        return 0;
    }
}
