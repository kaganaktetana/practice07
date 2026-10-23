
package semester1.practice07;

public class Task_20 {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("Програму запущено");
        logger.log("WARNING", "Недостатньо вільної пам'яті");
        logger.log("ERROR", 404, "Сторінку не знайдено");
        logger.log("DATABASE", "Підключення до бази даних", true);
    }
}

class Logger {
    public void log(String message) {
        System.out.println("[INFO] " + message);
    }

    public void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }

    public void log(String level, int errorCode, String message) {
        System.out.println("[" + level + "] (Code: "
                + errorCode + "): " + message);
    }

    public void log(String tag, String message, boolean timestamp) {
        if (timestamp) {
            System.out.println("[" + tag + "] ["
                    + System.currentTimeMillis() + "] " + message);
        } else {
            System.out.println("[" + tag + "] " + message);
        }
    }
}