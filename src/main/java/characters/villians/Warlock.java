package characters.villians;

import characters.monsters.MythicalCreature;
import spells.Spell;
import treasures.Treasure;

import java.util.ArrayList;

public class Warlock extends Villian {

    private ArrayList<Treasure> inventory;

    public Warlock(String name, int maxHealthPoints, Spell spell, ArrayList<Spell> spellSelection, MythicalCreature familiar, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, spellSelection, familiar, inventory);
    }
}
