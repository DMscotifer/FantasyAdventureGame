package characters.monsters;

import behaviours.IAttack;
import behaviours.IDefend;
import characters.Character;
import characters.villians.Villian;
import treasures.Treasure;

import java.util.ArrayList;

public abstract class MythicalCreature extends Character implements IDefend {

    private ArrayList<Treasure> inventory;

    public MythicalCreature(String name, int healthPoints, ArrayList<Treasure> inventory) {
        super(name, healthPoints, inventory);
    }

    public void defend(Villian master){
        if (master.getCurrentHealthPoints() < master.getMaxHealthPoints()){
            if (this.getCurrentHealthPoints() != 0) {
                this.setCurrentHealthPoints(this.getCurrentHealthPoints() - (master.getMaxHealthPoints() - master.getCurrentHealthPoints()));
                master.setCurrentHealthPoints(master.getMaxHealthPoints());
            }

        }
    }

}
