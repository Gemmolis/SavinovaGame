package units;
import behavior.ActionInterface;

import java.util.ArrayList;

public class Monk extends Person{
    private int mana;
    private int healVal;
    private int healPrice;
    private String className;
    public Monk (String name, int x, int y){
        super(name, 60, 40, 25, 20, 40, "gun", 40, "Монах", x, y);
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
    @Override
    public void step(ArrayList<Person> enemies) {

    }

}
