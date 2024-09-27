public class CalculatorBeispiel3 {

    public static void main(String[] args) {
        addi(3,4);
        sub(5,3);
        div(10,2);
        modulo(30,3);
    }

    //Addition

    public static int addi (int a, int b) {
        int result = a + b;
        System.out.println("Addition " + result);
        return result;
    }

    //Subtraktion
    public static int sub (int a, int b) {
        int result = a - b;
        System.out.println("Subtraktion:  " + result);
        return result;
    }

    //Division
    public static int div (int a, int b) {
        int result = a / b;
        System.out.println("Division " +result);
        return result;
    }

    //Modulo
    public static int modulo (int a, int b) {
        int result = a % b;
        System.out.println("Modulo " +result);
        return result;
    }

}
