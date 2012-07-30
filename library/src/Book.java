/**
 * Created with IntelliJ IDEA.
 * User: shisun
 * Date: 29/7/12
 * Time: 7:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    boolean reserved;
    String name;
    Book() {
        this.reserved = false;
    }
    Book(String name)
    {
        this.name = name;
    }

    public boolean equals(Object object) {
        Book book= (Book) object;
        return name.equals(book.name) ;
    }

    public int hashCode() {
        return 0;
    }
}
