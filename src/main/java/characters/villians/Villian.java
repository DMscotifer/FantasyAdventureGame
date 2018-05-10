package characters.villians;

import characters.Character;
import spells.Spell;

import java.util.ArrayList;

public abstract class Villian extends Character {

    private Spell spell;
    ArrayList<Spell> spellSelection;

    public Villian(String name, int maxHealthPoints, ArrayList<Spell> spellSelection) {
        super(name, maxHealthPoints);
        this.spellSelection = spellSelection;
    }

    public ArrayList<Spell> getSpellSelection() {
        return spellSelection;
    }
}
