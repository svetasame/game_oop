package units;

import java.util.ArrayList;

public class Monk extends Healers {
    public Monk(String name, int x, int y)
    {super(100, 50, 4, 2, 8, name, x, y, "Stand");
    }

    @Override
    public String getInfo() {
        return String.format("Монах %s, [%d,%d] HP:%d/%d, mana:%d/%d, %d",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, currentMana, mana, state);
    }





}