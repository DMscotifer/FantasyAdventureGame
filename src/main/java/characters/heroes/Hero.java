package characters.heroes;

import behaviours.IAttack;
import characters.Character;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Hero extends Character implements IAttack {

    private ArrayList<Weapon> weaponSelection;
    private Weapon equiptWeapon;

    public Hero(String name, int maxHealthPoints, ArrayList<Weapon> weaponSelection, Weapon equiptWeapon) {
        super(name, maxHealthPoints);
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
