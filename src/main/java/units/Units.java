package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Units implements InGameDN {

    protected int maxHealth, currentHealth;
    public int mana, currentMana;
    protected int speed;
    protected int power;
    public String name;
    protected int damage;
    public String state = "Stand";
    public boolean isAlive;
    protected Coordinates coordinates;



    public Units(int maxHealth, int mana, int speed, int power, int damage, String name, int x, int y, String state) {
        this.maxHealth = maxHealth;
        this.mana = mana;
        this.speed = speed;
        this.power = power;
        this.name = name;
        this.damage = damage;
        this.currentHealth = maxHealth;
        this.currentMana = mana;
        // Stand, Busy, Dead, Move, Attack, Heal
        this.state = state;
        coordinates = new Coordinates(x,y);
      }


    @Override
    public float getHealth() {return currentHealth;
    }

    public void getDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth <= 0) {
            currentHealth = 0;
            isAlive = false;
            state = "Dead";
        }
        if (currentHealth >= maxHealth) {
            currentHealth = maxHealth;
            state = "Heal";
        }
    }





    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public int getSpeed(){
        return speed;
    }

    public String getNewName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        name = s;
        return name;
    }

    public Units nearest(ArrayList<Units> units) {
        double nearestDistance = Double.MAX_VALUE;
        Units nearestEnemy = null;
        for(int i = 0; i < units.size(); i++) {
            if (coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
   }




}
