
import characters.villians.Villian;
import characters.villians.Wizard;
import org.junit.Before;
import org.junit.Test;
import spells.Spell;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;
    ArrayList<Spell> grimoire;

    @Before
    public void before(){
        spell = new Spell("Magic Missile", 5);
        grimoire = new ArrayList<Spell>();
        grimoire.add(spell);
        wizard = new Wizard("Thulsa Doom", 8, grimoire);
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
}
