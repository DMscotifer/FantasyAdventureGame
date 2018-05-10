import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(2);
    }

    @Test
    public void hasDmgValue() {
        assertEquals(2, sword.getDmgValue());
    }
}
