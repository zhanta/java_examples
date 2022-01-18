import java.util.*;
public class SimpleCardGame {
	private Stack<Card> deck;
	private Stack<Card> graveyard;

	public Card getCardFromDeck() {
		return deck.pop();
	}
	public void discard(Card card) {
		graveyard.push(card);
	}

	public Card lookTopCard() {
		return deck.peek();
	}
	public Stack<Card> getDeck() {
		return deck;
	}
	public void setDeck(Stack<Card> deck) {
		this.deck = deck;
	}
	public Stack<Card> getGraveyard() {
		return graveyard;
	}
	public void setGraveyard(Stack<Card> graveyard) {
		this.graveyard = graveyard;
	}
}
