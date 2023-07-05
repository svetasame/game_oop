import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<Units> team1 = addToList();
        System.out.println("Команда 1");
        team1.forEach(n-> System.out.println(n.getInfo()));

        ArrayList<Units> team2 = addToList1();
        System.out.println();
        System.out.println("Команда 2");
        team2.forEach(n-> System.out.println(n.getInfo()));

//        team1.get(0).step(team2);
//        team1.get(0).nearest(team2);
        System.out.println("Ближайший враг: ");
//        System.out.println(team1.get(0).nearest(team2).getInfo());
        team1.forEach(n -> n.step(team2));



    }
    private static String getName() {
        //если вызываем метод из метода то нужен статик
        String s = String.valueOf(Nametor.values()[new Random().nextInt(Nametor.values().length)]);
        return s;
    }

    public static ArrayList<Units> addToList(){
        ArrayList<Units> team = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            int value = new Random().nextInt(4);
            int x = 0;
            int y = i+1;
            switch (value) {
                case 0 -> team.add(new Monk(getName(), x, y));
                case 1 -> team.add(new Crossbowman(getName(), x, y));
                case 2 -> team.add(new Peasant(getName(), x, y));
                case 3 -> team.add(new Spearman(getName(), x, y));

            }
        }
        return team;
    }

    public static ArrayList<Units> addToList1(){
        ArrayList<Units> team = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            int value = new Random().nextInt(4);
            int x = 10;
            int y = i+1;
            switch (value) {
                case 0 -> team.add(new Rouge(getName(), x, y));
                case 1 -> team.add(new Peasant(getName(), x, y));
                case 2 -> team.add(new Magician(getName(), x, y));
                case 3 -> team.add(new Sniper(getName(), x, y));
            }
        }
        return team;
    }
}