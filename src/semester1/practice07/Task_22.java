
package semester1.practice07;

public class Task_22 {
    public static void main(String[] args) {
        DateService date = new DateService(15, 3, 2024);

        date.printDate();

        date.add(20);
        date.printDate();

        date.add(0, 3);
        date.printDate();
    }
}

class DateService {
    private int day;
    private int month;
    private int year;

    public DateService(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        normalize();
    }

    public void add(int days) {
        day += days;
        normalize();
    }

    public void add(int days, int months) {
        day += days;
        month += months;
        normalize();
    }

    public void add(int days, int months, int years) {
        day += days;
        month += months;
        year += years;
        normalize();
    }

    private void normalize() {
        while (day > 30) {
            day -= 30;
            month++;
        }

        while (day < 1) {
            day += 30;
            month--;
        }

        while (month > 12) {
            month -= 12;
            year++;
        }

        while (month < 1) {
            month += 12;
            year--;
        }
    }

    public void printDate() {
        System.out.printf("%02d.%02d.%04d%n", day, month, year);
    }
}