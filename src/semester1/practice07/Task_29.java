
package semester1.practice07;

public class Task_29 {
    public static void main(String[] args) {
        FleetCar car1 = new FleetCar("VIN001", 10000);
        FleetCar car2 = new FleetCar("VIN002", 20000);
        FleetCar car3 = new FleetCar("VIN003", 15000);

        car1.addTrip(150);
        car2.addTrip(300);
        car3.addTrip(200);

        FleetCar.printFleetSummary();
    }
}

class FleetCar {
    private String vinCode;
    private double currentMileage;

    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    public FleetCar(String vinCode, double initialMileage) {
        this.vinCode = vinCode;
        this.currentMileage = initialMileage;

        totalCars++;
        totalCompanyMileage += initialMileage;
    }

    public void addTrip(double km) {
        if (km > 0) {
            this.currentMileage += km;
            totalCompanyMileage += km;
        }
    }

    public static void printFleetSummary() {
        System.out.println("===== СТАТИСТИКА АВТОПАРКУ =====");
        System.out.println("Кількість автомобілів: " + totalCars);
        System.out.printf("Загальний пробіг: %.2f км%n",
                totalCompanyMileage);
    }
}
