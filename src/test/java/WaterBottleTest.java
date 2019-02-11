import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(90);
    }

    @Test
    public void getVolume(){
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(80, waterbottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0,waterbottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100,waterbottle.fill());
    }
}
