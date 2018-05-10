package characters.villians;

import spells.Spell;

import java.util.ArrayList;

public class Wizard extends Villian {

    public Wizard(String name, int maxHealthPoints, ArrayList<Spell> spellSelection) {
        super(name, maxHealthPoints, spellSelection);
    }
}
