package units;

import java.util.Random;

public abstract class Units implements InGameDN {
    protected float maxHealth, currentHealth;
    protected int defence;
    protected int attack;
    protected int power;
    public String name;
    protected int [] damage;


    public Units(float maxHealth, int defence, int attack, int power, int[] damage, String name) {
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.attack = attack;
        this.power = power;
        this.name = name;
        this.damage = damage;
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

    public void getDamage(float damage){
        currentHealth -=damage;
    }
    @Override
    public void step() {

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






}
