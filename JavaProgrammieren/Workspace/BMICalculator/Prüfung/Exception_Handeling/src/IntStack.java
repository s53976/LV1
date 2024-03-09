public class IntStack {


    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int [maxSize];
        this.pointer = -1;
    }

    public void push (int value) {
        pointer ++;
        stack[pointer] = value;
    }

    public int pop () {
        if (pointer == -1) {
            System.out.println("Stack ist leer");
        }
       // throw new StackEmtyException("Mein Stack hat nichts herzugeben");

        int res = stack[pointer];
        stack[pointer] = 0;
        pointer --;
        return res;
    }

}
