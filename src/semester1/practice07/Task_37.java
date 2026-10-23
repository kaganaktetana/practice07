package semester1.practice07;

public class Task_37 {
    public static void main(String[] args) {
        Hero knight = new Hero("Лицар", 100, 20, 5);
        Hero orc = new Hero("Орк", 90, 18, 3);

        while (knight.isAlive() && orc.isAlive()) {
            knight.attack(orc);

            if (orc.isAlive()) {
                orc.attack(knight);
            }
        }

        if (knight.isAlive()) {
            System.out.println("Переможець: " + knight.getName());
        } else {
            System.out.println("Переможець: " + orc.getName());
        }
    }
}

class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(Hero target) {
        if (!isAlive() || !target.isAlive()) {
            return;
        }

        int damage = this.attackPower - target.defense;

        if (damage <= 0) {
            damage = 1;
        }

        target.health -= damage;

        if (target.health < 0) {
            target.health = 0;
        }

        System.out.println(name + " атакує " + target.name
                + " і завдає " + damage + " шкоди. HP цілі: "
                + target.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }
}