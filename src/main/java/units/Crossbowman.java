package units;

public class Crossbowman extends Units {
    public Crossbowman(String name)
    {super(130, 10, 5, 5, new int[]{-3,-5}, name);
    }
    @Override
    public String getInfo() {
        return "Копьеносец " +name;
    }

}
