package characters.monsters;

import characters.villians.Villian;

public class Dragon extends MythicalCreature {

    public Dragon(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void defend(Villian master){
        if (master.getCurrentHealthPoints() < master.getMaxHealthPoints()){
            if (this.getCurrentHealthPoints() != 0) {
                master.setCurrentHealthPoints(master.getMaxHealthPoints());
            }
        }
    }
}
