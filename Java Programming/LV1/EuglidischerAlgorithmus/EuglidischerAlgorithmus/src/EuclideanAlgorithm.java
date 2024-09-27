import java.util.Scanner;

public class EuclideanAlgorithm {
    // Methode zur Berechnung des GGT mit Ausgabe des Rechenwegs und der Linearkombination
    public static int calculateGCD(int a, int b) {
        int x0 = 1, x1 = 0;  // Koeffizienten für a
        int y0 = 0, y1 = 1;  // Koeffizienten für b

        System.out.println("Rechenweg:");

        // Kopien der Eingaben für die finale Gleichung
        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int q = a / b;  // Quotient
            int remainder = a % b;
            System.out.println(a + " = " + b + " * " + q + " + " + remainder);

            // Aktualisierung der Koeffizienten
            int tempX = x0 - q * x1;
            int tempY = y0 - q * y1;

            // Verschieben der Koeffizienten
            x0 = x1;
            x1 = tempX;
            y0 = y1;
            y1 = tempY;

            // Aktualisierung der Werte für a und b
            a = b;
            b = remainder;
        }

        // Ausgabe der Linearkombination
        System.out.println("Gleichung: " + a + " = " + originalA + " * " + x0 + " + " + originalB + " * " + y0);

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe
        System.out.print("Geben Sie die erste Zahl ein: ");
        int num1 = scanner.nextInt();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        int num2 = scanner.nextInt();

        // Berechnung des GGT mit Ausgabe des Rechenwegs und der Gleichung
        int gcd = calculateGCD(num1, num2);

        // Ausgabe des Ergebnisses
        System.out.println("Der größte gemeinsame Teiler von " + num1 + " und " + num2 + " ist: " + gcd);
    }
}
