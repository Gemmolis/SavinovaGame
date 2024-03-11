package units;

import java.util.ArrayList;
import java.util.List;

public class Position {
    protected int x, y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public List<Integer> getPosition(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }

    public double getDistance(Position target){
        double targetDistance = Math.sqrt(Math.pow(target.x - x, 2) + (Math.pow(target.y - y, 2)));
        return targetDistance;

    }

}
