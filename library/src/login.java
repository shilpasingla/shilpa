import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 6:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class login {

    ArrayList<User> userList = new ArrayList<User>();

    login() {
        addUsers() ;
    }

    public void addUsers() {
        userData us = new userData() ;
        for(int i=0;i<us.total_users ;i++)  {
            User user = new User(us.user_names[i],us.password[i] ) ;
            addUser(user) ;
        }
    }
     public void addUser(User user) {
        userList.add(user);
    }

   public ArrayList<User> get_all_users() {
        return userList;
    }

    public boolean  checkLoginDetails(User user)  {
                 userData us = new userData() ;
                 for(int i=0;i<us.total_users ;i++) {
                     if(userList.get(i).equals(user) )
                         return true;

                 }
               return false;
    }
}
