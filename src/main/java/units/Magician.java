package units;

import java.util.ArrayList;

public class Magician extends Healers {
    public Magician(String name, int x, int y)
    {super(120, 12, 3, 4, 2, name, x, y, "Stand");
    }
    public int mana;
    @Override
    public String getInfo() {
        return String.format("Маг %s, [%d,%d] HP:%d/%d, mana:%d/%d, %d",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, currentMana, mana, state);}



}
