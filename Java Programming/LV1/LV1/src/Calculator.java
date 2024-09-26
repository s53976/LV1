public class Calculator {

    public static void main(String[] args) {

        String Name = "Rechner";
        int a = 2;
        int b = 5;
        int ergebnis = 0;
        ergebnis = a + b;
        System.out.println(Name + " Ergebnis " + ergebnis);


        int j = 3;
        System.out.println(++j);
        a += 1; // Ist das selbe wie a++ (es wird um eines erhöht)

        String lastNameA = new String ("Mustermann");
        String lastNameB = new String ("Mustermann");

        System.out.println(lastNameA == lastNameB);
        System.out.println(lastNameA.equals(lastNameB));











    }
}
