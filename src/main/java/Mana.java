public enum Mana {
    FireRain(3, 7, "Хана"), FireBolt(1,2,"Норм"), FireStrike(1,1,"Так себе");
    private  int damage, size;
    private String name;


    Mana(int damage, int size, String name) {
        this.damage = damage;
        this.size = size;
        this.name = name;
    }
    public int getDamage() {return damage;}
    public int getSize() {return size;}
    public String getName() {return name;}


}
