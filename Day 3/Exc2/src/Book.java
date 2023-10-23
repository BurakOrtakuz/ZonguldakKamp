public class Book
{
    private String name;
    private Boolean can_borrowed;
    public Book(String name) {
        this.name = name;
        this.can_borrowed = false;
    }

    public String getName() {
        return name;
    }

    public Boolean getCan_borrowed() {
        return can_borrowed;
    }

    public void setCan_borrowed(Boolean can_borrowed) {
        this.can_borrowed = can_borrowed;
    }

    @Override
    public String toString() {
        return "Book " +
                "name = '" + name + '\'' +
                ", can_borrowed=" + can_borrowed +
                '\n';
    }
}
