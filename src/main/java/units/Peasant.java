package units;

import java.util.ArrayList;

public class Peasant extends Units {
    public Peasant(String name, int x, int y)
    {super(30, 0, 1, 0, 0, name, x, y, "Stand");}
    @Override
    public String getInfo() {
        return String.format("Крестьянин %s, [%d,%d] HP:%d/%d, %s",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, state); }

    @Override
    public void step (ArrayList<Units> enemy, ArrayList<Units> ally) {
        if (isAlive){
            if (state == "Busy"){
                state = "Stand";
                System.out.println(getInfo() + " в статусе "  + state);
            }
        }

    }

}

