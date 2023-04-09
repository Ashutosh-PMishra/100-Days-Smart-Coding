//                                      Day 10 Coding Statement

// Write a Java program to find Number of digits in an integer

// Description :→
//  Take an integer as the input from the user and then calculate the number of digits 
//  in the given input and print it as the output.

// Input
//     32561
// Output
//     5

// Input
//     335
// Output
//     3

// Problem Solution :→
// 1. Take the value of the integer and store in a variable.
// 2. Using a while loop, get each digit of the number and increment the count each time a digit is obtained.
// 3. Print the number of digits in the given integer.
// 4. Exit.

import java.util.*;
public class digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter any Number :: ");
        int n = sc.nextInt();         // 335 / 10 = 33 → count = 1
        while(n != 0){                 // 33 / 10 = 3 → count = 2
            n = n / 10;                 // 3 / 10 = 0 → count = 3
            count++;
        }
        System.out.println("Number of digits in the entered number are : "+ count);
    }
}