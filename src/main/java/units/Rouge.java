package units;

import java.util.ArrayList;

public class Rouge extends Infantry {
    public Rouge(String name, int x, int y)
    {super(85, 3, 8, name, x,y, "Stand");}

    @Override
    public String getInfo() {
        return String.format("Вор %s, [%d,%d] HP:%d/%d, %s",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, state);}


}
