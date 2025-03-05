import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf() {
        firstLetter = 'A';
        books = new ArrayList<Book>();
    }

    public BookShelf(char firstLetter) {
        this.firstLetter = firstLetter;
        books = new ArrayList<Book>();
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public void addBook(Book book) {
        if(book.title.charAt(0) == firstLetter) {
            books.add(book);
        }
        else {
            return;
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        if (books.size() == 0) {
            return "Empty";
        }
        String result = "";
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).toString() + "   ";
        }
        return result;
    }
}
