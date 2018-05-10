package characters.villians;

import behaviours.ISpell;
import characters.monsters.MythicalCreature;
import spells.Spell;
import treasures.Treasure;

import java.util.ArrayList;

public class Wizard extends Villian implements ISpell{

    private ArrayList<Treasure> inventory;

    public Wizard(String name, int maxHealthPoints, ArrayList<Spell> spellSelection, MythicalCreature familiar, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, spellSelection, familiar, inventory);
    }
}
