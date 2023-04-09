//                          Day 6 Coding Statement

// Write a Java program to find ASCII values of a character

// Description: 
//    - Get an input character from the user and give the ASCII value of the given input as the output.

// Input: b
// Output: 98

// Input: A
// Output: 65

import java.util.*;
public class ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch = sc.next().charAt(0);

        int ascii_value = ch;
        //   We can also use cast char to int 
        int castAscii = (int) ch;

        System.out.println("The ASCII Value of "+ch+" is: " +ascii_value); 
        System.out.println("The ASCII Value of "+ch+" is: " +castAscii);
    }
}