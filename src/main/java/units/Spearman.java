package units;


import java.util.ArrayList;

public class Spearman extends Infantry {
    public Spearman(String name, int x, int y)
    {super(90, 4, 6, name, x,y, "Stand");
           }

    @Override
    public String getInfo() {
        return String.format("Копейщик %s, [%d,%d] HP:%d/%d, %s",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, state);}


}
