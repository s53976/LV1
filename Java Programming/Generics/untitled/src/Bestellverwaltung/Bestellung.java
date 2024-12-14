package Bestellverwaltung;

public class Bestellung {
    private String Nummer;
    private Bestellzeile[] zeilens;

    public Bestellung(String nummer, Bestellzeile[] zeilens) {
        Nummer = nummer;
        this.zeilens = zeilens;
    }

    public String getNummer() {
        return Nummer;
    }

    public Bestellzeile[] getZeilens() {
        return zeilens;
    }

    public void printBestellung() {
        System.out.println("Bestellnummer: ");
        for (Bestellzeile zeilen : zeilens) {
            System.out.println("Artikel: " + zeilen.getName() + "Menge: " + zeilen.getPreis());
        }
    }

    public double getKosten() {
        double gesamtKosten = 0;
        for (Bestellzeile zeilen : zeilens) {
            gesamtKosten += zeilen.getKosten();
        }
        return gesamtKosten;
    }
}
