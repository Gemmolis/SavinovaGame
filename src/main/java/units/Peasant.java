package units;
import behavior.ActionInterface;

import java.util.ArrayList;

//Крестьянин
public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;
    public Peasant(String name, int x, int y) {
        super(name, 20,1, 25,0,20,"nothing", 20, "Крестьянин", x, y);
    }
    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if (!isInGame()){
            inGame = false;
        }
    }
    public boolean isInGame() {
       return this.arrowsNum == 0 ? false : true; //проверка на наличие стрел
    }
    @Override
    public void step(ArrayList<Person> enemies) {

    }

}
