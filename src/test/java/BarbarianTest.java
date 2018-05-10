import characters.heroes.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }
}
