//                                    Day 28 coding Statement 

// Write a Java program to find the double of the given number without using arithmetic operator

// Description
//  For the given input number calculate the double of it without using arithmetic operator.

// Input
//  Enter the number: 4           00000100 << 1 → 00001000
// Output
//  Double of 4 is 8

// Input
//  Enter the number: 5          00000101 << 1 → 00001010
// Output
//  Double of 5 is 10

import java.util.Scanner;
public class no_double
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Double of "+num+" is ");
        System.out.println(num<<1);  // left shift
    }
}