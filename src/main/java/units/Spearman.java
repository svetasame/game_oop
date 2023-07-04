package units;

import units.Units;

public class Spearman extends Units {
    public Spearman(String name){
        super(60, 20, 3, 7, new int[]{-1,-3}, name);
    }

    public void longAttack(){}
    @Override
    public String getInfo() {
        return "Арбалетчик " +name;
    }


}
