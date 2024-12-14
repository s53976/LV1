import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        // Beispiel: ArrayList mit Zahlen
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Test der iterativen Methode
        int iterativeResult = iterativeSum(numbers);
        System.out.println("Iterative Summe: " + iterativeResult);

        // Test der rekursiven Methode
        int recursiveResult = recursiveSum(numbers);
        System.out.println("Rekursive Summe: " + recursiveResult);
    }


    // Methode zur iterativen Berechnung der Summe
    public static int iterativeSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Methode zur rekursiven Berechnung der Summe
    public static int recursiveSum(ArrayList<Integer> numbers) {
        return recursiveSumHelper(numbers, 0);
    }

    // Hilfsmethode für die rekursive Berechnung
    private static int recursiveSumHelper(ArrayList<Integer> numbers, int index) {
        // Basisfall: Wenn der Index das Ende der Liste erreicht, gebe 0 zurück
        if (index == numbers.size()) {
            return 0;
        }
        // Rekursiver Fall: Addiere das aktuelle Element zur Summe der restlichen Elemente
        return numbers.get(index) + recursiveSumHelper(numbers, index + 1);
    }


}
