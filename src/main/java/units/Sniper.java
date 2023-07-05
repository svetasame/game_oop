package units;

import units.Units;

import java.util.ArrayList;

public class Sniper extends Units {
    public Sniper(String name, int x, int y)
    {super(130, 15, 3, 5, new int[]{-1,-5}, name, x,y);
    }
    public int accuracy;
    public int attackDistanse;
    public void fire() {}
    @Override
    public String getInfo() {
        return String.format("Снайпер "+ name + ", координаты: " + coordinates.x +", " + coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }




}
