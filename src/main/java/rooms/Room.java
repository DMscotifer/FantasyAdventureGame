package rooms;

import characters.monsters.MythicalCreature;
import healingTools.HealingTool;
import treasures.Treasure;

import java.util.ArrayList;

public class Room {

    public String description;
    ArrayList<MythicalCreature> monsters;
    ArrayList<Treasure> loot;
    ArrayList<HealingTool> healingTool;

    public Room(String description, ArrayList<MythicalCreature> monsters, ArrayList<Treasure> loot, ArrayList<HealingTool> healingTool) {
        this.description = description;
        this.monsters = monsters;
        this.loot = loot;
        this.healingTool = healingTool;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<MythicalCreature> getMonsters() {
        return monsters;
    }

    public ArrayList<Treasure> getLoot() {
        return loot;
    }

    public ArrayList<HealingTool> getHealingTool() {
        return healingTool;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMonsters(ArrayList<MythicalCreature> monsters) {
        this.monsters = monsters;
    }

    public void setLoot(ArrayList<Treasure> loot) {
        this.loot = loot;
    }

    public void setHealingTool(ArrayList<HealingTool> healingTool) {
        this.healingTool = healingTool;
    }

}
