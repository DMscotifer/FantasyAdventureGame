package characters.heroes;

import treasures.Treasure;
import weapons.Weapon;
import characters.Character;

import java.util.ArrayList;

public class Dwarf extends Hero {

    private ArrayList<Treasure> inventory;

    public Dwarf(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon, inventory);
    }

    @Override
    public void attack(Character target){
        target.setCurrentHealthPoints(target.getCurrentHealthPoints() - this.getEquiptWeapon().getDmgValue() - 2);
    }

}
