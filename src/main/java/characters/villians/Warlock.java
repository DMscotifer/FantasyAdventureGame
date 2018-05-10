package characters.villians;

import characters.monsters.MythicalCreature;
import spells.Spell;

import java.util.ArrayList;

public class Warlock extends Villian {

    public Warlock(String name, int maxHealthPoints, Spell spell, ArrayList<Spell> spellSelection, MythicalCreature familiar) {
        super(name, maxHealthPoints, spellSelection, familiar);
    }
}
