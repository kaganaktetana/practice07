
package semester1.practice07;

public class Task_18 {
    public static void main(String[] args) {
        DocumentPrinter printer = new DocumentPrinter();

        printer.print("Привіт, світ!");
        printer.print(123);
        printer.print(3.1415926, 2);

        String[] lines = {
                "Перший рядок",
                "Другий рядок",
                "Третій рядок"
        };
        printer.print(lines);

        printer.print("java programming", true);
        printer.print("java programming", false);
    }
}

class DocumentPrinter {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println("[INT]: " + number);
    }

    public void print(double number, int decimals) {
        if (decimals < 0) {
            decimals = 0;
        }

        System.out.println(String.format("%." + decimals + "f", number));
    }

    public void print(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.println((i + 1) + ". " + lines[i]);
        }
    }

    public void print(String message, boolean uppercase) {
        if (uppercase) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println(message);
        }
    }
}