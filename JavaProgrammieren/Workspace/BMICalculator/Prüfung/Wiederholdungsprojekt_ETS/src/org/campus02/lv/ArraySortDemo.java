package org.campus02.lv;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int [] numbers =  {2,3,1,6,4,8,10};
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

        char[] chars = {'c' , 'a', 'b'};
        Arrays.sort(chars);
        System.out.println(chars);


    }

}
