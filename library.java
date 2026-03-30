import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After removing book:");
        lib.displayBooks();
    }
}import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.ISBN.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("After removing book:");
        lib.displayBooks();
    }
}
