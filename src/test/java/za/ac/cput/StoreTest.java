package za.ac.cput;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StoreTest {

    private Store storage;

    @Before
    public void setUp(){
        this.storage = new Store();
    }

    @Test
    public void testMyListGet() {
       assertEquals("Ford", storage.myListGet(1));

    }
    @Test
    public void testMyListAdd() {
        assertEquals("Audi", storage.myListAdd("Audi"));

    }
    @Test
    public void testMyListRemove() {
        assertNotEquals("kia", storage.myListRemove(3));
    }

    @Test
    public void testMyMapGet() {
        assertEquals("Seoul", storage.myMapGet("South Korea"));
    }
    @Test
    public void testMyMapAdd() {
        assertEquals("Madrid", storage.myMapAdd("Spain","Madrid"));
    }
    @Test
    public void testMyMapRemove() {
        assertNotEquals("Berlin", storage.myMapRemove("Germany"));
    }

    @Test
    public void testMySetGet() {
        assertEquals(Boolean.TRUE, storage.mySetGet("MacBook"));
    }
    @Test
    public void testMySetAdd() {
        assertEquals(Boolean.TRUE, storage.mySetAdd("Acer"));
    }
    @Test
    public void testMySetRemove() {
        assertEquals(Boolean.FALSE, storage.mySetRemove());
    }
}