
package semester1.practice07;

public class Task_07 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Rectangle square = new Rectangle(5.0);

        System.out.println("Прямокутник:");
        System.out.println("Площа: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Це квадрат: " + rectangle.isSquare());

        System.out.println("\nКвадрат:");
        System.out.println("Площа: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println("Це квадрат: " + square.isSquare());

        System.out.println("\nПорівняння площ:");
        if (rectangle.getArea() > square.getArea()) {
            System.out.println("Площа прямокутника більша");
        } else if (rectangle.getArea() < square.getArea()) {
            System.out.println("Площа квадрата більша");
        } else {
            System.out.println("Площі однакові");
        }

        System.out.println("Порівняння периметрів:");
        if (rectangle.getPerimeter() > square.getPerimeter()) {
            System.out.println("Периметр прямокутника більший");
        } else if (rectangle.getPerimeter() < square.getPerimeter()) {
            System.out.println("Периметр квадрата більший");
        } else {
            System.out.println("Периметри однакові");
        }
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double size) {
        this(size, size);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}