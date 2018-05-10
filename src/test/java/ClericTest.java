import characters.heroes.Cleric;
import healingTools.HealingTool;
import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    ArrayList<HealingTool> healingGear;
    ArrayList<Weapon> weaponSelection;
    Potion potion;


    @Before
    public void before(){
        potion = new Potion("Potion of Cure Light Wound", 2);
        healingGear = new ArrayList<HealingTool>();
        healingGear.add(potion);
        weaponSelection = new ArrayList<Weapon>();
        cleric = new Cleric("Jozan", 15, weaponSelection, null, healingGear);
    }

    @Test
    public void canGetHealingPower() {
        assertEquals(2, potion.getHealingPower());
    }
}
