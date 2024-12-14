package arrays;

public class PalindromChecker {
    public static void main(String[] args) {
        String test = "Test";
        String testUpper = test.toUpperCase();
        System.out.println("testUpper = " + testUpper);

        char first = test.charAt(0);
        System.out.println("first = " + first);
        char last = testUpper.charAt(test.length()-1);
        System.out.println("first = " + first);
        System.out.println("last = " + last);



        System.out.println(last == first);
    }
}
