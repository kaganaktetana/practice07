
package semester1.practice07;

public class Task_23 {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("Базова зарплата: "
                + calculator.calculate(20000));

        System.out.println("З фіксованою премією: "
                + calculator.calculate(20000, 3000));

        System.out.println("З бонусом 10% після податку: "
                + calculator.calculate(20000, 10.0, true));

        System.out.println("З понаднормовими: "
                + calculator.calculate(20000, 10, 200.0));
    }
}

class SalaryCalculator {
    public double calculate(double baseRate) {
        return baseRate;
    }

    public double calculate(double baseRate, double fixedBonus) {
        return baseRate + fixedBonus;
    }

    public double calculate(double baseRate, double bonusPercent,
                            boolean isTaxDeducted) {
        double salary = baseRate + baseRate * bonusPercent / 100.0;

        if (isTaxDeducted) {
            salary *= 1 - 0.195;
        }

        return salary;
    }

    public double calculate(double baseRate, int overtimeHours,
                            double overtimeHourlyRate) {
        return baseRate + overtimeHours * overtimeHourlyRate;
    }
}