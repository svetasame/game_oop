import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sniper sniper = new Sniper(getName());
        Spearman spearman = new Spearman(getName());
        Monk monk = new Monk(getName());
        Crossbowman crossbowman = new Crossbowman(getName());
        Peasant peasant = new Peasant(getName());
        Rouge rouge = new Rouge(getName());
        Magician mag = new Magician(getName());
//        System.out.println(monk.getInfo()+
//                " кастанул магию и получилось "
//                +Mana.values()[new Random().nextInt(Mana.values().length)].getName());

        ArrayList<Units> team1 = addToList();
        System.out.println("Команда 1");
        team1.forEach(n-> System.out.println(n.getInfo()));

        ArrayList<Units> team2 = addToList();
        System.out.println();
        System.out.println("Команда 2");
        team2.forEach(n-> System.out.println(n.getInfo()));




    }
    private static String getName() {
        //если вызываем метод из метода то нужен статик
        String s = String.valueOf(Nametor.values()[new Random().nextInt(Nametor.values().length)]);
        return s;
    }

    public static ArrayList<Units> addToList(){
        ArrayList<Units> team = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            int value = new Random().nextInt(7);
            switch (value) {
                case 0 -> team.add(new Monk(getName());
                case 1 -> team.add(new Rouge(getName()));
                case 2 -> team.add(new Crossbowman(getName()));
                case 3 -> team.add(new Peasant(getName()));
                case 4 -> team.add(new Magician(getName()));
                case 5 -> team.add(new Spearman(getName()));
                case 6 -> team.add(new Sniper(getName()));
            }
        }
        return team;
    }
}