//                                  Day 7 coding Statement

// Write a Java program to find the Quadrants in which coordinates lie

// Description → 
//  Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

// If both numbers are positive then, it displays the first quadrant.
// Example: Input = 5, 4
// Output = 1st quadrant

// If the first number is negative and the second number is positive then, it displays the second quadrant.
// Example: Input = -5, 4
// Output= 2nd quadrant

// If the first number is negative and the second number is also negative then, it displays the third quadrant.
// Example: Input = -5,-4
// Output= 3rd quadrant

// If the first number is positive and the second number is negative then, it displays the fourth quadrant.
// Example: Input = 5,-4
// Output = 4th quadrant


// Input
// 10 20
// Output
// This point lies in first quadrant.

// Input
// -10 20
// Output
// This point lies in second quadrant.

import java.util.*;
public class quad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y > 0)
            System.out.println("This point lies in the First Quadrant.");

        else if( x < 0 && y > 0)
            System.out.println("This point lies in the Second Quadrant.");

        else if( x < 0 && y < 0)
            System.out.println("This point lies in the Third Quadrant.");

        else if( x > 0 && y < 0)
            System.out.println("This point lies in the Fourth Quadrant.");
        
        else if( x == 0 && y == 0)
            System.out.println("This point lies at the Origin.");
    }
}