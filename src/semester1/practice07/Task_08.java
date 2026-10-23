
package semester1.practice07;

public class Task_08 {
    public static void main(String[] args) {
        Employee employee = new Employee(
                101, "Іван Петренко", "Програміст", 30000.0);

        employee.printBadge();

        employee.raiseSalary(15.0);

        System.out.println("\nПісля підвищення на 15%:");
        employee.printBadge();

        System.out.printf("Річна зарплата: %.2f грн%n",
                employee.getAnnualSalary());
    }
}

class Employee {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id, String fullName,
                    String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            monthlySalary *= 1 + percent / 100;
        }
    }

    public double getAnnualSalary() {
        return 12 * monthlySalary;
    }

    public void printBadge() {
        System.out.println("===== БЕЙДЖ СПІВРОБІТНИКА =====");
        System.out.println("ID: " + id);
        System.out.println("ПІБ: " + fullName);
        System.out.println("Посада: " + position);
        System.out.printf("Місячна зарплата: %.2f грн%n",
                monthlySalary);
    }
}