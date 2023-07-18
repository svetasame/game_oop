package units;

import java.util.ArrayList;

public class Crossbowman extends Units {
    public Crossbowman(String name, int x, int y) {
        super(130, 10, 5, 5, 4, name, x, y, "Stand");
        this.shots = 10;
    }

    public int shots;

    public int attackDistance = 4;

    @Override
    public String getInfo() {
        return String.format("Арбалетчик %s, [%d,%d] HP:%d/%d, shots:%d, %s",
                name, coordinates.x, coordinates.y, currentHealth, maxHealth, shots, state);
    }


    @Override
    public void step(ArrayList<Units> enemy, ArrayList<Units> ally) {
        Units tmp = nearest(enemy);

        if (isAlive) {
            for (Units units : ally) {
                if (units instanceof Peasant && units.state == "Stand" && shots <20) {
                    shots += 1;
                    units.state = "Busy";
                    System.out.println(getInfo() + " получил снаряд от " + units.getInfo() + " Крестьянин " + units.state);
                    return;
                }
            }
            if ((int)coordinates.countDistance(tmp.coordinates) <= attackDistance) {
                if (shots > 0 && attackDistance == 1) {
                    if (attackDistance == 1 ) tmp.getDamage(damage);
                    else tmp.getDamage(damage);
                    shots -= 1;
                    state = "Attack";
                    return;
                } else {
                    attackDistance = 1;
                }

            }
            else {
                move(tmp.coordinates, ally);
                state = "Move";
                return;
            }
        }
       return;
    }
}
