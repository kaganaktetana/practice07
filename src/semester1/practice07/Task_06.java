

package semester1.practice07;

public class Task_06 {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 57);

        System.out.println("Універсальний час: " + time.toUniversalString());
        System.out.println("Стандартний час: " + time.toStandardString());

        for (int i = 0; i < 5; i++) {
            time.tick();
            System.out.println("Після tick(): " + time.toUniversalString());
        }
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : 0;
    }

    public void tick() {
        seconds++;

        if (seconds > 59) {
            seconds = 0;
            minutes++;
        }

        if (minutes > 59) {
            minutes = 0;
            hours++;
        }

        if (hours > 23) {
            hours = 0;
        }
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String toStandardString() {
        int standardHours = hours % 12;

        if (standardHours == 0) {
            standardHours = 12;
        }

        String period = hours < 12 ? "AM" : "PM";

        return String.format("%d:%02d:%02d %s",
                standardHours, minutes, seconds, period);
    }
}