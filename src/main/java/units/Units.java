package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Units implements InGameDN {

    protected float maxHealth, currentHealth;
    protected int defence;
    protected int speed;
    protected int power;
    public String name;
    protected int damage;

    protected Coordinates coordinates;


    public Units(float maxHealth, int defence, int speed, int power, int damage, String name, int x, int y) {
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.speed = speed;
        this.power = power;
        this.name = name;
        this.damage = damage;
        coordinates = new Coordinates(x,y);
      }

//    public boolean hasAp(){
//        if(defence>0){
//            return true;
//        }
//        else return false;
//    }



//    public void attack() {
//
//    }
    public static boolean isDead;

    public void doAttack(Units target){
//        int damage = 1;
        target.getDamage(damage);
    }

    @Override
    public float getHealth() {
        return currentHealth;
    }

    public void getDamage(int damage){
        if (this.currentHealth - damage > 0){
            this.currentHealth -= damage;
        }
        else {this.currentHealth = 0;}

//        if (this.currentHealth - damage > this.maxHealth){
//            currentHealth = maxHealth;
//        }
    }

    @Override
    public String getInfo() {
        return name;
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
