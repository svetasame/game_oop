public class units {
    public int health;
    public int defence;
    public int actionPoints;
    public int power;
    public String name;

    public int initiative;

    public units(int health, int defence, int actionPoints, int power, String name, int initiative) {
        this.health = health;
        this.defence = defence;
        this.actionPoints = actionPoints;
        this.power = power;
        this.name = name;
        this.initiative = initiative;
    }

    public boolean hasAp(){
        if(actionPoints>0){
            return true;
        }
        else return false;
    }

    public int move() {
        while(hasAp()){

        }
    }



}
