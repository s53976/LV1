package StapelKarten;

public class CardDemo {
    public static void main(String[] args) {

        Card[] cardArray = new Card[5];


        CardStack cardStack = new CardStack(cardArray);

        cardStack.push(new Card(5,"blue"));
        cardStack.push(new Card(2,"green"));
        cardStack.push(new Card(7,"yellow"));


        cardStack.pop();
        cardStack.pop();
        cardStack.pop();
        cardStack.pop();

    }
}
