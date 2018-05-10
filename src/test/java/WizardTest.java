
import characters.heroes.Barbarian;
import characters.monsters.Dragon;
import characters.monsters.MythicalCreature;
import characters.monsters.Ogre;
import characters.villians.Wizard;
import org.junit.Before;
import org.junit.Test;
import spells.Spell;
import weapons.Sword;
import weapons.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard2;
    Wizard wizard;
    Spell spell;
    ArrayList<Spell> grimoire;
    Dragon familiar1;
    Ogre familiar2;
    Barbarian barbarian;
    Sword sword;
    ArrayList<Weapon> weapons;


    @Before
    public void before(){
        familiar1 = new Dragon("Red Dragon", 20);
        familiar2 = new Ogre("Ogre", 15);
        spell = new Spell("Magic Missile", 5);
        grimoire = new ArrayList<Spell>();
        grimoire.add(spell);
        wizard = new Wizard("Thulsa Doom", 8, grimoire, familiar1);
        wizard2 = new Wizard("Madam Mim", 10, grimoire, familiar2);
        sword = new Sword(2);
        weapons = new ArrayList<Weapon>();
        weapons.add(sword);
        barbarian = new Barbarian("Conan", 10, weapons, sword);
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

    @Test
    public void hasFamiliar() {
        assertEquals("Red Dragon", wizard.getFamiliar().getName());
    }

    @Test
    public void canHaveFamiliarDefendWizard() {
        barbarian.attack(wizard);
        familiar1.defend(wizard);
        assertEquals(8, wizard.getCurrentHealthPoints());
    }
}
