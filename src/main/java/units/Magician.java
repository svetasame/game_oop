package units;

public class Magician extends Healers {

    public Magician(String name, int x, int y) {
        super(90, 12, 3, 2, name, x, y, "Stand");
    }

    @Override
    public String getInfo() {
        return String.format("Маг %s, [%d,%d] HP:%d/%d, mana:%d/%d, %s",
                name, coordinates.x, coordinates.y, currentHealth,maxHealth, currentMana, mana, state);}



}
