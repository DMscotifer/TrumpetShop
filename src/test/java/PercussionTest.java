import instruments.Brass;
import instruments.Material;
import instruments.MethodOfSoundGeneration;
import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion drum;

    @Before
    public void before(){
        drum = new Percussion("Yamaha", "4pc Shell Pack", "drums", Material.brass, "black", "bass", 2500.00, "Combining a thin 4-ply Maple shell with 4-ply re-rings delivers an essential tonal combination of rich lows and wide-open resonance. This lively sonic character makes Masters Maple Reserve a natural choice for the most discerning musical pallet.", MethodOfSoundGeneration.membranphone, true);
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", drum.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("4pc Shell Pack", drum.getModel());
    }

}
