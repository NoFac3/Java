// GenericCollections.java -- class that is called to create and sort a list of generated random numbers

import java.security.SecureRandom; // program uses class SecureRandom
import java.util.LinkedList;       // program uses class LinkedList
import java.util.Collections;      // program uses class Collections

public class GenericCollections
{
    // instantiate new SecureRandom object
    SecureRandom Random = new SecureRandom();

    // get random number
    private int getRandom()
    {
        return Random.nextInt(101);
    }
    // set LinkedList
    public void setLinkedList(LinkedList<Integer> list)
    {
        list.add(getRandom()); //add random number to LinkedList
    }
    // get LinkedList
    public int getLinkedList(LinkedList<Integer> list, int i) { return list.get(i); }
    // sort LinkedList
    public void sortLinkedList(LinkedList<Integer> list) { Collections.sort(list); }
    // output LinkedList
    public void printLinkedList(LinkedList<Integer> list,int i)
    {
        if (i<24)
            {
                System.out.printf("%d, ",getLinkedList(list,i));
            }
        else
            {
                System.out.printf("%d]%n",getLinkedList(list,i));
            }
    }
} // end class GenericCollections
