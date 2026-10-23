package semester1.practice07;

public class Task_40 {
    public static void main(String[] args) {
        LibraryCatalog library = new LibraryCatalog(5);

        BookItem book1 = new BookItem(
                "ISBN-001", "1984", "Джордж Орвелл");
        BookItem book2 = new BookItem(
                "ISBN-002", "Маленький принц", "Антуан де Сент-Екзюпері");
        BookItem book3 = new BookItem(
                "ISBN-003", "Франкенштейн", "Мері Шеллі");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Каталог до видачі:");
        library.printCatalog();

        System.out.println("\nПерша спроба взяти «1984»: "
                + library.borrowBook("1984"));

        System.out.println("Друга спроба взяти «1984»: "
                + library.borrowBook("1984"));

        System.out.println("\nКаталог після спроб:");
        library.printCatalog();
    }
}

class BookItem {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public BookItem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void printBook() {
        System.out.println("Назва: " + title
                + ", автор: " + author
                + ", ISBN: " + isbn
                + ", статус: "
                + (isAvailable ? "доступна" : "видана"));
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

class LibraryCatalog {
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity) {
        books = new BookItem[capacity];
        size = 0;
    }

    public void addBook(BookItem book) {
        if (book == null) {
            System.out.println("Помилка: книга не існує.");
            return;
        }

        if (size >= books.length) {
            System.out.println("Каталог заповнений!");
            return;
        }

        books[size] = book;
        size++;
    }

    public BookItem findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }

        return null;
    }

    public boolean borrowBook(String title) {
        BookItem book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Книгу не знайдено.");
            return false;
        }

        if (!book.isAvailable()) {
            System.out.println("Книга вже видана.");
            return false;
        }

        book.borrowBook();
        System.out.println("Книгу «" + title + "» видано.");
        return true;
    }

    public void printCatalog() {
        for (int i = 0; i < size; i++) {
            books[i].printBook();
        }
    }
}