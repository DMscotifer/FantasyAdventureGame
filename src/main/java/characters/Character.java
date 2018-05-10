package characters;

public abstract class Character {

    private String name;
    private int maxHealthPoints;
    private int currentHealthPoints;

    public Character(String name, int maxHealthPoints) {
        this.name = name;
        this.maxHealthPoints = maxHealthPoints;
        this.currentHealthPoints = maxHealthPoints;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }
}
