package game.entities;

public class Card {
	
	//Find a way to make a static object with CardProperties set to ERROR
	//public static final Card GENERIC_CARD(CardProperties.Figure.ERROR, CardProperties.Suit.ERROR);
	
	private CardProperties.Figure figure;
	private CardProperties.Suit suit;
	
	public Card(CardProperties.Figure figure, CardProperties.Suit suit) {
		this.figure = figure; //Why can't we implicit cast from CardProperties.Figure to CardProperties?
								//Talvez porque o CardProperties.Figure � um field do CardProperties MAS
								//N�O EXTENDE o CardProperties
		this.suit = suit;
	}
	
	//N�o usado de momento
	public CardProperties.Figure getFigure() {
		return figure;
	}
	
	//N�o usado de momento
	public CardProperties.Suit getSuit() {
		return suit;
	}
	
	//N�o usado de momento
	public String getName() {
		return figure.toString() + " de " + suit.toString();
	}
	
}
