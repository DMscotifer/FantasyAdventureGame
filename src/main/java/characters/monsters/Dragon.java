package characters.monsters;

import characters.Character;
import characters.villians.Villian;

public class Dragon extends MythicalCreature {

    private int fireBreathDmg;

    public Dragon(String name, int healthPoints, int fireBreathDmg) {
        super(name, healthPoints);
        this.fireBreathDmg = fireBreathDmg;
    }



//    public void breathFire(Character target){
//        public void attack(Character target){
//            target.setCurrentHealthPoints(target.getCurrentHealthPoints() - this.);
//        }
//    }

}
