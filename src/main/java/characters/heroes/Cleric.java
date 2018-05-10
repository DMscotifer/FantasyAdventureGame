package characters.heroes;

import healingTools.HealingTool;
import weapons.Weapon;
import characters.Character;

import java.util.ArrayList;

public class Cleric extends Hero {

    private ArrayList<HealingTool> healingTools;

    public Cleric(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<HealingTool> healingTools) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon);
        this.healingTools = healingTools;
    }

    public void healWithTool(Character target, HealingTool choice){
        choice.heal(target);
    }



}
