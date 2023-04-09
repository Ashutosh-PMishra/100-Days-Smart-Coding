//                            Day 4 Coding Statement

// Write a Java program to identify of the a number is positive or negative

// Description :-
//  → Get an input number from the user and check whether it is a positive or negative number.

// Input : -20
// Output : Negative number

// Input :0
// Output : Neither positive nor negative

// Input :55
// Output : Positive number

import java.util.*;
public class posneg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        double n = sc.nextDouble();             

        if(n < 0.0)
            System.out.println(n + " is a Negative Number.");
        
        else if (n > 0.0)
            System.out.println(n + " is a Positive Number.");

        else
            System.out.println(n + " is Zero.");
    }
}
