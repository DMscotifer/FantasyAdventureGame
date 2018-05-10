package characters.villians;

import behaviours.ISpell;
import characters.Character;
import spells.Spell;

import java.util.ArrayList;

public abstract class Villian extends Character implements ISpell {

    private Spell spell;
    ArrayList<Spell> spellSelection;

    public Villian(String name, int maxHealthPoints, ArrayList<Spell> spellSelection) {
        super(name, maxHealthPoints);
        this.spellSelection = spellSelection;
    }

    public ArrayList<Spell> getSpellSelection() {
        return spellSelection;
    }

    public Spell searchSpellSelection(String spellName){
        for (Spell spell : spellSelection){
            if (spell.getName() == spellName) {
                return spell;
            }
        }
        return null;
    }

    public void spellAttack(String spellChoice, Character target){
        if (this.searchSpellSelection(spellChoice) != null){
            target.setCurrentHealthPoints(target.getCurrentHealthPoints() - searchSpellSelection(spellChoice).getDmgValue());
        }
    }


}
