// GenericCollectionsTEst.java -- program that calls GenericCollections class to generate and
// sort a list of random number, then calculates the sum and floating-point average of the elements.

import java.util.LinkedList; // program uses class LinkedList

public class GenericCollectionsTest
{
    public static void main(String[] args)
    {
        System.out.println("Demonstrate Generic Collections\n");

        float sum = 0;

        // instantiate new LinkedList and GenericCollections objects
        LinkedList<Integer> list = new LinkedList<>();
        GenericCollections genericCollections = new GenericCollections();

        // add random numbers to LinkedList and calculate sum with for loop
        System.out.printf("%s: [","Unsorted list");
        for (int i = 0; i < 25; i++)
        {
            // set LinkedList
            genericCollections.setLinkedList(list);
            // get and add LinkedList to sum
            sum += genericCollections.getLinkedList(list,i);
            // output LinkedList
            genericCollections.printLinkedList(list, i);
        }

        // sort and output LinkedList with for loop
        genericCollections.sortLinkedList(list);
        System.out.printf("  %s: [","Sorted list");
        for (int i = 0; i < 25; i++)
        {
            genericCollections.printLinkedList(list, i); // output LinkedList
        }

        // output sum and floating-point average
        System.out.printf("%n%s %.0f%n%s %.2f%n",
                "The sum of the list is",sum,
                "The average of the list is",sum/list.size());
    } // end main
} // end class GenericCollectionsTest
