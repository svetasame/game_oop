package units;

public class Monk extends Units {
    public Monk(String name)
    {super(110, 11, 4, 4, new int[]{-1,-5}, name);
    }

    public void castMana() {
    }

    @Override
    public void getDamage(float damage) {
        currentHealth -= damage;
        if (currentHealth >= maxHealth) currentHealth = maxHealth;
    }

    @Override
    public String getInfo() {
        return "Монах " + name;
    }
}