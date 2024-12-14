package StapelKarten;

public class Card {
    private int value;
    private String colour;

    public Card(int value, String colour) {
        if (value < 1 || value > 9 ) {
            System.out.println("Value must be between 1 and 9");
        }else {
            this.value = value;
        }

       switch (colour) {
           case "blue":
           case "green":
           case "yellow":
           case "red":
               this.colour = colour;
               break;
           default:
               System.out.println("Wrong value for colour");
       }



    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
