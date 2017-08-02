package OOP.Theme13TheEnums.Lab4;

/**
 * Create a class Main with a main(). <p>
 * Create two enum type: Suit (which have SPADE, DIAMOND, CLUB, HEART)
 * and Rank (which have ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING values).<p>
 * In method main() create and fill (using nested loops) array of Card objects (standard 52-card deck).<p>
 * Add code which iterate over Card array and print full card name to console.<p>
 * Example of program output:<p>
 * The Card: KING_HEART<p>
 * ...<p>
 * The Card: QUEEN_DIAMOND<p>
 * ...<p>
 */
public class Main {
    public static void main(String[] args) {
        //Suit[] suits = Suit.values();
        //Rank[] ranks = Rank.values();
        Card[] cards = new Card[52];
        int count = 0;

        for (int i = 0; i < Suit.values().length; i++) {
            System.out.println();
            for (int j = 0; j < Rank.values().length; j++) {
                cards[count] = new Card(Suit.values()[i], Rank.values()[j]);
                System.out.println(cards[count]);
                count++;
            }
        }
    }
}
