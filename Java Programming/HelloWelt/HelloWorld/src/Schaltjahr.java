public class Schaltjahr {
    public static void main(String[] args) {

        int jahr = 2000;

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.println("Das ist ein Schaltjahr");
                } else{
                    System.out.println("Kein Schaltjahr");
                }
            }else{
                System.out.println("Das ist ein Schaltjahr");
            }
        }else {
            System.out.println("Kein Schaltjahr");
        }


    }
}
