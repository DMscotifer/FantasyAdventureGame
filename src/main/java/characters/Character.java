package characters;

import treasures.Treasure;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int maxHealthPoints;
    private int currentHealthPoints;
    private ArrayList<Treasure> inventory;

    public Character(String name, int maxHealthPoints) {
        this.name = name;
        this.maxHealthPoints = maxHealthPoints;
        this.currentHealthPoints = maxHealthPoints;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public ArrayList<Treasure> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Treasure> inventory) {
        this.inventory = inventory;
    }
}
