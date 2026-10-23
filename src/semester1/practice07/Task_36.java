package semester1.practice07;

public class Task_36 {
    public static void main(String[] args) {
        Processor cpu = new Processor("Intel Core i5", 3.5, 6000);
        Memory ram = new Memory(16, 3200, 1500);

        Computer computer = new Computer("My PC", cpu, ram, 3000);

        computer.printSpecs();
        System.out.println("Початкова ціна: "
                + computer.calculateTotalPrice() + " грн");

        Memory newRam = new Memory(32, 3600, 2800);
        computer.upgradeMemory(newRam);

        computer.printSpecs();
        System.out.println("Нова ціна: "
                + computer.calculateTotalPrice() + " грн");
    }
}

class Processor {
    private String model;
    private double frequencyGHz;
    private double price;

    public Processor(String model, double frequencyGHz, double price) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public double getFrequencyGHz() {
        return frequencyGHz;
    }
}

class Memory {
    private int sizeGB;
    private int frequencyMHz;
    private double price;

    public Memory(int sizeGB, int frequencyMHz, double price) {
        this.sizeGB = sizeGB;
        this.frequencyMHz = frequencyMHz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }
}

class Computer {
    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title, Processor cpu, Memory ram,
                    double casePrice) {
        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {
        return cpu.getPrice() + ram.getPrice() + casePrice;
    }

    public void upgradeMemory(Memory newRam) {
        this.ram = newRam;
        System.out.println("Оперативну пам'ять оновлено до "
                + newRam.getSizeGB() + " GB.");
    }

    public void printSpecs() {
        System.out.println("Комп'ютер: " + title);
        System.out.println("Процесор: " + cpu.getModel());
        System.out.println("Частота процесора: "
                + cpu.getFrequencyGHz() + " GHz");
        System.out.println("Оперативна пам'ять: "
                + ram.getSizeGB() + " GB");
        System.out.println("Частота пам'яті: "
                + ram.getFrequencyMHz() + " MHz");
        System.out.println("Ціна корпусу: " + casePrice + " грн");
    }
}
