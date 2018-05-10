import characters.heroes.Barbarian;
import org.junit.Before;
import org.junit.Test;
import treasures.Treasure;
import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Barbarian barbarian2;
    Sword sword;
    ArrayList<Weapon> weapons;
    ArrayList<Treasure> inventory;

    @Before
    public void before(){
        sword = new Sword(2);
        weapons = new ArrayList<Weapon>();
        weapons.add(sword);
        inventory = new ArrayList<Treasure>();
        barbarian = new Barbarian("Conan", 10, weapons, sword, inventory);
        barbarian2 = new Barbarian("Krom", 12, weapons, sword, inventory);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void startsWithMaxHealthPoints() {
        assertEquals(10, barbarian.getMaxHealthPoints());
    }

    @Test
    public void canChangeCurrentHealthPoints() {
        barbarian.setCurrentHealthPoints(8);
        assertEquals(8, barbarian.getCurrentHealthPoints() );
    }

    @Test
    public void canAttackPlayer() {
        barbarian.attack(barbarian2);
        assertEquals(10, barbarian2.getCurrentHealthPoints());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, barbarian.getInventory().size());
    }
}
