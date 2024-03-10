package units;
public class Sniper extends Person {
    private int arrowsNum;
    boolean inGame = true;
    public Sniper(String name, int age){
        super(name, 60, 40, age, 20, 40, "gun", 40, "Снайпер");
    }
    public void attack(Person person) {
        person.health -= this.power;
    }

}
