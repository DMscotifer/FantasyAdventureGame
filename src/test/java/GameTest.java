import characters.heroes.Barbarian;
import characters.monsters.Dragon;
import characters.monsters.MythicalCreature;
import game.Game;
import healingTools.HealingTool;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import treasures.Treasure;
import characters.Character;
import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Room room1;
    Character player1;
    ArrayList<MythicalCreature> monsters;
    ArrayList<Treasure> treasure;
    ArrayList<HealingTool> healingTools;
    ArrayList<Treasure> p1inventory;
    ArrayList<Weapon> weapons;
    Sword sword;
    Dragon monster;
    Treasure gem;
    ArrayList<Treasure> inventory;
    ArrayList<Character> players;
    ArrayList<Room> rooms;
    Game game;

    @Before
    public void before(){
        p1inventory = new ArrayList<Treasure>();
        monster = new Dragon("Red Dragon", 20, 5, inventory);
        gem = new Treasure("Ruby", 500);
        monsters = new ArrayList<MythicalCreature>();
        treasure = new ArrayList<Treasure>();
        healingTools = new ArrayList<HealingTool>();
        treasure.add(gem);
        monsters.add(monster);
        room1 = new Room("A vast horde of treasure lies in piles on the stone floor.", monsters, treasure, healingTools);
        player1 = new Barbarian("Conan", 10, weapons, sword, p1inventory);
        players = new ArrayList<Character>();
        players.add(player1);
        rooms = new ArrayList<Room>();
        rooms.add(room1);
        game = new Game(players, rooms);
    }

    @Test
    public void canGetDescriptionWhenEnterRoom() {
        assertEquals("A vast horde of treasure lies in piles on the stone floor. The monsters in the room: Red Dragon", game.enterRoom(room1));
    }
}
