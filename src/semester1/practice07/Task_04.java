
package semester1.practice07;

public class Task_04 {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(3.0, 4.0);
        Point2D point3 = new Point2D(6.0, 8.0);

        point1.printPoint();
        point2.printPoint();
        point3.printPoint();

        System.out.println("Відстань point1 до початку координат: "
                + point1.distanceToOrigin());

        System.out.println("Відстань point2 до початку координат: "
                + point2.distanceToOrigin());

        System.out.println("Відстань між point2 і point3: "
                + point2.distanceTo(6.0, 8.0));
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D() {
        x = 0.0;
        y = 0.0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double targetX, double targetY) {
        double dx = x - targetX;
        double dy = y - targetY;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public void printPoint() {
        System.out.println("Point(" + x + "; " + y + ")");
    }
}