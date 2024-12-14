public class PrintNumbers {

    public static void main(String[] args) {
       int n = 5;
        printFromNToZero(n);

    }




    public static void printFromNToZero (int n) {
        if (n < 0) {
            return;
        }
        printFromNToZero(n-1);

        System.out.println(n);
    }

}