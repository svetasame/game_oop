package units;

import java.util.ArrayList;

public class Crossbowman extends Units {
    public Crossbowman(String name, int x, int y) {
        super(130, 10, 5, 5, 4, name, x, y);
        this.shots = 10;}
    public int shots;

    public int useShots (int shots) {
        shots -=1;
        return shots;
    }
    @Override
    public String getInfo() {
        return String.format("Арбалетчик %s, x:%d, y:%d, shots:%d", name, coordinates.x, coordinates.y, shots);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        if (getHealth() == 0 || shots == 0) {
            return;
        }

        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        doAttack(tmp);

        if (units2.contains(Peasant.class)){
            return;
        }
        shots --;
    }

}
