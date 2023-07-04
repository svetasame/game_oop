package units;

public class Rouge extends Units {
    public Rouge(String name)
    {super(80, 10, 5, 7, new int[]{-2,-5}, name);
    }
    @Override
    public String getInfo() {
        return "Вор " +name;
    }


}
