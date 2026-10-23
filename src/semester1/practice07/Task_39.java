package semester1.practice07;

public class Task_39 {
    public static void main(String[] args) {
        Vector3D first = new Vector3D(1, 0, 0);
        Vector3D second = new Vector3D(0, 1, 0);

        Vector3D sum = first.add(second);

        System.out.println("Сума векторів: " + sum);
        System.out.println("Скалярний добуток: "
                + first.dotProduct(second));
        System.out.println("Вектори ортогональні: "
                + first.isOrthogonalTo(second));
        System.out.println("Векторний добуток: "
                + first.crossProduct(second));
        System.out.println("Вектори рівні: "
                + first.isEqualTo(second));
    }
}

class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(
                x + other.x,
                y + other.y,
                z + other.z
        );
    }

    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D(
                y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x
        );
    }

    public boolean isOrthogonalTo(Vector3D other) {
        return Math.abs(dotProduct(other)) < 1e-10;
    }

    public boolean isEqualTo(Vector3D other) {
        return Math.abs(x - other.x) < 1e-10
                && Math.abs(y - other.y) < 1e-10
                && Math.abs(z - other.z) < 1e-10;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
