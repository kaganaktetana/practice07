
package semester1.practice07;

public class Task_14 {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder(
                "Капучино", "Large", 2, true);

        CoffeeOrder order2 = new CoffeeOrder("Еспресо", "Small");
        CoffeeOrder order3 = new CoffeeOrder("Лате");

        order1.printReceipt();
        order2.printReceipt();
        order3.printReceipt();
    }
}

class CoffeeOrder {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    public CoffeeOrder(String type, String size,
                       int sugarCount, boolean withSyrup) {
        this.type = type;
        this.size = size;
        this.sugarCount = sugarCount < 0 ? 0 : sugarCount;
        this.withSyrup = withSyrup;
        this.finalPrice = calculatePrice();
    }

    public CoffeeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {
        double basePrice;

        switch (type) {
            case "Еспресо":
                basePrice = 40;
                break;
            case "Капучино":
                basePrice = 55;
                break;
            case "Лате":
                basePrice = 60;
                break;
            default:
                basePrice = 0;
        }

        double sizeMultiplier;

        switch (size) {
            case "Small":
                sizeMultiplier = 1.0;
                break;
            case "Medium":
                sizeMultiplier = 1.3;
                break;
            case "Large":
                sizeMultiplier = 1.6;
                break;
            default:
                sizeMultiplier = 1.0;
        }

        double price = basePrice * sizeMultiplier;

        if (withSyrup) {
            price += 15;
        }

        return price;
    }

    public void printReceipt() {
        System.out.println("===== ЧЕК =====");
        System.out.println("Кава: " + type);
        System.out.println("Розмір: " + size);
        System.out.println("Цукор: " + sugarCount + " порцій");
        System.out.println("Сироп: " + (withSyrup ? "Так" : "Ні"));
        System.out.printf("До сплати: %.2f грн%n", finalPrice);
        System.out.println();
    }
}