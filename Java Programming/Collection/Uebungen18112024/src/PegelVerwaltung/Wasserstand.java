package PegelVerwaltung;

import java.util.Objects;

public class Wasserstand {
    private int id;
    private String GewaesserName;
    private double messWert;
    private double messWertFuerAlamierung;
    private int Zeitpunkt;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlamierung, int zeitpunkt) {
        this.id = id;
        GewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlamierung = messWertFuerAlamierung;
        Zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return GewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        GewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlamierung() {
        return messWertFuerAlamierung;
    }

    public void setMessWertFuerAlamierung(double messWertFuerAlamierung) {
        this.messWertFuerAlamierung = messWertFuerAlamierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wasserstand that = (Wasserstand) o;
        return id == that.id && Double.compare(messWert, that.messWert) == 0 && Double.compare(messWertFuerAlamierung, that.messWertFuerAlamierung) == 0 && Zeitpunkt == that.Zeitpunkt && Objects.equals(GewaesserName, that.GewaesserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, GewaesserName, messWert, messWertFuerAlamierung, Zeitpunkt);
    }
}
