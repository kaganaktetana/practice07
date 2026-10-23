
package semester1.practice07;

public class Task_11 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2024);

        car.startEngine();
        car.drive(150);
        car.stopEngine();

        car.printInfo();
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engineStarted = false;
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Car() {
        this("Unknown", "Standard", 2024);
    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун запущено.");
    }

    public void stopEngine() {
        engineStarted = false;
        System.out.println("Двигун зупинено.");
    }

    public void drive(double distance) {
        if (!engineStarted) {
            System.out.println("Спершу заведіть двигун!");
        } else if (distance > 0) {
            mileage += distance;
            System.out.println("Проїхано " + distance + " км.");
        }
    }

    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Рік: " + year);
        System.out.println("Пробіг: " + mileage + " км");
    }
}