import characters.monsters.Dragon;
import characters.monsters.MythicalCreature;
import healingTools.HealingTool;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import treasures.Treasure;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    ArrayList<MythicalCreature> monsters;
    ArrayList<Treasure> treasure;
    ArrayList<HealingTool> healingTools;
    Treasure gem;
    Dragon monster;

    @Before
    public void before(){
        monster = new Dragon("Red Dragon", 20, 5);
        gem = new Treasure("Ruby", 500);
        monsters = new ArrayList<MythicalCreature>();
        treasure = new ArrayList<Treasure>();
        healingTools = new ArrayList<HealingTool>();
        treasure.add(gem);
        monsters.add(monster);
        room1 = new Room("A vast horde of treasure lies in piles on the stone floor.", monsters, treasure, healingTools);

    }

    @Test
    public void canGetDescription() {
        assertEquals("A vast horde of treasure lies in piles on the stone floor.", room1.getDescription());
    }

    @Test
    public void canSeeMonstersInRoom() {
        assertEquals(1, room1.getMonsters().size());
    }
}
