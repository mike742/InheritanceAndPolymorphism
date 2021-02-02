
enum Suit {
	Club, Diamond, Heart, Spade;
}

class Card {
	private int _num;
	private Suit _suit;
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public Card(int num, Suit suit) {
		_num = num;
		_suit = suit;
	}

	public void display() {
		// Helper.log();
		// System.out.println(_suit + " " + _num);
		String res = "";

		switch (_suit) {
		case Spade:
			res += (char) '\u2660';
			break;
		case Diamond:
			res += (char) '\u2666';
			break;
		case Club:
			res += (char) '\u2663';
			break;
		case Heart:
			res += (char) '\u2665';
			break;
		}

		if (_num == 1) {
			res += "A";
		} else if (_num == 11) {
			res += "J";
		} else if (_num == 12) {
			res += "Q";
		} else if (_num == 13) {
			res += "K";
		} else {
			res += _num;
		}
		
		if (_suit == Suit.Heart || _suit == Suit.Diamond) {
			res = ANSI_RED + res + ANSI_RESET;
		}

		System.out.print(res + " ");
	}
}

class GroupOfCards {
	private Card[] _cards;
	private int _currentSize;

	public GroupOfCards(int size) {
		_cards = new Card[size];
	}

	public void addCard(Card card) {
		for(int i = 0; i < _cards.length; ++i) {
			if(_cards[i] == null) {
				_cards[i] = card;
				break;
			}
		}
	}

	public void display() {
		
		for(int i =0; i < _cards.length; ++i) {
			if(_cards[i] != null) {
				_cards[i].display();
			}
			if( (i + 1) % 13 == 0 && i != 0 ) {
				System.out.println();
			}
		}
	}
}

class Deck extends GroupOfCards {

	public static final int TOTAL_CARDS = 52; // 13 * 4
	
	public Deck() {
		super(TOTAL_CARDS);
		
		for(int i = 0; i < TOTAL_CARDS / 4; ++i) {
			addCard(new Card(i + 1, Suit.Club));
		}
		
		// 52 / 4 = 13; 26
		for(int i = TOTAL_CARDS / 4; i < TOTAL_CARDS / 2; ++i) {
			addCard(new Card(i -  TOTAL_CARDS / 4 + 1, Suit.Diamond) );
		} 
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

	public Hand(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

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

		Deck d = new Deck();
		
		d.display();
		
	}

}
