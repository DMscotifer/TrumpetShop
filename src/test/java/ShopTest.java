import instruments.MusicalInstrument;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<MusicalInstrument> stock1;

    @Before
    public void before(){
        stock1 = new ArrayList<MusicalInstrument>();
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
