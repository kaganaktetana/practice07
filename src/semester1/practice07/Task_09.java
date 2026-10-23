
package semester1.practice07;

public class Task_09 {
    public static void main(String[] args) {
        User user1 = new User(
                "tanya", "tanya@example.com", "ADMIN", true);
        User user2 = new User("olena", "olena@example.com");
        User user3 = new User("ivan");
        User user4 = new User();

        user1.printProfile();
        user2.printProfile();
        user3.printProfile();
        user4.printProfile();
    }
}

class User {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login, String email,
                String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public User(String login, String email) {
        this(login, email, "USER", true);
    }

    public User(String login) {
        this(login, login + "@domain.com");
    }

    public User() {
        this("guest");
    }

    public void printProfile() {
        System.out.println("===== ПРОФІЛЬ КОРИСТУВАЧА =====");
        System.out.println("Логін: " + login);
        System.out.println("Email: " + email);
        System.out.println("Роль: " + role);
        System.out.println("Активний: " + isActive);
        System.out.println();
    }
}