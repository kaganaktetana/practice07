package semester1.practice07;

public class Task_38 {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Ноутбук", 20000);
        Product mouse = new Product(2, "Мишка", 500);
        Product keyboard = new Product(3, "Клавіатура", 1000);

        Customer richCustomer = new Customer("Іван", 30000);
        Order order1 = new Order(richCustomer, 5);

        order1.addProduct(laptop);
        order1.addProduct(mouse);
        order1.addProduct(keyboard);

        System.out.println("Замовлення клієнта Іван:");
        order1.checkout();

        System.out.println();

        Customer poorCustomer = new Customer("Марія", 1000);
        Order order2 = new Order(poorCustomer, 5);

        order2.addProduct(laptop);
        order2.addProduct(mouse);

        System.out.println("Замовлення клієнта Марія:");
        order2.checkout();
    }
}

class Product {
    private int id;
    private String title;
    private double price;

    public Product(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private double walletBalance;

    public Customer(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean pay(double amount) {
        if (amount <= 0 || walletBalance < amount) {
            return false;
        }

        walletBalance -= amount;
        return true;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}

class Order {
    private Customer customer;
    private Product[] items;
    private int itemCount;

    public Order(Customer customer, int maxItems) {
        this.customer = customer;
        this.items = new Product[maxItems];
        this.itemCount = 0;
    }

    public void addProduct(Product p) {
        if (p == null) {
            System.out.println("Помилка: товар не існує.");
            return;
        }

        if (itemCount >= items.length) {
            System.out.println("Помилка: кошик заповнений.");
            return;
        }

        items[itemCount] = p;
        itemCount++;
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }

        return total;
    }

    public boolean checkout() {
        double total = calculateTotal();

        if (customer.pay(total)) {
            System.out.println("Чек для: " + customer.getName());

            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i].getTitle() + " — "
                        + items[i].getPrice() + " грн");
            }

            System.out.println("Разом: " + total + " грн");
            System.out.println("Залишок коштів: "
                    + customer.getWalletBalance() + " грн");

            return true;
        } else {
            System.out.println("Недостатньо коштів для оплати!");
            return false;
        }
    }
}