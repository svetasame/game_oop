package units;

public class Magician extends Units {
    public Magician(String name)
    {super(120, 12, 3, 4, new int[]{-1,-5}, name);
    }
    public int mana;
    @Override
    public String getInfo() {
        return "Маг " +name;
    }


}
