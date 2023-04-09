//                                    Day 14 Coding Statement

//  Write a Java program to find Sum of digits of a number


// Description
// Get a number from user and then find the sum of the digits in the given number.
// E.g. let the number = 341
// Sum of digits is 3+4+1= 8

// Input
//     4521 
// Output
//    4+5+2+1 = 12

import java.util.*;
public class sumofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0){
            sum = sum + n % 10;  // Find the remainder by using the modulo(%) operator. It gives the last digit of the number(n).
            n = n / 10;          // Divide the number(n) by 10. It removes the last digit of the number.
        }
        System.out.print("Sum of the digit is "+sum);
    }
}

// let say n = 674 is input

// First iteration
// sum = 0 + 674 % 10 = 4
// n = 674 / 10 = 67

// Second iteration
// sum = 4 + 67 % 10 = 4+7= 11
// n =  67 / 10 = 6

// Third iteration
// sum = 11 + 6 % 10 = 11+6 = 17
// n =  6 / 10 = 0
































