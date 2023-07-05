package units;

import java.util.ArrayList;

public class Crossbowman extends Units {
    public Crossbowman(String name, int x, int y)
    {super(130, 10, 5, 5, new int[]{-3,-5}, name, x, y);
    }
    @Override
    public String getInfo() {
        return String.format("Копьеносец "+ name + ", координаты: " + coordinates.x +", " + coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }

}
