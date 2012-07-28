/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 26/7/12
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    String username;
    String password;

User() {}
    User(String username,String password)  {
        this.username = username ;
        this.password = password ;
    }

    public String getName(){return(this.username);}
    public String getPasswd(){return(this.password);}

    public boolean equals(Object user) {
        User u = (User) user;
        if(getName().equals(u.getName()) && (getPasswd().equals(u.getPasswd() )) )
        return true;
        else
        return false;
    }
}
