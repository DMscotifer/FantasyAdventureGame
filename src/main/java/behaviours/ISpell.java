package behaviours;

import spells.Spell;
import characters.Character;


public interface ISpell {

    void spellAttack(String spellChoice, Character target);

}
