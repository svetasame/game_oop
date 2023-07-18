package units;


import java.util.ArrayList;

public class Spearman extends Units {
    public Spearman(String name, int x, int y)
    {super(80, 0, 5, 7, 5, name, x,y, "Stand");
           }

    int attackRange = 1;
    @Override
    public String getInfo() {
        return String.format("Копейщик %s, [%d,%d] HP:%d/%d, mana:%d/%d, %s",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, state);}

    @Override
    public void step(ArrayList<Units> enemy,ArrayList<Units> ally) {
        if (!isAlive) return;
        Units tmp = nearest(enemy);
        if (coordinates.countDistance(tmp.coordinates) <= attackRange){
            tmp.getDamage(damage);
            state = "attack";
            //System.out.println(getInfo() + " атакует " + tmp.getInfo());
        }
        else {
            move(tmp.coordinates,ally);
            state = "move";
            //System.out.println(getInfo() + " переходит на  " + coordinates);
        }
        //System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }


}
