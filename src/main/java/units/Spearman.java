package units;

import units.Units;

import java.util.ArrayList;

public class Spearman extends Units {
    public Spearman(String name, int x, int y){
        super(60, 20, 3, 7, 5, name, x, y,"Stand");
    }

    public void longAttack(){}
    @Override
    public String getInfo() {
        return String.format("Копейщик %s, x:%d, y:%d, health:%d", name, coordinates.x, coordinates.y, currentHealth);
    }

    @Override
    public void step(ArrayList<Units> units1,ArrayList<Units> units2) {
        Units tmp = nearest(units1);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
