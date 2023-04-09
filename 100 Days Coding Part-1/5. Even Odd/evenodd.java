//               Day 5 Coding Statement

// Write a Java program to identify if the number is even or odd

// Description
//    → Get a number as input from the user and check whether the given number is odd or even

// •Input
//    12
// •Output
//    Even

// •Input
//   15
// •Output
//   Odd

import java.util.*;
public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();

       if(n % 2 == 0)
        System.out.println(n + " is Even.");

       else
        System.out.println(n + " is Odd.");
    }
}
