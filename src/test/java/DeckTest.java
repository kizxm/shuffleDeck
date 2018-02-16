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

}