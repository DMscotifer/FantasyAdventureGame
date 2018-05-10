package characters.monsters;

import characters.villians.Villian;

public class Ogre extends MythicalCreature {

    public Ogre(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void defend(){

    }

    public void defend(Villian master){
        if (master.getCurrentHealthPoints() < master.getMaxHealthPoints()){
            if (this.getCurrentHealthPoints() != 0) {
                master.setCurrentHealthPoints(master.getMaxHealthPoints());
            }
        }
    }

}
