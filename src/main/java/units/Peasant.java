package units;

import java.util.ArrayList;

public class Peasant extends Units {
    public Peasant(String name, int x, int y)
    {super(30, 0, 1, 0, 0, name, x, y, "Stand");}
    @Override
    public String getInfo() {
        return String.format("Крестьянин %s, x:%d, y:%d, health:%d", name, coordinates.x, coordinates.y, currentHealth);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        if (isAlive){
            if (state == "Busy"){
                state = "Stand";
                System.out.println(getInfo() + " в статусе "  + state);
            }

        }

    }

}

