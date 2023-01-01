//PairTest.java -- class that calls Pair class to set and return the
// first and second element of given pairs

import java.util.Random; // program uses class Random

public class PairTest
{
    // get random number
    public static void main(String[] args)
    {
        System.out.println("Create a Generic Class\n");

        String[] words = {"Hello","Hi","World","Hey","Friend"};

        // instantiate new Random object
        Random random = new Random();

        // instantiate new Pair objects with random numbers and words
        Pair<Integer, String>p1 = new Pair(
                random.nextInt(100),
                words[random.nextInt(words.length)]);
        Pair<String, Integer>p2 = new Pair(
                words[random.nextInt(words.length)],
                random.nextInt(100));

        // get and print pairs
        System.out.printf(" First Pair: ( %s, %s )%n",p1.getFirst(),p1.getSecond());
        System.out.printf("Second Pair: ( %s, %s )%n",p2.getFirst(),p2.getSecond());
    } // end main
} // end class PairTest
