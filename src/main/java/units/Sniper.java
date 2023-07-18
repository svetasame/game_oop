package units;

import units.Units;

import java.util.ArrayList;

public class Sniper extends Units {
    public Sniper(String name, int x, int y) {
        super(130, 15, 4, 5, 4, name, x,y, "Stand");
        this.shots = 10;
    }
    public int shots;


    public int attackDistance = 4;


    @Override
    public String getInfo() {
        return String.format("Снайпер %s, [%d,%d] HP:%d/%d, shots:%d, %d",
                name, coordinates.x, coordinates.y, currentHealth, maxHealth, shots, state);
    }

    @Override
    public void step(ArrayList<Units> enemy,ArrayList<Units> ally) {
        Units tmp = nearest(enemy);
        //System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
        if (isAlive) {
            if (shots > 0) {
                tmp.getDamage(damage);
                shots -= 1;
                state = "Attack";
                System.out.println(getInfo() + "атакует" + tmp.getInfo());
            }
            else move(tmp.coordinates,ally);
            state = "Move";
            return;
        }
        for (Units units: ally){
            if(units instanceof Peasant && state == "Stand"){
                shots += 1;
                units.state = "Busy";
                System.out.println(getInfo() + " получил снаряд от " + units.getInfo() + " Крестьянин " + units.state);
                return;
            }
        }
    }




}
