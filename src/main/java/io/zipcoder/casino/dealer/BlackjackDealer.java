package io.zipcoder.casino.dealer;

import io.zipcoder.casino.card.Card;
import io.zipcoder.casino.card.Hand;

public class BlackjackDealer {
    private Hand hand = new Hand();

    public void add(Card c){
        hand.add(c);
    }

}
