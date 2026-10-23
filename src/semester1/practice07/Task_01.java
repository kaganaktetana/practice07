
package semester1.practice07;

public class Task_01 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Кобзар", "Тарас Шевченко", 1840, 350.0);

        book1.printInfo();
        book2.printInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
        title = "Невідомо";
        author = "Невідомий";
        year = 2000;
        price = 0.0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year < 0 ? 2000 : year;
        this.price = price < 0.0 ? 0.0 : price;
    }

    public void printInfo() {
        System.out.println("Книга: " + title + " | Автор: " + author
                + " | Рік: " + year + " | Ціна: " + price + " грн");
    }
}