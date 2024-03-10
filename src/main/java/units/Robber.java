package units;

//Разбойник
public class Robber extends  Person {
    public Robber(String name, int age){
        super (name, 100, 10, age, 20, 40, "knife", 50, "Разбойник");
    }
    public void attack(Person person) {
        person.health -= super.power;
    }
    public void stealGold(int val){
        super.gold += val;
    }

}
