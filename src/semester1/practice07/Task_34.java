package semester1.practice07;

public class Task_34 {
    public static void main(String[] args) {
        ClientAccount ivan =
                new ClientAccount("UA111111", "Іван", 10000);

        ClientAccount maria =
                new ClientAccount("UA222222", "Марія", 2000);

        boolean success = ivan.transferTo(maria, 3500);

        System.out.println("Переказ успішний: " + success);

        ivan.printAccount();
        maria.printAccount();
    }
}

class ClientAccount {
    private String iban;
    private String owner;
    private double balance;

    public ClientAccount(String iban, String owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean transferTo(ClientAccount recipient, double amount) {
        if (recipient == null || recipient == this) {
            return false;
        }

        if (amount <= 0 || balance < amount) {
            return false;
        }

        this.balance -= amount;
        recipient.balance += amount;

        return true;
    }

    public void printAccount() {
        System.out.println("Власник: " + owner);
        System.out.println("IBAN: " + iban);
        System.out.println("Баланс: " + balance + " грн");
        System.out.println();
    }
}
