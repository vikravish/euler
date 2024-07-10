package vikramsspace;

public class Main {

    public static void main(String[] args) {
        int[] inputs = { 1, 2, 3, 4, 5 };
        int[] factorials = factorialArray(inputs);
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(factorials[i]);
        }
    }

    // reverse string, and return it

    public static String reverse(String string) {
        // String[] letters = string.split("");
        // String[] srettel = new String[letters.length];
        String srettel = "";
        for (int i = 0; i < string.length(); i++) {
            srettel = srettel + string.charAt(string.length() - 1 - i);
        }
        // for (String letter : letters) {
        // srettel[letters.length()-1] = letter;
        // }
        // String result = "";
        // for (String letter : srettel) {
        // result = result + letter;
        // }
        return srettel;
    }

    // return the same string

    public static String returnString(String arg) {
        return arg;
    }

    // factorial of given int
    // a factorial is a number times every individual whole number smaller than it.
    // ex: 5! = 5*4*3*2*1 = 120
    public static int factorial(int number) {
        int num = number;
        for (int i = 1; i < number; i++) {
            num = num * i;
        }
        return num;
    }

    public static int[] factorialArray(int[] inputs) {
        int[] nums = inputs;
        for (int i = 0; i < inputs.length; i++) {
            // 1. get the factorial and 2. save our result
            nums[i] = factorial(inputs[i]);
        }
        return nums;
    }
    //sums up all the multiples of 3 and 5 from 0-1000
    public static  int multiples3and5(int number){
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            if (i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static 

}