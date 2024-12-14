package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {

        int[] array1 = {0, 1, 9, 7};
        int[] array2 = {5, 4, 3, 2, 1};


        System.out.println(Arrays.toString((reverse(array1))));


    }

    public static int[] reverse(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }

    public static int findIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int calcSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static boolean checkPalindrom(ArrayList<Character> chars) {
        if (chars.size() <= 1) {
            return true;
        }

        if (!chars.get(0).equals(chars.get(chars.size() - 1))) {
            return false;
        }

        ArrayList<Character> subList = new ArrayList<>(chars.subList(1, chars.size() - 1));
        return checkPalindrom(subList);
    }

}

