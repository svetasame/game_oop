package units;


public class Sniper extends Archers {
    public Sniper(String name, int x, int y) {
        super(130, 15, 4, name, x, y, "Stand");
        this.shots = 10;
    }

    @Override
    public String getInfo() {
        return String.format("Снайпер %s, [%d,%d] HP:%d/%d, shots:%d, %s",
                name, coordinates.x, coordinates.y, currentHealth, maxHealth, shots, state);}

}
