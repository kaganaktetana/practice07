
package semester1.practice07;

public class Task_03 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "UA123456", "Тетяна", 1000.0);

        account.printAccount();

        account.deposit(500.0);
        account.withdraw(2000.0);

        account.printAccount();
    }
}

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName,
                       double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance < 0 ? 0.0 : initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнення: " + amount + " грн");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Зняття коштів відхилено!");
            return false;
        }

        balance -= amount;
        System.out.println("Знято: " + amount + " грн");
        return true;
    }

    public void printAccount() {
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Власник: " + ownerName);
        System.out.printf("Баланс: %.2f грн%n", balance);
        System.out.println();
    }
}