public abstract class Units implements InGameDN{
    public float maxHealth, currentHealth;

    public int defence;
    public int actionPoints;
    public int power;
    public String name;
    public int [] damage;

    public int initiative;

    public Units(int maxHealth, int defence, int actionPoints, int power, int initiative) {
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.actionPoints = actionPoints;
        this.power = power;
//        this.name = name;
        this.initiative = initiative;
    }

    public boolean hasAp(){
        if(actionPoints>0){
            return true;
        }
        else return false;
    }

    public void move() {
        //while(hasAp()){

        //}
    }

    public void attack() {

    }

    public void getDamage(float damage){
        currentHealth -=damage;
    }
    @Override
    public void step() {

    }




}
