package HelloWordAssingment;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        int index = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean isChampion = StdRandom.bernoulli(1 / (index + 1.0));

            if (isChampion) {
                champion = word;
            }
            index++;
        }

        if (index == 0) {
            StdOut.println("No input provided.");
        }
        else {
            StdOut.println(champion);
        }
    }
}