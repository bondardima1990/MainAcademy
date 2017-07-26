package OOP.Theme13TheEnums.Lab4;

/**
 * Created by DELL on 13.03.2017.
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
