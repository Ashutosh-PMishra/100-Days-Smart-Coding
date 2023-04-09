//                                          Day 49 Coding Statement 

// Write a Java Program to remove duplicate elements in an Array

// Description
//  Get an array as input from the user and then remove all the duplicate elements in that array.

// Input
//  Enter the size of Array    : 5
//  Enter the elements of Array: 35 35 60 60 45
// Output
//  35 45 60

import java.util.Arrays;
import java.util.Scanner;
public class dupli_elements{
    static int removeDup(int arr[], int n)
    {
        if(n == 0 || n == 1)
            return n;
        
            int j = 0;
            for(int i = 0; i < n - 1; i++)
            {
                if(arr[i] != arr[i+1])
                    arr[j++] = arr[i];
            }

            arr[j++] = arr[n - 1];
            return j;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:  ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.print("Enter the elements of Array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int s = removeDup(arr, n);
        for(int i = 0; i < s; i++)
            System.out.print(arr[i] + " ");
    }
}