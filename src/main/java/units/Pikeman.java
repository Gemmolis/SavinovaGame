package units;

public class Pikeman extends Person{
    public  Pikeman(String name, int age) {
        super(name, 80, 30, age, 30, 50, "pike", 20, "Копейщик");
    }
    public void attack(Person person) {
        person.health -= this.power;
    }
}
