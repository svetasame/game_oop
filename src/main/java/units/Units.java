package units;

import java.util.ArrayList;


public abstract class Units implements InGameDN {

    protected int maxHealth, currentHealth;
    public int mana, currentMana;
    protected int speed;
    public String name;
    protected int damage;

    public String state;
    public boolean isAlive;
    protected Coordinates coordinates;
    public int moveDistance = 10;



    public Units(int maxHealth, int mana, int speed, int damage, String name, int x, int y, String state) {
        this.maxHealth = this.currentHealth = maxHealth;
        this.mana = this.currentMana = mana;
        this.speed = speed;
        this.name = name;
        this.damage = damage;
        this.state = state;
        isAlive = true;
        coordinates = new Coordinates(x,y);
      }

    public Units(int maxHealth, int speed, int damage, String name, int x, int y, String state) {
        this.maxHealth = this.currentHealth = maxHealth;
        this.speed = speed;
        this.name = name;
        this.damage = damage;
        this.state = state;
        isAlive = true;
        coordinates = new Coordinates(x,y);
    }


    @Override
    public int getHealth() {return currentHealth;}

    public void getDamage(int damage) {
        currentHealth = currentHealth - damage;
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

    public void move (Coordinates units, ArrayList<Units> ally) {
        if (coordinates.containsByPos(coordinates.newPosition(units),ally)){
            for (int i = 0; i<moveDistance; i++) {
                coordinates = coordinates.newPosition(units);
            }
        }
    }

    public Units nearest(ArrayList<Units> units) {
        double nearestDistance = Double.MAX_VALUE;
        Units nearestEnemy = null;
        for (Units unit : units) {
            if (coordinates.countDistance(unit.coordinates) < nearestDistance) {
                nearestEnemy = unit;
                nearestDistance = coordinates.countDistance(unit.coordinates);
            }
        }
        return nearestEnemy;
   }

   public int [] getCords() {
       return new int[] {coordinates.x, coordinates.y};
   }
   public String toString(){return this.getClass().getSimpleName();}

}
