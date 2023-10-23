public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.add_book(new Book("Sefiller"));
        library.add_book(new Book("Otostopçunun Galaksi Rehberi"));
        library.print();
    }
}