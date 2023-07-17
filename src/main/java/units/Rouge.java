package units;

import java.util.ArrayList;

public class Rouge extends Units {
    public Rouge(String name, int x, int y)
    {super(80, 10, 5, 7, 5, name, x,y, "Stand");
    currentHealth = 60;}
    @Override
    public String getInfo() {
        return String.format("Вор %s, x:%d, y:%d, health:%d", name, coordinates.x, coordinates.y, currentHealth);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
