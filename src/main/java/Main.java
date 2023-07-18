import units.*;

import java.util.*;

public class Main {
    public static ArrayList<Units> team1 = new ArrayList<>();
    public static ArrayList<Units> team2 = new ArrayList<>();
    public static ArrayList<Units> allTeam = new ArrayList<>();
    private static java.lang.Object Units;


    public static void main(String[] args) {

        ArrayList<Units> team1 = addToList();
        System.out.println("Команда 1");
        team1.forEach(n -> System.out.println(n.getInfo()));

        ArrayList<Units> team2 = addToList1();
        System.out.println();
        System.out.println("Команда 2");
        team2.forEach(n -> System.out.println(n.getInfo()));


        allTeam.addAll(team1);
        allTeam.addAll(team2);

        System.out.println();
        allTeam.forEach(n -> System.out.println(n.getInfo()));
        Collections.sort(allTeam, new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return Integer.compare(o2.getSpeed(), o1.getSpeed());
            }
        });
        System.out.println("Отсортировано по скорости");
        allTeam.forEach(n -> System.out.println(n.getInfo()));

        Scanner in = new Scanner(System.in);
        while (true) {
//            View.view();
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

    public static ArrayList<Units> addToList(){
        ArrayList<Units> team = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            int value = new Random().nextInt(4);
            int x = 1;
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