package units;
public class Sniper extends Person {
    private int arrowsNum;
    boolean inGame = true;
    public Sniper(String name, int x, int y){
        super(name, 60, 40, 25, 20, 40, "gun", 40, "Снайпер", x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    }


}
