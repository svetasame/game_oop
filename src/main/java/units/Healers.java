package units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public abstract class Healers extends Units {


    public Healers(int maxHealth, int mana, int speed, int power, int damage, String name, int x, int y, String state) {
        super(maxHealth, mana, speed, power, damage, name, x, y, state);
    }
    int currentMana = mana;

    @Override
    public void step(ArrayList<Units> enemy,ArrayList<Units> ally) {
        Units tmp = nearest(enemy);
        Units tmpAlly = ally.get(0);
        int minAllyHealth = 100;
        ArrayList <Units> deadAlly = new ArrayList<>();

        if (isAlive && currentMana > 0) {
            for (Units units: ally) {
                if (units.currentHealth / units.maxHealth * 100 < minAllyHealth) {
                    minAllyHealth = units.currentHealth / units.maxHealth * 100;
                    tmpAlly = units;
                }
                if (!units.isAlive) {
                    deadAlly.add(units);
                }
            }
            if (deadAlly.size() > ally.size()/2-1 && currentMana > 5){
                int n = new Random().nextInt(deadAlly.size()-1);
                deadAlly.get(n).isAlive = true;
                deadAlly.get(n).currentHealth = deadAlly.get(n).maxHealth /2;
                state = "revive";
                currentMana = 0;
                return;
            }

            if (minAllyHealth < 100) {
                tmpAlly.getDamage(-damage);
                state = "Heal";
                currentMana -= 1;
                System.out.println(getInfo() + " вылечил " + tmpAlly.getInfo() + " его здоровье =" + tmpAlly.getHealth());
                return;
            }
            else {
                tmp.getDamage(damage);
                currentMana -=1;
                state = "Attack";
                System.out.println(getInfo() + " атакует " + tmp.getInfo());
            }
        }

            else {
                currentMana +=1;
                if
                (currentMana >= mana) {currentMana = mana;}
                state = "Busy";
                System.out.println(getInfo() + " восстанавливает ману");
            }
        }

}
