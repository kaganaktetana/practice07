

package semester1.practice07;

public class Task_25 {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("tanya", "tanya@example.com");
        UserAccount user2 = new UserAccount("olena", "olena@example.com");
        UserAccount user3 = new UserAccount("ivan", "ivan@example.com");

        user1.printInfo();
        user2.printInfo();
        user3.printInfo();

        System.out.println("Наступний доступний ID: "
                + UserAccount.getNextAvailableId());
    }
}

class UserAccount {
    private int id;
    private String username;
    private String email;

    private static int nextId = 1001;

    public UserAccount(String username, String email) {
        this.id = nextId++;
        this.username = username;
        this.email = email;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {
        nextId = startId;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Логін: " + username);
        System.out.println("Email: " + email);
        System.out.println();
    }
}