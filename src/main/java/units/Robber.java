package units;

//Разбойник
public class Robber extends  Person {
    public Robber(String name, int x, int y){
        super (name, 100, 10, 25, 20, 40, "knife", 50, "Разбойник", x, y);
    }
    public void attack(Person person) {
        person.health -= super.power;
    }
    public void stealGold(int val){
        super.gold += val;
    }

}
