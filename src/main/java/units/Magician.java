package units;

import java.util.ArrayList;

public class Magician extends Units {
    public Magician(String name, int x, int y)
    {super(120, 12, 3, 4, 2, name, x, y);
    }
    public int mana;
    @Override
    public String getInfo() {
        return String.format("Маг %s, x:%d, y:%d", name, coordinates.x, coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
