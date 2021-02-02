
enum Suit {
	Club, Diamond, Heart, Spade;
}

class Card {
	private int _num;
	private Suit _suit;

	public Card(int num, Suit suit) {
		_num = num;
		_suit = suit;
	}

	public void display() {
		Helper.log();
		System.out.println(_suit + " " + _num);
	}
}

class GroupOfCards {
	private Card[] _cards;
	private int _currentSize;
	
	public GroupOfCards() {
		Helper.log();
	}
	
	public void addCard(Card card) {
		Helper.log();
	}
	
	public void display() {
		Helper.log();
	}
}

class Deck extends GroupOfCards {
	
	public Deck() {
		Helper.log();
	}
	
	public void shuffle() {
		Helper.log();
		
		return;
	}
	
	public Card dealCard() {
		Helper.log();
		return null;
	}
}

class Hand extends GroupOfCards {
	
	public void sort() {
		Helper.log();
	}
	
	public Card playACard() {
		Helper.log();
		return null;
	}
}

class Game {
	private Deck _deck;
	private Hand _player1;
	private Hand _player2;
	
	public void playAGame() {
		Helper.log();
	}
}

public class CardGameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		
		game.playAGame();
	}

}
