package semester1.practice07;

public class Task_05 {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Task_05(String name, double price, int quantity, String category) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException(
                    "Ціна та кількість не можуть бути від'ємними!"
            );
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException(
                    "Знижка має бути від 0% до 100%!"
            );
        }

        price = price - price * percent / 100;
    }

    public void printProduct() {
        System.out.println("===== Картка товару =====");
        System.out.println("Назва: " + name);
        System.out.printf("Ціна за одиницю: %.2f грн%n", price);
        System.out.println("Кількість: " + quantity);
        System.out.println("Категорія: " + category);
        System.out.printf("Вартість партії: %.2f грн%n", getTotalValue());
        System.out.println("=========================");
    }
}