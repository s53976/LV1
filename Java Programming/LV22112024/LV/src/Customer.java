import java.util.ArrayList;

public class Customer extends Person {
    private int CostomerNumber;
    private ArrayList <Adress> Adresses = new ArrayList<>();


    public Customer(int costomerNumber, String firstname, String lastname) {
        super(firstname, lastname);
        CostomerNumber = costomerNumber;
    }

    public void addAdress (Adress adress) {
        Adresses.add(adress);
    }


    public void print () {
        System.out.println("CostomerNumber = " + CostomerNumber);
        System.out.println("Adresses = " + Adresses);;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Customer{" +
                "CostomerNumber=" + CostomerNumber +
                ", adresses=" + Adresses +
                '}';
    }
}
