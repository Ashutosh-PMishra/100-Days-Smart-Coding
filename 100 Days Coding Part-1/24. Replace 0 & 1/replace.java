//                                Day 24 coding Statement 

// Write a Java program to Replace all 0’s with 1 in a given integer

// Description
//  Get a number as input from the user and find the zeros present in that number.
//  Then convert the zeros into one and then print it.

// Appraoch → 
// • We will convert the integer into string.
// • Then we will convert it into list and then we will traverse through the list.
// • Wherever we find a ‘0’ we will replace with ‘1’.

// Input
//  Enter a number: 850020
// Output
//  New number is: 851121

// Java program to replace all 0's with 1 in a given integer  :→

import java.util.Scanner;
public class replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NUmber: ");
        int num = sc.nextInt();

        // convert the number to string and calculate its length
        String str = Integer.toString(num);
        int len = str.length();
        String str1 = "";

        // use the logic to replace all 0's with 1 in a given integer
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == '0')
                str1 = str1 + '1';
            else
                str1 = str1 + str.charAt(i);
        }
        System.out.print("Converted Number is: "+str1);
    }
}