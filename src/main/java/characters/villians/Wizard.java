package characters.villians;

import behaviours.ISpell;
import spells.Spell;

import java.util.ArrayList;

public class Wizard extends Villian implements ISpell{

    public Wizard(String name, int maxHealthPoints, ArrayList<Spell> spellSelection) {
        super(name, maxHealthPoints, spellSelection);
    }
}
