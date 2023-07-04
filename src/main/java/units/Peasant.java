package units;

public class Peasant extends Units {
    public Peasant(String name)
    {super(30, 0, 0, 0, new int[]{0,0}, name);}
    @Override
    public String getInfo() {
        return "Крестьянин " +name;
    }

}
