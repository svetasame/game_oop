package units;


import java.util.ArrayList;
public abstract class Healers extends Units{
    public Healers(float maxHealth, int defence, int speed, int power, int damage, String name, int x, int y) {
        super(maxHealth, defence, speed, power, damage, name, x, y);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
