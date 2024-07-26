package vikramsspace;

import java.math.BigInteger;

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
        // System.out.println(isPalindrome(12321));
        // System.out.println(largestThreeDigitPalindrome());
        //System.out.println(eulerFive(999999999));
        //System.out.println(factorialRecursive(5));
        System.out.println(eulerEight(null));
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

    public static int factorialRecursive(int number){
        int num = number;
        if (num == 0){
            return 1;
        }
        else{
            return num * factorialRecursive(num-1);
        }
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
    // Does this by multiplying every number from 100-999 by every number from
    // 100-999 | ex. 999 * 999, 999 * 998...
    public static int largestThreeDigitPalindrome() {
        final int initialMax = 0;
        int max = initialMax;
        // 999 is the biggest 3-digit number; 100 is the smallest 3-digit number
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int product = i * j; // product is a potential palindrome made from multiplying two 3-digit numbers
                boolean isBigger = product > max; // tests if the current product is bigger than the current max
                if (isPalindrome(product) && isBigger) {
                    max = product; // sets the maximum to the new product if the conditions pass

                }
            }
        }
        return max;
    }

    public static boolean isPalindrome(Integer someNumber) {
        String sTotal = Integer.toString(someNumber);
        int start = 0;
        int end = sTotal.length() - 1;
        while (start < end) {
            // the middle number does not matter in a palindrome
            // which is why the left-side (start) index only needs to be smaller than the
            // right-side (end) index
            if (sTotal.charAt(start) != sTotal.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // This function returns the smallest positive number that is evenly divisible
    // by all of the numbers from 1 to 20
    public static int eulerFive(Integer someNumber) {
        int x = Integer.MAX_VALUE; // biggest number in java
        for (int i = 1; i < x; i++) { // 999999999 representing the biggest number usable in this version of java i
                                      // think
            if (isDivisbleFrom1to20(i) == true) {
                return i;
            }
        }
        return -1; // needed to not have error

    }

    // Tests if a number is divisible by all numbers from 1-20
    public static boolean isDivisbleFrom1to20(Integer someNumber) {
        for (int i = 1; i <= 20; i++) {
            if (someNumber % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static long eulerEight(String someString){
        String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        long max = 0;
        for (int i = 0; i < number.length()-13; i++){
            String sequence = number.substring(i, i+13);
            long testNum = eulerEightMultiplication(sequence);
            if (testNum > max){
                max = testNum;
            }
        }
        return max;
    }

    public static BigInteger eulerEightMultiplication(String sequence){
        long range = (Long.parseLong(sequence));
        BigInteger[] nums = new BigInteger[13];
        BigInteger working = BigInteger.valueOf(range);
        BigInteger working2 = null;
        for (int i = sequence.length()-1; i > 0 ; i--){
            nums[i] = working%(10*(i));
            working = nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            working2 = working2 * nums[i];
        }
        return working2;
    }

}