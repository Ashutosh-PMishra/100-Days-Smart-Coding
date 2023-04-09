//                                          Day 47 Coding Statement 

// Write a Java Program to find sum of elements in an Array

// Description
//  Get an array as the input from the user and find the sum of the elements.

// Input
//  Enter the size of the Array: 3
//  Enter the Array elements   : 5 10 15
// Output
//  Sum of elements in an Array: 30

import java.util.Scanner;
public class sumofarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        System.out.println("Sum of elements in an Array: "+sum);
        }
}