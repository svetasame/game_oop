package units;

import units.Units;

public class Sniper extends Units {
    public Sniper(String name)
    {super(130, 15, 3, 5, new int[]{-1,-5}, name);
    }
    public int accuracy;
    public int attackDistanse;
    public void fire() {}
    @Override
    public String getInfo() {
        return "Снайпер " +name;
    }




}
