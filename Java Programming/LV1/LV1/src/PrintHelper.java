public class PrintHelper {

    public static void main(String[] args) {
        printName();
        addition(2, 1);
        printSomething("Test");

    }


    public static void printName() {
        System.out.println("Susi Sorglos");
        System.out.println("Peter Mayer");
        System.out.println("Max Mustermann");


    }

    public static int addition(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    public static void printSomething(String name) {
        System.out.println("Name: " + name);

    }


}
