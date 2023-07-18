package units;

import java.util.ArrayList;

public abstract class Archers extends Units {

    public Archers(int maxHealth, int speed, int damage, String name, int x, int y, String state) {
        super(maxHealth, speed, damage, name, x, y, state);
    }
    public int shots;
    public int attackDistance = 4;

    @Override
    public void step(ArrayList<Units> enemy, ArrayList<Units> ally) {
        Units tmp = nearest(enemy);
        if (isAlive) {
            for (Units units : ally) {
                if (units instanceof Peasant && units.state.equals("Stand") && shots <20) {
                    shots += 1;
                    units.state = "Busy";
                    //System.out.println(getInfo() + " получил снаряд от " + units.getInfo() + " Крестьянин " + units.state);
                    return;
                }
            }
            if ((int)coordinates.countDistance(tmp.coordinates) <= attackDistance) {
                if (shots > 0 && attackDistance == 1) {
                    tmp.getDamage(damage);
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
