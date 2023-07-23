package units;

import java.util.ArrayList;

public abstract class Infantry extends Units {
    public Infantry(int maxHealth, int speed, int damage, String name, int x, int y, String state) {
        super(maxHealth, speed, damage, name, x, y, state);
        currentHealth = maxHealth;
    }
    int attackRange = 1;

    @Override
    public void step(ArrayList<Units> enemy, ArrayList<Units> ally) {
        if (!isAlive) return;
        Units tmp = nearest(enemy);
        if (coordinates.countDistance(tmp.coordinates) <= attackRange){
            tmp.getDamage(30);
            state = "Attack";
        }
        else {
            move(tmp.coordinates,ally);
            state = "Move";
        }
    }
}
