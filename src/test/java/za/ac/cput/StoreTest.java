package za.ac.cput;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreTest {

    private Store storage;

    @Before
    public void setUp(){
        this.storage = new Store();
    }

    @Test
    public void testMyList() {
       assertEquals("Ford", storage.myListGet());

    }

    @Test
    public void testMyMap() {
        assertEquals("Seoul", storage.myMapGet());
    }

    @Test
    public void testMySet() {
        assertEquals(Boolean.TRUE, storage.mySetGet());
    }
}