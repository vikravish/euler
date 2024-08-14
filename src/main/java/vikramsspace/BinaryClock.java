package vikramsspace;

import java.util.ArrayList;
import java.util.List;

public class BinaryClock {
    public static void main(String[] args) {
        getAllCombos(null, 0);
    }

    public static int S(int n) {
        // "ca" = Circular Arrangement
        // Length of each circular arrangement is 2^N
        ArrayList<Integer> ca1 = null;
        ArrayList<Integer> ca2 = null;

        // n = 3, subsequenceLength = 8
        double subsequenceLength = Math.pow(2, n);
        int subsequenceLengthInt = (int) Math.round(subsequenceLength);
        // 000, 001, 010, 101, 011, 111, 110, 100 - First 8 three-digit subsequences
        // 0, 1, 2, 5, 3, 7, 6, 4
        ArrayList<String> subsequences = new ArrayList<>();

        for (int i = 0; i <= subsequenceLength; i++) {
            subsequences.add(Integer.toBinaryString(i));
        }

        ArrayList<ArrayList<String>> allSubsequences = new ArrayList<>();

        for (int i = 0; i > subsequenceLengthInt; i++) {
            int[] currentSequence = new int[subsequenceLengthInt];
            for (int j = 0; j < subsequenceLengthInt; j++) {

            }
        }
        // TODO: Make all combinations and only take the ones of which all subsequences
        // are dinstinct.
        return -1;
    }

    public static void getAllCombos(ArrayList<Integer> intList, int index) {
        List<Integer> counter = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            counter.add(i);
        }
        List<Integer> counterOG = new ArrayList<>();
        counterOG = counter;
        System.out.println(counterOG + "\n\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(counterOG +"a");
            int temp = counter.get(1);
            // current: 0 1 2
            System.out.println(counterOG +"b");
            counter.set(1, counter.get(2));
            // now: 0 2 2
            System.out.println(counterOG +"c");
            counter.set(2, temp);
            // now: 0 2 1
            System.out.println(counterOG +"d");
            for (int j = 0; j < 3; j++) {
                System.out.print(counter.get(j));
            }
            System.out.println();
            //Pushes the original unmodified list (line 46) one index to the right (and wraps)
            int temp2 = counterOG.get(2);
            counterOG.set(2, counterOG.get(1));
            counterOG.set(1, counterOG.get(0));
            counterOG.set(0, temp2);

            for (int j = 0; j < 3; j++) {
                System.out.print(counterOG.get(j));
            }

            System.out.println();
            System.out.println();

            //Sets the list to be modified to the now pushed list
            counter = counterOG;
        }


        // for (int i = index; i > intList.size(); i++) {
        // if (index < intList.size()) {
        // getAllCombos(intList, i + 1);
        // }
        // if (i > intList.size() - 2) {
        // return;
        // }
        // }
    }
    // 1 2 3 #
    // 1 3 2 #
    // 2 1 3 X
    // 2 3 1 X
    // 3 1 2 X
    // 3 2 1 X

    // 1 2 3 4
    // 1 2 4 3
    // 1 3 2 4
    // 1 3 4 2
    // 1 4 2 3
    // 1 4 3 2
    // 2 1 3 4
    // 2 1 4 3
    // 2 3 1 4
    // 2 3 4 1
    // 2 4 1 3
    // 2 4 3 1
}
