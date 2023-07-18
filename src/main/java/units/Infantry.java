package units;

import java.util.ArrayList;

public abstract class Infantry extends Units {
    public Infantry(int maxHealth, int speed, int damage, String name, int x, int y, String state) {
        super(maxHealth, speed, damage, name, x, y, state);
    }
    int attackRange = 1;

    @Override
    public void step(ArrayList<Units> enemy, ArrayList<Units> ally) {
        if (!isAlive) return;
        Units tmp = nearest(enemy);
        if (coordinates.countDistance(tmp.coordinates) <= attackRange){
            tmp.getDamage(damage);
            state = "Attack";
            //System.out.println(getInfo() + " атакует " + tmp.getInfo());
        }
        else {
            move(tmp.coordinates,ally);
            state = "Move";
            //System.out.println(getInfo() + " переходит на  " + coordinates);
        }
        //System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
