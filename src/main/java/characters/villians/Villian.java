package characters.villians;

import behaviours.ISpell;
import characters.Character;
import characters.monsters.MythicalCreature;
import spells.Spell;
import treasures.Treasure;

import java.util.ArrayList;

public abstract class Villian extends Character implements ISpell {

    private Spell spell;
    ArrayList<Spell> spellSelection;
    private MythicalCreature familiar;
    private ArrayList<Treasure> inventory;

    public Villian(String name, int maxHealthPoints, ArrayList<Spell> spellSelection, MythicalCreature familiar, ArrayList<Treasure> inventory) {
        super(name, maxHealthPoints, inventory);
        this.spell = spell;
        this.spellSelection = spellSelection;
        this.familiar = familiar;
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

    public MythicalCreature getFamiliar() {
        return familiar;
    }

    public void setFamiliar(MythicalCreature familiar) {
        this.familiar = familiar;
    }
}
