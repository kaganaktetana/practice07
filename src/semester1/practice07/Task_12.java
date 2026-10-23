
package semester1.practice07;

public class Task_12 {
    public static void main(String[] args) {
        SmartBulb bulb1 = new SmartBulb();
        SmartBulb bulb2 = new SmartBulb(75);
        SmartBulb bulb3 = new SmartBulb(90, 6000, false);

        bulb1.printStatus();
        bulb2.printStatus();
        bulb3.printStatus();
    }
}

class SmartBulb {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness, int colorTemp, boolean isOn) {
        this.brightness = (brightness >= 0 && brightness <= 100)
                ? brightness : 50;

        this.colorTemp = (colorTemp >= 2700 && colorTemp <= 6500)
                ? colorTemp : 4000;

        this.isOn = isOn;
    }

    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }

    public SmartBulb() {
        this(50);
    }

    public void printStatus() {
        System.out.println("===== Розумна лампочка =====");
        System.out.println("Яскравість: " + brightness + "%");
        System.out.println("Колірна температура: " + colorTemp + " K");
        System.out.println("Стан: " + (isOn ? "Увімкнена" : "Вимкнена"));
        System.out.println();
    }
}