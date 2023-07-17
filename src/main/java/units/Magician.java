package units;

import java.util.ArrayList;

public class Magician extends Healers {
    public Magician(String name, int x, int y)
    {super(120, 12, 3, 4, 2, name, x, y, "Stand");
    }
    public int mana;
    @Override
    public String getInfo() {
        return String.format("Маг %s, x:%d, y:%d, health:%d, mana:%d", name, coordinates.x, coordinates.y, currentHealth, mana);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
