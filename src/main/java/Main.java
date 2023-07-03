import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sniper sniper = new Sniper("Ivan");
        Spearman spearman = new Spearman("Apper");
        Monk monk = new Monk("Sargeras");
        Crossbowman crossbowman = new Crossbowman("Snippy");
        Peasant peasant = new Peasant("Holl");
        Rouge rouge = new Rouge("Riven");
        Magician mag = new Magician("Damien");
        ArrayList<Units> list = new ArrayList();
        list.add(new Sniper("Itan"));
        list.add(new Monk("Gideon"));
        if (list.get(0) instanceof Sniper) ((Sniper)list.get(0)).fire();
        if (list.get(0) instanceof Monk) ((Monk)list.get(0)).castMana();
        sniper.step();




    }
}