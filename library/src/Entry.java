/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Entry {

    public static boolean checkLoginDetails(String username,String password) {
        User user = new User(username,password) ;
        for(int i=0;i<UserData.userList.size();i++){
             if(user.equals(UserData.userList.get(i)) && user.hashCode() == UserData.userList.get(i).hashCode() )
                 return true;
        }
        return false;
    }
}
