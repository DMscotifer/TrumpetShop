import instruments.Guitar;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Les Paul", "Axe", "string", Material.wood, "red", 15000, 20000, "Cherry red axe used by one of the greats!");
    }


    @Test
    public void canPlay() {
        assertEquals("[sweet riffs]... ",guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5000, guitar.calculateMarkup(), 0.1);
    }
}
