package characters.heroes;

import treasures.Treasure;
import weapons.Weapon;
import characters.Character;

import java.util.ArrayList;

public class Barbarian extends Hero {

    ArrayList<Treasure> inventory;

    public Barbarian(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon, inventory);
    }


}
