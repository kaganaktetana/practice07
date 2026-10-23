
package semester1.practice07;

public class Task_10 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(6, 8);
        Fraction fraction2 = new Fraction(5);
        Fraction fraction3 = new Fraction();

        fraction1.print();
        System.out.println("Десяткове значення: "
                + fraction1.toDouble());

        fraction2.print();
        System.out.println("Десяткове значення: "
                + fraction2.toDouble());

        fraction3.print();
        System.out.println("Десяткове значення: "
                + fraction3.toDouble());

        Fraction fraction4 = new Fraction(3, -9);
        fraction4.print();

        Fraction fraction5 = new Fraction(2, 0);
        fraction5.print();
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Помилка: знаменник не може бути нулем!");
            denominator = 1;
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = findGCD(Math.abs(numerator), denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a == 0 ? 1 : a;
    }

    public void print() {
        if (denominator == 1) {
            System.out.println("Дріб: " + numerator);
        } else {
            System.out.println("Дріб: " + numerator + "/" + denominator);
        }
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }
}