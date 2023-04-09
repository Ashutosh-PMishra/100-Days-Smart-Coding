//                                           Day 43 Coding Statement 

// Write Java Program to check if two Arrays are the same or not

// Description
//  Get two arrays as the input from the user and check whether it is the same or not.
 
// The two arrays are the same when their length is equal. so, we need to calculate the length of both array and 
// then check the length is same or not.

// Two arrays are said to be equal if both of them contain the same set of elements, 
// here we sort the array because it makes a comparison essay.

// Step 1. Initialize two arrays.
// Step 2. Declare the scanner class for taking input.
// Step 3. take array size for both arrays from the user.
// Step 4. Take an element of both array from the user.
// Step 5. Check that equal function return true or false
// Step 6. If true then both arrays are same otherwise arrays ara not same

// equal(int a1[], int a2[])
// Step 1. Find the length of both array
// Step 2. If the length of both arrays is not equal then return false.
// Step 3. Sort both arrays.
// Step 4. Initialise the for loop from 0 to length for check the element is same or not.
// Step 5. If any element of the array is not equal to another array so return false.
// Step 6. Return true.

// Input
//  Enter size of array1    : 4                                                                                                             
//  Enter element of array1 : 2 4 13 1                                                       
//  Enter size of array2    : 4                                                                                                                            
//  Enter element of array2 : 4 2 1 13       
// Output                                                                                                                                                                                                                         
//   Both Arrays are same 

import java.util.*;
import java.util.Scanner;
public class ArraySame
{
    public static boolean equal(int a1[], int a2[])
    {
        int n = a1.length;
        int m = a2.length;
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(n != m)
            return false;
        for(int i = 0; i < n; i++)
        {
            if(a1[i] != a2[i])
                return false;   
        }
        return true;
    }
      
    public static void main(String[] arg)
    {  
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[50];
        int[] a2 = new int[50];
        System.out.print("Enter size of Array1: ");
        int size1 = sc.nextInt();
        System.out.print("Enter Elements of Array1: ");
        for(int i = 0; i < size1; i++)
            a1[i] = sc.nextInt();

        System.out.print("Enter size of Array2: ");
        int size2 = sc.nextInt();
        System.out.print("Enter Elements of Array2: ");
        for(int i = 0; i < size2; i++)
            a2[i] = sc.nextInt();
        
        if(equal(a1, a2))
            System.out.println("Both Arrays are Same");
        else
            System.out.println("Both Arrays are not Same");
    }
}