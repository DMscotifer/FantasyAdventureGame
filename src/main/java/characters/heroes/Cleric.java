package characters.heroes;

import healingTools.HealingTool;
import spells.Spell;
import treasures.Treasure;
import weapons.Weapon;
import characters.Character;

import java.util.ArrayList;

public class Cleric extends Hero {

    private ArrayList<HealingTool> healingTools;
    private ArrayList<Treasure> inventory;

    public Cleric(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<HealingTool> healingTools, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon, inventory);
        this.healingTools = healingTools;
    }

    public void healWithTool(Character target, HealingTool choice){
        choice.heal(target);
    }

    public HealingTool searchHealingTools(String toolName){
        for (HealingTool healingTool : healingTools){
            if (healingTool.getName() == toolName) {
                return healingTool;
            }
        }
        return null;
    }



}
