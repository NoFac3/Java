// Word.java -- Class that is called to randomly generate words

import java.security.SecureRandom; //program uses class SecureRandom

public class Word
{
    String[] articles = { "the", "a", "one", "some", "any" };
    String[] nouns = { "boy", "girl", "dog", "town", "car" };
    String[] verbs = { "drove", "jumped", "ran", "walked", "skipped" };
    String[] prepositions = { "to", "from", "over", "under", "on" };
    String article, noun, verb, preposition, article2, noun2;

    // instantiate new SecureRandom object for random numbers
    SecureRandom Random = new SecureRandom();

    // return random number
    public int getRandom() { return Random.nextInt(4); }
    // set article
    public void setArticle()
    {
        this.article = articles[getRandom()];
    }
    // set noun
    public void setNoun()
    {
        this.noun = nouns[getRandom()];
    }
    // set verb
    public void setVerb()
    {
        this.verb = verbs[getRandom()];
    }
    // set preposition
    public void setPreposition()
    {
        this.preposition = prepositions[getRandom()];
    }
    // set second article
    public void setArticle2()
    {
        this.article2 = articles[getRandom()];
    }
    // set second noun
    public void setNoun2()
    {
        this.noun2 = nouns[getRandom()];
    }
    // return article
    public String getArticle() {return article;}
    // return noun
    public String getNoun() {return noun;}
    // return verb
    public String getVerb() {return verb;}
    // return preposition
    public String getPreposition() {return preposition;}
    //return second article
    public String getArticle2() {return article2;}
    // return second noun
    public String getNoun2() {return noun2;}
} // end class Word
