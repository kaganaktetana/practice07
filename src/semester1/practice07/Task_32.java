package semester1.practice07;

public class Task_32 {
    public static void main(String[] args) {
        double mass = 0.001; // 1 грам у кілограмах
        double seconds = 5;

        System.out.println("Відстань падіння: "
                + PhysicsEngine.freeFallDistance(seconds) + " м");

        System.out.println("Кінетична енергія (маса 2 кг, швидкість 10 м/с): "
                + PhysicsEngine.kineticEnergy(2, 10) + " Дж");

        System.out.println("Енергія спокою 1 грама матерії: "
                + PhysicsEngine.restEnergy(mass) + " Дж");
    }
}

class PhysicsEngine {
    public static final double G = 9.80665;
    public static final double SPEED_OF_LIGHT = 299792458.0;

    private PhysicsEngine() {
    }

    public static double freeFallDistance(double seconds) {
        return G * seconds * seconds / 2;
    }

    public static double kineticEnergy(double massKg, double velocityMs) {
        return massKg * velocityMs * velocityMs / 2;
    }

    public static double restEnergy(double massKg) {
        return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
    }
}
