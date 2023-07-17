package units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Healers extends Units {


    public Healers(int maxHealth, int mana, int speed, int power, int damage, String name, int x, int y, String state) {
        super(maxHealth, mana, speed, power, damage, name, x, y, state);
    }

    @Override
    public void step(ArrayList<Units> enemy,ArrayList<Units> ally) {
        Units tmp = nearest(enemy);
        Units tmpAlly = ally.get(0);
        int minAllyHealth = 1;
        if (isAlive && mana > 0) {
            for (Units units: ally) {
                if (units.currentHealth / units.maxHealth < minAllyHealth) {
                    minAllyHealth = units.currentHealth / units.maxHealth;
                    tmpAlly = units;
                }
            }
            if (minAllyHealth < 1) {
                tmpAlly.getDamage(-damage);
                state = "Heal";
                mana -= 1;
                System.out.println(getInfo() + " вылечил " + tmpAlly.getInfo() + " его здоровье =" + tmpAlly.getHealth());
                return;
            }
            else {
                tmp.getDamage(damage);
                mana -=1;
                state = "Attack";
                System.out.println(getInfo() + " атакует " + tmp.getInfo());
            }
        }

            else {
                mana +=1;
                state = "Busy";
                System.out.println(getInfo() + " восстанавливает ману");
            }
        }

}
