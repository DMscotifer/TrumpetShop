import instruments.Material;
import instruments.MethodOfSoundGeneration;
import instruments.MusicalInstrument;
import instruments.Percussion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<MusicalInstrument> stock1;
    Percussion drum;

    @Before
    public void before(){
        drum = new Percussion("Yamaha", "4pc Shell Pack", "drums", Material.brass, "black", "bass", 2500.00, "Combining a thin 4-ply Maple shell with 4-ply re-rings delivers an essential tonal combination of rich lows and wide-open resonance. This lively sonic character makes Masters Maple Reserve a natural choice for the most discerning musical pallet.", MethodOfSoundGeneration.membranphone, true);
        stock1 = new ArrayList<MusicalInstrument>();
        stock1.add(drum);
        shop = new Shop("Jazz's Music Shop", stock1);
    }

    @Test
    public void hasName() {
        assertEquals("Jazz's Music Shop", shop.getName());
    }

    @Test
    public void hasStock() {
        assertEquals(stock1, shop.getStock());
    }
}
