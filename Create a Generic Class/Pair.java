//Pair.java -- class with two type parameters that sets and
// returns the first and second element of the given pairs

public class Pair<F, S>
{
    private F first;
    private S second;
    // constructor calls setters to arrange pair
    public Pair(F first, S second)
    {
        setFirst(first);
        setSecond(second);
    }
    // set first element
    public void setFirst(F first){this.first = first;}
    // set second element
    public void setSecond(S second){this.second = second;}
    // get first element
    public F getFirst(){return first;}
    // get second element
    public S getSecond(){return second;}
} // end class Pair
