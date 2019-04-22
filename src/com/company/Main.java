package com.company;
/*
1- Create an array to hold the numbers 1-10.
2- Loop through that array and sum the numbers 1-10, then print that total to the screen.
3- Create an array to hold 10 number inputs from the user and print that total to the screen.
4- Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
5- Create an array to store 3 names, loop through that array to print out the names.
6- Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
=========================================

7- Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.

8- Given the following array: ['w','t','y','h','k']
Loop through the array and replace the the letter 't' with the word "hello" once it's found.

9- Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all matching pairs from arrays 1 and 2.
Expected output:
(7,7) and (6,6)
 */


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float Average;



        // allocates memory for 10 integers
        anArray = new int[10];

        // Fill it with numbers using a for-loop
        for (int i = 0; i < 10; i++) {
            anArray[i] = i + 1;  // +1 since we want 1-10 and not 0-9

        }



// Compute sum
        int n, sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
            sum += 0;
            Average = (float)sum / 10;
            System.out.println("Average:"+Average);



// Print the result

            System.out.println("Enter Number: " + anArray[i]);


            System.out.println(sum);
        }
    }
}

