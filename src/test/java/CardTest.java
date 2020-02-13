import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.SIX);
     }

     @Test
    public void canGetCardSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
     }

     @Test
    public void canGetCardRank() {
        assertEquals(RankType.SIX, card.getRank());
     }

}
