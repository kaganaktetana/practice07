
package semester1.practice07;

public class Task_15 {
    public static void main(String[] args) {
        Box box1 = new Box(5.0, "Картон");
        Box box2 = new Box(box1);

        System.out.println("Перша коробка:");
        box1.printBox();

        System.out.println("Копія коробки:");
        box2.printBox();

        System.out.println("Об'єми однакові: "
                + (box1.getVolume() == box2.getVolume()));
    }
}

class Box {
    private double width;
    private double height;
    private double depth;
    private String material;

    public Box(double width, double height,
               double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public Box(double size, String material) {
        this(size, size, size, material);
    }

    public Box(Box other) {
        this(other.width, other.height, other.depth, other.material);
    }

    public double getVolume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public void printBox() {
        System.out.println("Матеріал: " + material);
        System.out.println("Ширина: " + width);
        System.out.println("Висота: " + height);
        System.out.println("Глибина: " + depth);
        System.out.println("Об'єм: " + getVolume());
        System.out.println("Площа поверхні: " + getSurfaceArea());
        System.out.println();
    }
}