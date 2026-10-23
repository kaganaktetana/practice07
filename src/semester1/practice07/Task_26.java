
package semester1.practice07;

public class Task_26 {
    public static void main(String[] args) {
        System.out.println("Сервер: " + ServerConfig.SERVER_NAME);

        for (int i = 1; i <= 6; i++) {
            if (ServerConfig.connect()) {
                System.out.println("Користувач " + i + " підключився.");
            } else {
                System.out.println("Користувачу " + i
                        + " відмовлено: ліміт вичерпано.");
            }
        }

        ServerConfig.printServerStatus();

        ServerConfig.disconnect();
        ServerConfig.printServerStatus();
    }
}

class ServerConfig {
    public static final String SERVER_NAME = "AlphaEnterprise";
    public static final int MAX_CONNECTIONS = 5;

    private static int activeConnections = 0;

    public static boolean connect() {
        if (activeConnections < MAX_CONNECTIONS) {
            activeConnections++;
            return true;
        }

        return false;
    }

    public static void disconnect() {
        if (activeConnections > 0) {
            activeConnections--;
        }
    }

    public static void printServerStatus() {
        System.out.println("Активні підключення: " + activeConnections);
        System.out.println("Вільні слоти: "
                + (MAX_CONNECTIONS - activeConnections));
    }
}
