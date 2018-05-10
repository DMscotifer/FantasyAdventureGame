package characters.monsters;

import behaviours.IAttack;
import behaviours.IDefend;
import characters.Character;
import characters.villians.Villian;

public abstract class MythicalCreature extends Character implements IDefend {

    public MythicalCreature(String name, int healthPoints) {
        super(name, healthPoints);
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
