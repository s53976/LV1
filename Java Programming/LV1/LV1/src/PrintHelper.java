public class PrintHelper {

    public static void main(String[] args) {
        printName();
        addition(2,1);
    }


    public static void printName () {
        System.out.println("Susi Sorglos");
        System.out.println("Peter Mayer");
        System.out.println("Max Mustermann");
        printName("Test");

    }

    public static int addition (int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    public static void printName (String name) {
        System.out.println("Name: " + name);

    }



}
