import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    void add_book(Book book)
    {
        books.add(book);
        System.out.println("Kitap eklendi");
    }
    void borrow_book(String name)
    {
        Book temp = found_book_by_name(name);
        if(temp.getCan_borrowed())
        {
            temp.setCan_borrowed(false);
            System.out.println(name + " ödünç alındı.");
        }
        else
            System.out.println(name + " ödünç alınamadı.");
    }
    void borrow_book(Book book)
    {
        if(book.getCan_borrowed())
        {
            book.setCan_borrowed(false);
            System.out.println(book.getName() + " ödünç alındı.");
        }
        else
            System.out.println(book.getName() + " ödünç alınamadı.");
    }
    void give_borrowed_book(String name)
    {
        Book temp = found_book_by_name(name);
        if(!temp.getCan_borrowed())
        {
            temp.setCan_borrowed(true);
            System.out.println(name + " teslim edildi.");
        }
        else
            System.out.println(name + " teslim edilemedi.");
    }
    void give_borrowed_book(Book book)
    {
        if(!book.getCan_borrowed())
        {
            book.setCan_borrowed(true);
            System.out.println(book.getName() + " teslim edildi.");
        }
        else
            System.out.println(book.getName() + " teslim edilemedi.");
    }
    Book found_book_by_name(String name)
    {
        for(int i = 0; i< books.size();i++)
        {
            if(books.get(i).getName() == name)
            {
                return books.get(i);
            }
        }
        throw new RuntimeException("Kitap bulunamadı");
    }
    void print()
    {
        for(int i = 0;i< books.size();i++)
        {
            System.out.printf(books.get(i).toString());
        }
    }
}
