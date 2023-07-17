package units;

import java.util.ArrayList;

public class Crossbowman extends Units {
    public Crossbowman(String name, int x, int y) {
        super(130, 10, 5, 5, 4, name, x, y, "Stand");
        this.shots = 10;
    }

    public int shots;

    public int useShots(int shots) {
        shots -= 1;
        return shots;
    }

    @Override
    public String getInfo() {
        return String.format("Арбалетчик %s, x:%d, y:%d, shots:%d, health:%d", name, coordinates.x, coordinates.y, shots, currentHealth);
    }

    @Override
    public void step(ArrayList<Units> enemy, ArrayList<Units> ally) {
        Units tmp = nearest(enemy);
        //System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        if (isAlive) {
            if (shots > 0) {
                tmp.getDamage(damage);
                shots -= 1;
                state = "Attack";
                System.out.println(getInfo() + "атакует" + tmp.getInfo());
            }
        }
        for (Units units : ally) {
            if (units instanceof Peasant && state == "Stand") {
                shots += 1;
                units.state = "Busy";
                System.out.println(getInfo() + " получил снаряд от " + units.getInfo() + " Крестьянин " + units.state);
                return;
            }
        }
    }
}
