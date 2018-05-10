package characters.monsters;

import characters.Character;
import characters.villians.Villian;
import treasures.Treasure;

import java.util.ArrayList;

public class Dragon extends MythicalCreature {

    private int fireBreathDmg;
    private ArrayList<Treasure> inventory;

    public Dragon(String name, int healthPoints, int fireBreathDmg, ArrayList<Treasure> inventory) {
        super(name, healthPoints, inventory);
        this.fireBreathDmg = fireBreathDmg;
    }



//    public void breathFire(Character target){
//        public void attack(Character target){
//            target.setCurrentHealthPoints(target.getCurrentHealthPoints() - this.);
//        }
//    }

}
