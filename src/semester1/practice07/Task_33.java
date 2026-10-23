package semester1.practice07;

public class Task_33 {
    public static void main(String[] args) {
        LineSegment segment = new LineSegment(0, 0, 3, 4);

        segment.printSegment();

        System.out.println("Довжина відрізка: " + segment.getLength());

        Point middle = segment.getMidPoint();
        System.out.println("Середина відрізка: ("
                + middle.getX() + ", " + middle.getY() + ")");
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getMidPoint() {
        double middleX = (start.getX() + end.getX()) / 2;
        double middleY = (start.getY() + end.getY()) / 2;

        return new Point(middleX, middleY);
    }

    public void printSegment() {
        System.out.println("Початок: (" + start.getX() + ", "
                + start.getY() + ")");
        System.out.println("Кінець: (" + end.getX() + ", "
                + end.getY() + ")");
    }
}
