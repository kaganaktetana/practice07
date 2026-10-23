
package semester1.practice07;

public class Task_17 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 3));
        System.out.println(math.add(2.5, 3.7));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add("Hello", "world"));

        System.out.println(math.multiply(4, 5));
        System.out.println(math.multiply(2.5, 4.0));
        System.out.println(math.multiply("Java ", 3));
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String multiply(String text, int times) {
        if (times <= 0) {
            return "";
        }

        return text.repeat(times);
    }
}