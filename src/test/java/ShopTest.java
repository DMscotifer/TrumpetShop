import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<MusicalInstrument> stock1;
    Guitar guitar;
    Drum drum;

    @Before
    public void before(){
        drum = new Drum("Yamaha", "XYZ", InstrumentType.percussion, Material.brass, "black", 1900.00, 2500.00, "The perfect garage band setup...");
        guitar = new Guitar("Les Paul", "Axe", InstrumentType.string, Material.wood, "red", 15000, 20000, "Cherry red axe used by one of the greats!");
        stock1 = new ArrayList<MusicalInstrument>();
        stock1.add(drum);
        stock1.add(guitar);
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

    @Test
    public void canAddStock() {
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialMarkup() {
        assertEquals(5600, shop.calculateTotalMarkup(), 0.1);
    }
}
