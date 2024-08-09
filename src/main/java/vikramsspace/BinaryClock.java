package vikramsspace;

import java.util.ArrayList;

public class BinaryClock {
    public static void main(String[] args) {
       
    }

    public static int S(int n){
        //"ca" = Circular Arrangement
        //Length of each circular arrangement is 2^N
        ArrayList<Integer> ca1 = null;
        ArrayList<Integer> ca2 = null;
        
        //n = 3, subsequenceLength = 8
        double subsequenceLength = Math.pow(2, n);
        //000, 001, 010, 101, 011, 111, 110, 100 - First 8 three-digit subsequences
        //  0,   1,   2,   5,   3,   7,   6,   4
        ArrayList<String> subsequences = new ArrayList<>();

        for(int i = 0; i <= subsequenceLength; i++){
            subsequences.add(Integer.toBinaryString(i));
        }

        ArrayList<ArrayList<String>> allSubsequences = new ArrayList<>();

        //TODO: Make all combinations and only take the ones of which all subsequences are dinstinct.
    }
}
