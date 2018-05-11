import instruments.Drum;
import instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Yamaha", "XYZ", "percussion", Material.brass, "black", 2500.00, "The perfect garage band setup...");
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", drum.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("XYZ", drum.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Ba Dum Tsss!", drum.play());
    }
}
