//                                   Day 9 Coding Statement

// Write a Java program to find roots of a quadratic equation

// Description :→
//      Get the values of a, b and c (coefficients of quadratic equation) as input from the user and
//      calculate the roots and print as the output.

// The standard form of a quadratic equation is:
//               ax² + bx + c = 0, where
//               a, b and c are real numbers and   a != 0
                       
// The term b² - 4ac is known as the discriminant of a quadratic equation. 
// It tells the nature of the roots.

// • If the discriminant is greater than 0, the roots are real and different.
// • If the discriminant is equal to 0, the roots are real and equal.
// • If the discriminant is less than 0, the roots are complex and different.

// Input
//  Enter the value of a, b and c : 1 -6 9
// Output
//  Roots are equal
//  Root 1= root 2 = 3.00

import java.util.*;
public class roots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the values of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the values of c: ");
        double c = sc.nextDouble();

        if( a == 0)
            System.out.println("Invalid Input! a cannot be zero");
        else{
            double d = Math.pow(b,2) - 4*a*c; // Calculate discriminant : b² - 4ac

            if(d > 0){
                System.out.println("Roots are Real and Different.");
                System.out.println("Roots are " + (-b + Math.sqrt(d))/(2*a) + " and " + (-b - Math.sqrt(d))/(2*a));
            }
            else if( d == 0){
                System.out.println("Roots are real and equal");
                System.out.println("Roots are " + -b / (2*a));
            }
            else if(d < 0){
                System.out.println("Roots are complex and different");
                System.out.println("Roots are " + -b/(2*a) + "+i" +Math.sqrt(-d)/(2*a) 
                   + " and "+ -b/(2*a) + "-i" +Math.sqrt(-d)/(2*a) );
            }
        }
    }
}
