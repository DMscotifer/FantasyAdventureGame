package healingTools;

import characters.Character;

public class Herb extends HealingTool {

    public Herb(String name, int healingPower) {
        super(name, healingPower);
    }

    @Override
    public void heal(Character target){
        target.setCurrentHealthPoints(target.getMaxHealthPoints());
    }

}
