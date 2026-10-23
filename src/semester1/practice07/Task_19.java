
package semester1.practice07;

public class Task_19 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Площа квадрата: "
                + calculator.calculateArea(5.0));

        System.out.println("Площа прямокутника: "
                + calculator.calculateArea(4.0, 6.0));

        System.out.println("Площа круга: "
                + calculator.calculateArea(3.0, true));

        System.out.println("Площа трикутника: "
                + calculator.calculateArea(3.0, 4.0, 5.0));

        System.out.println("Площа трапеції: "
                + calculator.calculateTrapezoidArea(4.0, 6.0, 3.0));
    }
}

class AreaCalculator {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }

        return 0.0;
    }

    public double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;

        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            return 0.0;
        }

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculateTrapezoidArea(
            double base1, double base2, double height) {
        return (base1 + base2) / 2.0 * height;
    }
}