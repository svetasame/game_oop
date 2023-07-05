package units;

import java.util.ArrayList;

public class Monk extends Units {
    public Monk(String name, int x, int y)
    {super(110, 11, 4, 4, new int[]{-1,-5}, name, x, y);
    }

    public void castMana() {
    }

    @Override
    public void getDamage(float damage) {
        currentHealth -= damage;
        if (currentHealth >= maxHealth) currentHealth = maxHealth;
    }

    @Override
    public String getInfo() {
        return String.format("Монах "+ name + ", координаты: " + coordinates.x +", " + coordinates.y);
    }

    @Override
    public void step(ArrayList<Units> units) {
        Units tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }

}