//                                           Day 39 coding Statement 

// Write a Java Program to print Non-repeating characters in a string

// Description
//   Get a string as the input from the user and print the non-repeating characters in a string.

// Example ► Hello : h e o 

// Input
//   Enter a string: Simplified Learner
// Output
//   Non repeating characters are: d e f l m p s

import java.util.Scanner;
public class non_repeating_char
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int frequency[] = new int[256];
        for(int i = 0; i < str.length(); i++)
            frequency[str.charAt(i)]++;

        System.out.print("Non repeating characters are: ");

        for(int i = 0; i < 256; i++)
            if(frequency[i] == 1)
            System.out.print((char)i + " ");
    }
}































