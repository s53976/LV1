public class inStackDemo {

    public static void main(String[] args) {

        int[] array = new int[6];

        IntStack stack = new IntStack(2);


        int value = stack.pop();
        System.out.println("Value = " + value);
        //stack.pop();
        System.out.println();

        stack.push(3);
        stack.push(4);
        stack.push (5);


    }
}
