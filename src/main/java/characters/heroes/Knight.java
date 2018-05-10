package characters.heroes;

import weapons.Weapon;

import java.util.ArrayList;

public class Knight extends Hero{

    public Knight(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon) {
        super(name, maxHealthPoints, weaponSelection, equiptWeapon);
    }
}
