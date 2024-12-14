package StapelKarten;

public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card newCard) {
        if (counter > cards.length) {
            System.out.println("Stack is full. No Push");
            return;
        }


        counter++;
        cards[counter] = newCard;

        System.out.println("Push" + newCard);
    }

    public Card pop() {
        if (counter < 0) {
            System.out.println("Stack is emty. Cannot pop any Cards");
            return null;
        }

        Card uppercard = cards[counter];
        counter--;

        System.out.println("Pop" + uppercard);
        return uppercard;
    }

}
