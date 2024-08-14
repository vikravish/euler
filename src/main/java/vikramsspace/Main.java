package vikramsspace;

import java.math.BigInteger;
import vikramsspace.BinaryClock;

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
        // System.out.println(eulerFive(999999999));
        // System.out.println(factorialRecursive(5));
        // System.out.println(eulerEight(null));
        // eulerEleven(0);
        BinaryClock.getAllCombos(null, 0);
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

    public static int factorialRecursive(int number) {
        int num = number;
        if (num == 0) {
            return 1;
        } else {
            return num * factorialRecursive(num - 1);
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

    /*
     * public static long eulerEight(String someString){
     * String number =
     * "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
     * long max = 0;
     * for (int i = 0; i < number.length()-13; i++){
     * String sequence = number.substring(i, i+13);
     * long testNum = eulerEightMultiplication(sequence);
     * if (testNum > max){
     * max = testNum;
     * }
     * }
     * return max;
     * }
     * 
     * public static BigInteger eulerEightMultiplication(String sequence){
     * long range = (Long.parseLong(sequence));
     * BigInteger[] nums = new BigInteger[13];
     * BigInteger working = BigInteger.valueOf(range);
     * BigInteger working2 = null;
     * for (int i = sequence.length()-1; i > 0 ; i--){
     * nums[i] = working%(10*(i));
     * working = nums[i];
     * }
     * for (int i = 0; i < nums.length; i++){
     * working2 = working2 * nums[i];
     * }
     * return working2;
     * }
     */

    /**
     * Largest Product in a Grid
     * Show HTML problem content
     * Problem 11
     * In the grid below, four numbers along a diagonal line have been marked in
     * red.
     * The product of these numbers is .
     * 
     * What is the greatest product of four adjacent numbers in the same direction
     * (up, down, left, right, or diagonally) in the grid?
     * 
     * @param a
     */

    public static void eulerEleven(int a) {
        String gridString = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08\n49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00\n81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65\n52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91\n22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80\n24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50\n32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70\n67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21\n24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72\n21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95\n78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92\n16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57\n86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58\n19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40\n04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66\n88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69\n04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36\n20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16\n20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54\n01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

        // Splitting each row by spaces and inserting into grid
        String[] gridString1D = gridString.split("\n");

        // Creates empty 2D string array for the grid
        String[][] grid = new String[20][20];
        for (int i = 19; i >= 0; i--) {
            grid[i] = gridString1D[i].split(" ");
        }
        boolean DEBUG = true;
        if (DEBUG) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }

        int[][] intGrid = new int[20][20];

        // grid.map(row -> {
        // row.map(rawInput -> Integer.parseInt(rawInput))
        // });
        // for (int[] row : grid) {
        // for (String rawInput : row) {

        // }
        // }
        // // (0 until 20)
        // // .map((i) -> {
        // // (0 until 20).map(j -> {
        // // Integer.parseInt()
        // // })
        // // })
        // for (int i = 0; i < 20; i++) {
        // for (int j = 0; j < 20; j++) {
        // intGrid[i][j] = Integer.parseInt(grid[i][j]);
        // }
        // }
        // Integer maxNum = null;
        // for (int i = 0; i < 20; i++) {
        // for (int j = 0; j < 20; j++) {
        // int[] row = intGrid[i];
        // // TODO: Add vertical loop
        // int x = row[(j + 0) % 20] *
        // row[(j + 1) % 20] *
        // row[(j + 2) % 20] *
        // row[(j + 3) % 20];
        // if (x > maxNum) {
        // maxNum = x;
        // }
        // }
        // }

    }

}