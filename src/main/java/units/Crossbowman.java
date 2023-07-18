package units;

public class Crossbowman extends Archers {
    public Crossbowman(String name, int x, int y) {
        super(120, 12, 6, name, x, y, "Stand");
        this.shots = 12;
    }

    @Override
    public String getInfo() {
        return String.format("Арбалетчик %s, [%d,%d] HP:%d/%d, shots:%d, %s",
                name, coordinates.x, coordinates.y, currentHealth, maxHealth, shots, state);}

}
