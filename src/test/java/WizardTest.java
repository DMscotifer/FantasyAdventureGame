
import characters.villians.Villian;
import characters.villians.Wizard;
import org.junit.Before;
import org.junit.Test;
import spells.Spell;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard2;
    Wizard wizard;
    Spell spell;
    ArrayList<Spell> grimoire;

    @Before
    public void before(){
        spell = new Spell("Magic Missile", 5);
        grimoire = new ArrayList<Spell>();
        grimoire.add(spell);
        wizard = new Wizard("Thulsa Doom", 8, grimoire);
        wizard2 = new Wizard("Madam Mim", 10, grimoire);
    }

    @Test
    public void hasSpells() {
        assertEquals(1, wizard.getSpellSelection().size());
    }

    @Test
    public void canGetSpellFromSpellSelection() {
        assertEquals("Magic Missile", wizard.getSpellSelection().get(0).getName());
    }

    @Test
    public void canSearchSpellByName() {
        assertEquals(spell, wizard.searchSpellSelection("Magic Missile"));
    }

    @Test
    public void cannotGetSpellNotInSpellSelection() {
        assertEquals(null, wizard.searchSpellSelection("Mage Armour"));
    }

    @Test
    public void canCastSpell() {
        wizard.spellAttack("Magic Missile", wizard2);
        assertEquals(5, wizard2.getCurrentHealthPoints());
    }
}
