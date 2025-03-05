public class LibraryTester {
    public static void main(String[] args) {
        BookShelf oBooks = new BookShelf('O');
        BookShelf tBooks = new BookShelf('T');

        System.out.println(oBooks);
        System.out.println(tBooks);

        Book heartOfTheBetrayed = new Book("The Heart of the Betrayed", "Crime");
        Book hillOfStars = new Book("Our Hill of Stars", "Fantasy");
        Book oneOfAKind = new Book("One of a Kind", "Science Fiction");
        Book visionsOfRoses = new Book("The Vision of Roses", "Romance");

        System.out.println(heartOfTheBetrayed);
        System.out.println(hillOfStars);
        System.out.println(oneOfAKind);
        System.out.println(visionsOfRoses);

        oBooks.addBook(heartOfTheBetrayed);
        oBooks.addBook(hillOfStars);
        oBooks.addBook(oneOfAKind);
        oBooks.addBook(visionsOfRoses);

        tBooks.addBook(heartOfTheBetrayed);
        tBooks.addBook(hillOfStars);
        tBooks.addBook(oneOfAKind);
        tBooks.addBook(visionsOfRoses);

        System.out.println(oBooks);
        System.out.println(tBooks);
    }
}
