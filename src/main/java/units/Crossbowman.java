package units;
import behavior.ActionInterface;

import java.util.ArrayList;

public class Crossbowman extends Person{
    public Crossbowman(String name, int x, int y){
        super(name, 60, 40, 25, 20, 40, "gun", 40, "Арбалетчик", x, y);


    }
    public void attack(Person person) {
        person.health -= this.power;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }

}
