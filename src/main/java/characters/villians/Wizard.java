package characters.villians;

import behaviours.ISpell;
import characters.monsters.MythicalCreature;
import spells.Spell;

import java.util.ArrayList;

public class Wizard extends Villian implements ISpell{

    public Wizard(String name, int maxHealthPoints, ArrayList<Spell> spellSelection, MythicalCreature familiar) {
        super(name, maxHealthPoints, spellSelection, familiar);
    }
}
