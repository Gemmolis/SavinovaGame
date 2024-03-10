package units;

public class Monk extends Person{
    private int mana;
    private int healVal;
    private int healPrice;
    private String className;
    public Monk (String name, int age){
        super(name, 60, 40, age, 20, 40, "gun", 40, "Монах");
        this.mana = 100;
        this.healPrice = 2;

    }
    public void heal(Person person){
        person.health += this.healVal;
        this.mana -= price("heal");
    }
    public void heal(){
        super.health += this.healVal;
        this.mana -= price("hell");
    }
    private int price(String action) {
        if (action == "heal") return healPrice;
        return 0;
    }
}
