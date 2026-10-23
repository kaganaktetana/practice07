
package semester1.practice07;

public class Task_02 {
    public static void main(String[] args) {
        Student student1 = new Student("Олена", 19, 4.8);
        Student student2 = new Student("Іван", 12, 6.0);
        Student student3 = new Student("Марія", 20, 3.7);

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = (age < 15 || age > 80) ? 18 : age;
        this.gpa = (gpa < 0.0 || gpa > 5.0) ? 0.0 : gpa;
    }

    public boolean isHonorStudent() {
        return gpa >= 4.5;
    }

    public void printStudent() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Середній бал: " + gpa);
        System.out.println("Статус: "
                + (isHonorStudent() ? "Відмінник" : "Звичайний студент"));
        System.out.println();
    }
}