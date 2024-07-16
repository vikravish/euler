package vikramsspace;

public class Main {

    public static void main(String[] args) {
        int[] inputs = { 1, 2, 3, 4, 5 };
        int[] factorials = factorialArray(inputs);
        for (int i = 0; i < inputs.length; i++) {
            // System.out.println(factorials[i]);
        }
        /*
         * System.out.println("----");
         * System.out.println(multiples3and5(1000));
         * System.out.println(primeFactor(1000));
         */
        // System.out.println(fibEvens(4000000));
        System.out.println(isPalindrome(12321));
        System.out.println(largestThreeDigitPalindrome());
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

    // sums up all the multiples of 3 and 5 from 0-1000
    public static int multiples3and5(Integer max) {
        if (max == null) {
            max = 1000;
        }
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Finds the prime factors of a given number

    public static int primeFactor(Integer maxNumber) {
        int max = 1;
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                if (j % i != 0) {
                    max = j;
                }
            }
        }
        return max;
    }

    // find the sum of the even-valued terms in the Fibonacci sequence whose values
    // do not exceed four million
    public static int fibEvens(Integer range) {
        int a = 0; // first digit of fibonacci sequence (only at the start)
        int b = 1; // second digit of fibonacci sequence (only at the start)
        int c = a + b; // third digit of fibonacci sequence (only at the start)
        int sum = 0; // sum of the even numbers of the fibonacci sequence
        while (a <= range) {
            c = a + b;
            a = b;
            b = c;
            if (c % 2 == 0) {
                sum += c;
            }
        }
        return sum;
    }

    // Find the largest palindrome made from the product of two 3-digit numbers.
    public static int largestThreeDigitPalindrome() {
        int max = 0; // placeholder
        // 999 is the biggest 3-digit number; 100 is the smallest 3-digit number
        for (int i = 999; i >= 100; i--) { //this will be the for the first factor in the multiplication
            for (int j = 999; j >= 100; j--) { //this is for the second factor
                int product = i * j; //summing the two factors together
                if (isPalindrome(product) && product > max) { //testing to see if the number is indeed a palindrome and if it is bigger than the biggest palindrome we already have
                    max = product; //sets the maximum to the new product if the conditions pass

                }
            }
        }
        return max; //returns the maximum after comparing every single number from 100-999 times every single nmber from 100-999
    }

    public static boolean isPalindrome(Integer someNumber) {
        String sTotal = Integer.toString(someNumber);
        int start = 0;
        int end = sTotal.length() - 1;
        while (start < end) {
            //the middle number does not matter in a palindrome
            //which is why the left-side (start) index only needs to be smaller than the right-side (end) index
            if (sTotal.charAt(start) != sTotal.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}