public class RechteckDemo {
    public static void main(String[] args) {
        int breite = 0;
        int laenge = 0;

        int umfang = 0;
        umfang = 2 * (breite + laenge);

        int flaeche = 0;
        flaeche = breite * laenge;

        System.out.println("Flaeche " + flaeche + "Umfang: " + umfang);

    }
}
