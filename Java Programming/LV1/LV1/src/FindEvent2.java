public class FindEvent2 {
    public static void main(String[] args) {

        int zahl = 10;

        if (zahl <= 0) {

            System.out.println("Zahl muss größer als 0 sein");
        } else {
            System.out.print("Die gerade Zahl ist " + zahl + ":");

            for (int i = 1; i <= zahl; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }

        }

    }

}
