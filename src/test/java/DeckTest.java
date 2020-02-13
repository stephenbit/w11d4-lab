import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.cardCount());
    }


}
