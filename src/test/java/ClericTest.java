import characters.heroes.Cleric;
import healingTools.HealingTool;
import healingTools.Herb;
import healingTools.Potion;
import org.junit.Before;
import org.junit.Test;
import treasures.Treasure;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    ArrayList<HealingTool> healingGear;
    ArrayList<Weapon> weaponSelection;
    ArrayList<Treasure> inventory;
    Potion potion;
    Herb herb;


    @Before
    public void before(){
        herb = new Herb("Blue Herbs", 2);
        potion = new Potion("Potion of Cure Light Wound", 2);
        healingGear = new ArrayList<HealingTool>();
        healingGear.add(potion);
        healingGear.add(herb);
        weaponSelection = new ArrayList<Weapon>();
        inventory = new ArrayList<Treasure>();
        cleric = new Cleric("Jozan", 15, weaponSelection, null, healingGear, inventory);
    }

    @Test
    public void canGetHealingPower() {
        assertEquals(2, potion.getHealingPower());
    }

    @Test
    public void canHealWithPotion() {
        cleric.setCurrentHealthPoints(13);
        cleric.healWithTool(cleric, potion);
        assertEquals(15, cleric.getCurrentHealthPoints());
    }

    @Test
    public void canHealWithSpecialHerbs() {
        cleric.setCurrentHealthPoints(1);
        cleric.healWithTool(cleric, herb);
        assertEquals(15, cleric.getCurrentHealthPoints());
    }

    @Test
    public void canSearchThroughHealingToolsArray() {
        assertEquals(herb, cleric.searchHealingTools("Blue Herbs"));
    }
}
