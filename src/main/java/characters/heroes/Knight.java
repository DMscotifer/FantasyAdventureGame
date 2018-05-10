package characters.heroes;

import characters.Character;
import treasures.Treasure;
import weapons.Weapon;

import java.util.ArrayList;

public class Knight extends Hero{

    private ArrayList<Treasure> inventory;

    public Knight(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon, inventory);
    }

    public String taunt(Character target){
        return target.getName() + ", face me in mortal combat!";
    }

}
