package Rezeptverwaltung;

public class RezeptDemo {
    public static void main(String[] args) {

        Zutat z1 = new Zutat("Zucker", 100);
        Zutat z2 = new Zutat("Mehl", 200);
        Zutat z3 = new Zutat("Eier", 2);

        Zutat[] zutaten = {z1, z2, z3};
        Rezept rezept = new Rezept("Kuchen", 4, zutaten);

        rezept.printRezept();

        Rezept neuesRezept = rezept.RezeptUmrechnen(8);
        neuesRezept.printRezept();

    }
}
