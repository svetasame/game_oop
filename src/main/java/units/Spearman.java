package units;

import units.Units;

import java.util.ArrayList;

public class Spearman extends Units {
    public Spearman(String name, int x, int y){
        super(60, 20, 3, 7, new int[]{-1,-3}, name, x, y);
    }

    public void longAttack(){}
    @Override
    public String getInfo() {
        return String.format("Арбалетчик %s, x:%d, y%d", name, coordinates.x, coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
