package org.campus02.arrays;

public class ArrayHelper {
    public static void main(String[] args) {

        int numbers[] = {8,5,1,9,0,4};
        arrangeOrder(numbers);
        for (int number : numbers) {
            System.out.println(number + "");
        }




    }

    public static void arrangeOrder(int[] numbers) {
        boolean swapped = true;
        while (swapped == true) {
            swapped = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }

            }
        }
    }

}
