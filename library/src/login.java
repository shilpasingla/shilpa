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
    User[] users;
    String[] user_names = {"111-1111","222-2222","333-3333","444-4444","555-5555"};
    String[] password = {"1","2","3","4","5"};


    private void addUsers() {
        for(int i=0;i<5;i++)  {
             users[i].username = user_names[i];
             users[i].password = password[i];
            addUser(users[i]) ;
        }
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public ArrayList<User> get_all_users() {
        return userList;
    }

    public boolean  checkLoginDetails(String username,String password)  {

                 for(int i=0;i<5;i++) {
                     if(username .equals(userList.get(i).username)  && password .equals(userList.get(i).password ) )
                         return true;

                 }
               return false;
    }
}
