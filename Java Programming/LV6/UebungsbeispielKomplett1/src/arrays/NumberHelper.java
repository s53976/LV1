package arrays;

import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int array[] = new int[] {1,5,3,1,9,2,5};
        System.out.println("array = " + isSortedArray(array));
        System.out.println("array = " + Arrays.toString(removeDuplicates(array)));
    }
    
    public static boolean isSortedArray(int[] numbers) {

        for (int i = 0; i < numbers.length -1; i++) {
            if(numbers[i]> numbers[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == -1) continue;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                        numbers[j] = -1;
                }
            }
        }
        return numbers;
    }
   
    
}
