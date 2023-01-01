// Sentence.java -- class that calls Words class to randomly generates sentences.

public class Sentence
{
    //return generated sentence
    public String getSentence()
    {
        // instantiate new Word and StringBuilder objects
        Word word = new Word();
        StringBuilder sentence = new StringBuilder();

        // set words
        word.setArticle();
        word.setNoun();
        word.setVerb();
        word.setPreposition();
        word.setArticle2();
        word.setNoun2();

        // get words and concatenate with spaces and ending period
        sentence.append(word.getArticle()).append(" ")
                .append(word.getNoun()).append(" ")
                .append(word.getVerb()).append(" ")
                .append(word.getPreposition()).append(" ")
                .append(word.getArticle2()).append(" ")
                .append(word.getNoun2()).append(".");

        // capitalize first letter of sentence
        sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));
        return sentence.toString();
    }
} // end class Sentence
