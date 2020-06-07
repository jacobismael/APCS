import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        Practice runner = new Practice();
        Card[] cards = new Card[10];
        ArrayList<Card> deck = new ArrayList<Card>();

        System.out.println(runner.getDomain("jen@mvla.net"));

        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card((int)(Math.random()*5+1));
        }

        runner.print(cards);
        runner.sort(cards);
        System.out.println(runner.getLargest(cards));
        runner.scramble(cards);
        runner.print(cards);
        runner.sort(cards);
        runner.print(cards);
        runner.searchReplace(2, cards);
        runner.print(cards);

        System.out.println("\n\n");

        for(int i = 0; i < 10; i++) {
            deck.add(new Card((int)(Math.random()*5+1)));
        }

        runner.print(deck);
        System.out.println(runner.getSmallest(deck));
        runner.scramble(deck);
        runner.print(deck);
        runner.sort(deck);
        runner.print(deck);
        runner.searchReplace(2, deck);
        runner.print(deck);
        runner.searchDelete(5, deck);
        runner.print(deck);
    }
}