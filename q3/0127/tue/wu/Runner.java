import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<Card>();
        for(int i = 2; i <= 10; i++) {
            deck.add(new Card(i, "spades"));
        }

        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }
}