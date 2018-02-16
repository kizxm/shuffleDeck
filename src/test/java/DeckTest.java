import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck testDeck;

    @Before
    public void setUp() throws Exception { testDeck = new Deck(); }
    @After
    public void tearDown() throws Exception {    }

    @Test
    public void deckExists() throws Exception {
        assertEquals(true, testDeck instanceof Deck);
    }

    @Test
    public void fourSuits() throws Exception {
        assertEquals(4, testDeck.getSuits().length);
    }

    @Test
    public void notUnderFourSuits() throws Exception {
        assertNotEquals(3, testDeck.getSuits().length);
    }

    @Test
    public void thirteenValues() throws Exception {
        assertEquals(13, testDeck.getValues().length);
    }

    @Test
    public void notUnderThirteenValues() throws Exception {
        assertNotEquals(12, testDeck.getValues().length);
    }

    @Test
    public void deskIs52Cards() throws Exception {
        assertEquals(53, testDeck.deckSize());
    }
}