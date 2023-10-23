import java.util.HashMap;
import java.util.Map;
public class Borrow_app {
    Map<Student,Book> app = new HashMap<>();
    void Borrow_book(Student student, Book book)
    {
        if(book.getCan_borrowed())
        {
            app.put(student,book);
            book.setCan_borrowed(false);
        }
    }
    void Give_book(Student student, Book book)
    {
        if(!book.getCan_borrowed())
        {
            app.remove(student,book);
            book.setCan_borrowed(true);
        }
    }
}
