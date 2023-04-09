//                                            Day 50 Coding Statement 

// Code in Java 
// Given 2 integer Arrays X and Y of same size. 
// Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors

// Sample input:
//  Enter the size of the Array: 4
//  Enter the Array1 Elements  : 1 2 3 4
//  Enter the Array2 Elements  : 5 6 7 8 
// Sample output :
//  Minimum Scalar Product is: 60

// Explanation :
//  (4*5 + 3*6 + 2*7 + 1*8) = 60

import java.util.Scanner;
public class dot_products
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        System.out.print("Enter the Array1 Elements: ");
        for(int i = 0 ; i<n ; i++)
            arr1[i] = sc.nextInt();

        int arr2[] = new int[n];
        System.out.print("Enter the Array2 Elements: ");
        for(int i = 0 ; i<n ; i++)
            arr2[i] = sc.nextInt();

        // sort arr1 in ascending order
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr1[i] > arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        // sort arr2 in descending order
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr2[i] < arr2[j])
                {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }

        int product = 0;
        for(int i = 0; i < n; i++)
            product += arr1[i] * arr2[i];

        System.out.print("Minimum Scalar Product is: "+product);
    }
}