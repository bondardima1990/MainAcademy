package OOP.Theme13TheEnums.Lab4;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return cardSuit.toString() + "_" + cardRank.toString();
    }
}
