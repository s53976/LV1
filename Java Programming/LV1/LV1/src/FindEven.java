public class FindEven {
    public static void main(String[] args) {

        int zahl = 57;

        if (zahl <= 0) {
            System.out.println("Die Zahl muss größer als 0 sein.");
        } else {
            System.out.print("Gerade Zahlen bis " + zahl + ": ");

            for (int i = 1; i <= zahl; i++) {
                if (i % 2 == 0) {
                    System.out.print(" " + i);
                }
            }
        }

    }
}
