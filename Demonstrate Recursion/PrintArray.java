//PrintArray.java -- program generates an array of random numbers from 1-100
// inclusively and recursively displays all the elements of the array.

import java.util.Random; // program uses class Random

class PrintArray
{
    // print array recursively
    public static void printArray(int[] array, int length)
    {
        // base case -- only one number to print
        if (length == 0)
            return;
        printArray(array,length-1);
        System.out.printf("%s ",array[length-1]);
    }
    public static void main(String[] args)
    {
        System.out.println("Demonstrate Recursion\n");

        // Instantiate new Random object
        Random random = new Random();
        // Instantiate an integer array of size 100
        int[] array = new int[100];

        // fill the array with random numbers inclusively between 1-100 via for loop
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(1,101);
        }

        // print array
        printArray(array,array.length);
    } // end main
} // end class PrintArray
