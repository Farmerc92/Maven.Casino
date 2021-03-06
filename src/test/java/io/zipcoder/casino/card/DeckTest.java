package io.zipcoder.casino.card;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;


public class DeckTest {

    private static final Logger LOGGER = Logger.getLogger(DeckTest.class.getName());


    @Test
    public void testCreateDeck() {
        Deck deck = new Deck();

        Integer expected = 52;

        deck.createDeck();
        Integer actual = deck.getStack().size();

        Assert.assertEquals(expected, actual);
        LOGGER.info("\n" + actual);
    }

    @Test
    public void testGetDeck() {
        Deck deck = new Deck();
        deck.createDeck();

        Assert.assertFalse(deck.isEmpty());
        Assert.assertTrue(!deck.isEmpty());
    }

    @Test
    public void testPopCard() {
        Deck deck = new Deck();
        deck.createDeck();

        deck.popCard();
        Integer actualDeckSize = deck.getStack().size();
        Integer remainingCards = 51;
        Assert.assertEquals(remainingCards, actualDeckSize);
    }

    @Test
    public void test() {
        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffle();
        LOGGER.info("\n" + deck.peekStack());
    }

}
