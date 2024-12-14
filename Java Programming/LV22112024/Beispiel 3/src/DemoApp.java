import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {

        Hase hase = new Hase("Norbert ");
        Weihnachshase weihnachshase = new Weihnachshase("Gabi ");
        Osterhase osterhase = new Osterhase("Albert ");

        hase.verteilen();
        hase.hoppeln();
        osterhase.fressen();
        weihnachshase.verteilen();

        ArrayList<Hase> hasenstall = new ArrayList<>();
        hasenstall.add(osterhase);
        hasenstall.add(weihnachshase);

        System.out.println("-----Liste-----");

        for (Hase hase1 : hasenstall) {
            hase1.verteilen();
            hase1.fressen();
        }

        System.out.println("-----UP Casting-------");

        Hase h = weihnachshase;
        h.fressen();
        h.verteilen();

        System.out.println("-----DOWN Costing------");
        Weihnachshase wh = (Weihnachshase)  h;
        wh.verteilen();
        wh.fressen();
    }


}

