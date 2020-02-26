package io.zipcoder.casino.game;
package io.zipcoder.casino.player;
import io.zipcoder.casino.card.Deck;
import io.zipcoder.casino.dealer.BlackjackDealer;
import io.zipcoder.casino.player.BlackjackPlayer;
import io.zipcoder.casino.player.CardPlayer;
import io.zipcoder.casino.player.Player;
import io.zipcoder.casino.utilities.Console;

public class Blackjack {
 private BlackjackPlayer playerOne;
 private BlackjackDealer dealerOne;
 private Deck cardDeck;
 private Console newConsole;

    public Blackjack(BlackjackPlayer player, BlackjackDealer dealer){
        this.playerOne = player;
        this.dealerOne = dealer;
        this.cardDeck = new Deck();
        this.newConsole = new Console(System.in, System.out);
    }
public void hit(CardPlayer player){
        player.getHand().add(cardDeck.popCard());
}
}
