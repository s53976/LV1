import java.util.ArrayList;

public class AppDemo {
    public static void main(String[] args) {

        Adress adress1 = new Adress("Straße", "8700", "TestCity1", "Graz");
        Adress adress2 = new Adress("Straße", "8700", "TestCity1", "Eisenstadt");
        Adress adress3 = new Adress("Straße", "8700", "TestCity1", "Innsbruck");

        ArrayList<Adress> initialAdresses = new ArrayList<>();
        initialAdresses.add(adress1);


        Customer customer1 = new Customer( 12345, "Julian", "Irmler");
        Customer customer2 = new Customer( 12345, "Julian", "Irmmler");

        customer1.addAdress(adress1);
        customer2.addAdress(adress2);


        System.out.println("-------Customer Print-----");
        customer1.print();

        System.out.println("-------Customer 1--------");

        System.out.println("customer1 = " + customer1);
        System.out.println("customer2 = " + customer2);



    }
}
