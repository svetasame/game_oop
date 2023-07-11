package units;

import java.util.ArrayList;

public class Monk extends Units {
    public Monk(String name, int x, int y)
    {super(110, 11, 4, 4, 2, name, x, y);
    }

    public void castMana() {
    }

    @Override
    public void getDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth >= maxHealth) currentHealth = maxHealth;
    }

    @Override
    public String getInfo() {
        return String.format("Монах %s, x:%d, y:%d", name, coordinates.x, coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }

}