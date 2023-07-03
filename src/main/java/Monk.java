public class Monk extends Units {
    public Monk(String name) {
        super(50, 12, 1, 10, 2);
    }

    public void castMana() {
    }

    @Override
    public void getDamage(float damage) {
        currentHealth -= damage;
        if (currentHealth >= maxHealth) currentHealth = maxHealth;
    }


}