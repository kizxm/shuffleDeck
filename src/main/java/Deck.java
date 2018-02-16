public class Deck {
    private String[] suits = {"♣ Clubs", "♦ Diamonds", "❤ Hearts", "♠ Spades"};
    private String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public int sv = suits.length * values.length;

    Deck() {

        String[] deck = new String[sv];
        for (int i = 0; i < 13; i++) {
            for (int x = 0; x < 4; x++) {
                deck[suits.length * i + x] = values[i] + " of " + suits[x];
            }
        }

        for (int i = 0; i < sv; i++) {
            int n = i + (int) (Math.random() * (sv - i));
            String temporaryDeck = deck[n];
            deck[n] = deck[i];
            deck[i] = temporaryDeck;
        }

        for (int i = 0; i < sv; i++) {
            System.out.println(deck[i]);
        }
    }

    public String[] getSuits() { return suits; }
    public String[] getValues() { return values; }
}
