package characters.heroes;

import behaviours.IAttack;
import characters.Character;
import treasures.Treasure;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Hero extends Character implements IAttack {

    private ArrayList<Weapon> weaponSelection;
    private Weapon equiptWeapon;
    private ArrayList<Treasure> inventory;

    public Hero(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, inventory);
        this.weaponSelection = weaponSelection;
        this.equiptWeapon = equiptWeapon;
    }

    public ArrayList<Weapon> getWeaponSelection() {
        return weaponSelection;
    }

    public void setWeaponSelection(ArrayList<Weapon> weaponSelection) {
        this.weaponSelection = weaponSelection;
    }

    public Weapon getEquiptWeapon() {
        return equiptWeapon;
    }

    public void setEquiptWeapon(Weapon equiptWeapon) {
        this.equiptWeapon = equiptWeapon;
    }

    public void attack(Character target){
        target.setCurrentHealthPoints(target.getCurrentHealthPoints() - this.getEquiptWeapon().getDmgValue());
    }

}
