import units.*;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Units> team1 = new ArrayList<>();
    public static ArrayList<Units> team2 = new ArrayList<>();
    public static ArrayList<Units> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamSize = 10;
        for (int i = 0; i <= teamSize+1; i++) {
             switch (new Random().nextInt(4)) {
                 case 0:
                     team1.add(new Monk(getName(), 1, i));
                     break;
                 case 1:
                     team1.add(new Crossbowman(getName(), 1, i));
                     break;
                 case 2:
                     team1.add(new Peasant(getName(), 1, i));
                     break;
                 case 3:
                     team1.add(new Spearman(getName(), 1, i));
                     break;
            }
        }

        for (int i = 0; i <= teamSize+1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Rouge(getName(), 10, i));
                    break;
                case 1:
                    team2.add(new Peasant(getName(), 10, i));
                    break;
                case 2:
                    team2.add(new Magician(getName(), 10, i));
                    break;
                case 3:
                    team2.add(new Sniper(getName(), 10, i));
                    break;
            }
        }

        System.out.println("Команда 1");
        //team1.forEach(n -> System.out.println(n.getInfo()));

        System.out.println();
        System.out.println("Команда 2");
        //team2.forEach(n -> System.out.println(n.getInfo()));


        allTeam.addAll(team1);
        allTeam.addAll(team2);

        System.out.println();
        //allTeam.forEach(n -> System.out.println(n.getInfo()));
        Collections.sort(allTeam, new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return Integer.compare(o2.getSpeed(), o1.getSpeed());
            }
        });


        System.out.println("Отсортировано по скорости");
        //allTeam.forEach(n -> System.out.println(n.getInfo()));

        Scanner in = new Scanner(System.in);
        while (true) {
            View.view();
            in.nextLine();
            for (Units units : allTeam) {
                if (team2.contains(units)) {
                    units.step(team1, team2);
                } else units.step(team2, team1);
            }
            if (isTeamDie(team1)) {
                System.out.println("Team 2 (Blue) win");
                break;
            }
            if (isTeamDie(team2)) {
                System.out.println("Team 1 (Green) win");
                break;
            }
        }


    }

   static boolean isTeamDie (ArrayList<Units> team){
        for (Units units: team){
            if (!units.isAlive) {return true;}
            else {return false;}
            }
       return false;
   }

    private static String getName() {
        //если вызываем метод из метода то нужен статик
        String s = String.valueOf(Nametor.values()[new Random().nextInt(Nametor.values().length)]);
        return s;
    }


}