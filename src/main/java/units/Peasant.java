package units;

import java.util.ArrayList;

public class Peasant extends Units {
    public Peasant(String name, int x, int y)
    {super(30, 0, 0, 0, 0, name, x, y);}
    @Override
    public String getInfo() {
        return String.format("Крестьянин %s, x:%d, y:%d", name, coordinates.x, coordinates.y);
    }
    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }

}

