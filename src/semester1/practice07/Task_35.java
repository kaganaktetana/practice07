package semester1.practice07;

public class Task_35 {
    public static void main(String[] args) {
        Engine engine = new Engine("ENG-001", 150);

        CarWithEngine car =
                new CarWithEngine("Toyota", "Corolla", engine);

        car.printSpecs();

        car.startCar();
        System.out.println("Двигун працює: " + engine.isRunning());

        car.turnOff();
        System.out.println("Двигун працює: " + engine.isRunning());
    }
}

class Engine {
    private String serialNumber;
    private int horsePower;
    private boolean isRunning;

    public Engine(String serialNumber, int horsePower) {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }
}

class CarWithEngine {
    private String brand;
    private String model;
    private Engine engine;

    public CarWithEngine(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        this.engine.start();
        System.out.println(brand + " готовий до руху!");
    }

    public void turnOff() {
        this.engine.stop();
        System.out.println(brand + " вимкнений.");
    }

    public void printSpecs() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Номер двигуна: "
                + engine.getSerialNumber());
        System.out.println("Потужність: "
                + engine.getHorsePower() + " к.с.");
    }
}