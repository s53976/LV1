public class CalculatorBeispiel3 {

    public static void main(String[] args) {

        addAddition(3, 4);
        addSubtraktion(5, 3);
        addDivision(10, 2);
        addModulo(30, 3);

    }

    //Addition

    public static int addAddition(int a, int b) {
        int result = a + b;
        System.out.println("Result Addition " + result);
        return result;
    }

    //Subtraktion
    public static int addSubtraktion(int a, int b) {
        int result = a - b;
        System.out.println("Result Subtraktion:  " + result);
        return result;
    }

    //Division
    public static int addDivision(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Result Division " + result);

        } else {
            System.out.println("Division by Zero not possible!");
        }
        return 0;
    }


    //Modulo
    public static int addModulo(int a, int b) {
        int result = a % b;
        System.out.println("Result Modulo " + result);
        return result;
    }
}


