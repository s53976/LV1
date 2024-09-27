public class Zusatzaufgabe {
    public static void main(String[] args) {

        int uhrzeit = 0;

        if (uhrzeit >= 6 && uhrzeit < 9) {
            System.out.println("Früh");
        }if  (uhrzeit >= 9 && uhrzeit < 12) {
            System.out.println("Vormittag");
        }
        if (uhrzeit >= 12 && uhrzeit < 16) {
            System.out.println("Nachmittag");
        }
        if (uhrzeit >= 16 && uhrzeit < 20) {
            System.out.println("Abend");
        }
        if (uhrzeit >= 20 && uhrzeit < 6) {
            System.out.println("Nacht");
        }
    }
}
