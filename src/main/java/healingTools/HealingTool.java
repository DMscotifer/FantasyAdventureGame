package healingTools;

import behaviours.Healable;
import characters.Character;

public abstract class HealingTool implements Healable{

    private String name;
    private int healingPower;

    public HealingTool(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void heal(Character target){
        target.setCurrentHealthPoints(target.getCurrentHealthPoints() + this.healingPower);
        if (target.getCurrentHealthPoints() > target.getMaxHealthPoints()){
            target.setCurrentHealthPoints(target.getMaxHealthPoints());
        }
    }
}
