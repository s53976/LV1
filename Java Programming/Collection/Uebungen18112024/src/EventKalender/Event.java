package EventKalender;

import java.util.Objects;

public class Event {
    private String Titel;
    private String Ort;
    private double Eintrittspreis;

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getEintrittspreis() {
        return Eintrittspreis;
    }

    public void setEintrittspreis(double eintrittspreis) {
        Eintrittspreis = eintrittspreis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Double.compare(Eintrittspreis, event.Eintrittspreis) == 0 && Objects.equals(Titel, event.Titel) && Objects.equals(Ort, event.Ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Titel, Ort, Eintrittspreis);
    }
}
