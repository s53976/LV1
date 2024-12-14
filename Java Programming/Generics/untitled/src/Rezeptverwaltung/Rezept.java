package Rezeptverwaltung;

public class Rezept {
    private String Name ;
    private int Personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        Name = name;
        Personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return Name;
    }

    public int getPersonen() {
        return Personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }

    public void printRezept() {
        System.out.println(Name);
        for (int i = 0; i < zutaten.length; i++) {
            System.out.println(zutaten[i].getMenge());
            System.out.println(zutaten[i].getName());
        }
    }

    public Rezept RezeptUmrechnen (int neuePersonen) {
        Zutat[] neueZutaten = new Zutat[zutaten.length];
        for (int i = 0; i < zutaten.length; i++) {
            int neueMenge = zutaten[i].getMenge() * neuePersonen / Personen;
            neueZutaten[i] = new Zutat(zutaten[i].getName(),neueMenge);
        }

        return new Rezept (Name , Personen, neueZutaten);

    }

}
