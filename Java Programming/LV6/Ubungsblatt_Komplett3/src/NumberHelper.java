import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {

        int[][] array = {
                {3, 5, 8},
                {4, 5, 6}
        };
        System.out.println("array = " + Arrays.toString((getFlatArray(array))));
        System.out.println("array = " + Arrays.toString((getFlatArray2(array))));

    }


    public static int[] getFlatArray ( int[][] numbers){
        int[] flatArray = new int[numbers.length * numbers[0].length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                flatArray[count] = numbers[i][j];
                count++;
            }
        }
        return flatArray;
    }

    public static int[] getFlatArray2 ( int[][] numbers){
        int[] flatArray = new int[numbers.length * numbers[0].length];
        for (int i = 0; i < flatArray.length ; i++) {
            flatArray[i] = -1;
        }


        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                boolean doppelt = false;
                for (int k = 0; k < flatArray.length; k++) {
                    if(flatArray[k] == numbers[i][j]){
                        doppelt = true;
                        break;
                    }
                }
                if (doppelt == false) {
                    flatArray[count] = numbers[i][j];
                    count++;
                }

            }
        }
        return flatArray;
    }
}
