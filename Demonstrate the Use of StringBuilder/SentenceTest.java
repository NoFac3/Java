// SentenceTest.java -- testing class that displays sentences generated by calling Sentence class

public class SentenceTest
{
    public static void main(String[] args)
    {
        System.out.println("Generate Sentences with StringBuilder\n");

        // instantiate Sentence object
        Sentence sentence = new Sentence();

        // get random sentences with for loop
        for (int i = 1; i <= 20; i++)
        {
            System.out.printf("Sentence %s: %s%n",i,sentence.getSentence());
        }
    } // end main
} // end class SentenceTest
