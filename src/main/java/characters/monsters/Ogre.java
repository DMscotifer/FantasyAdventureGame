package characters.monsters;

import characters.villians.Villian;
import treasures.Treasure;

import java.util.ArrayList;

public class Ogre extends MythicalCreature {

    private ArrayList<Treasure> inventory;

    public Ogre(String name, int healthPoints, ArrayList<Treasure> inventory) {
        super(name, healthPoints, inventory);
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
