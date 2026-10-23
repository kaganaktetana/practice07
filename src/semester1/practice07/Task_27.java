
package semester1.practice07;

public class Task_27 {
    public static void main(String[] args) {
        System.out.println("PI = " + MathUtils.PI);
        System.out.println("E = " + MathUtils.E);

        System.out.println("5! = " + MathUtils.factorial(5));
        System.out.println("2^3 = " + MathUtils.power(2, 3));
        System.out.println("2^-2 = " + MathUtils.power(2, -2));
        System.out.println("НСД(24, 18) = " + MathUtils.gcd(24, 18));
        System.out.println("clamp(15, 0, 10) = "
                + MathUtils.clamp(15, 0, 10));
    }
}

class MathUtils {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    private MathUtils() {
    }

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Число має бути в межах від 0 до 20");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static double power(double base, int exp) {
        if (base == 0 && exp < 0) {
            throw new IllegalArgumentException(
                    "Нуль не можна підносити до від'ємного степеня");
        }

        double result = 1;
        long exponent = exp;

        if (exponent < 0) {
            exponent = -exponent;
        }

        for (long i = 0; i < exponent; i++) {
            result *= base;
        }

        return exp < 0 ? 1.0 / result : result;
    }

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static int clamp(int val, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "min не може бути більшим за max");
        }

        return Math.max(min, Math.min(val, max));
    }
}
