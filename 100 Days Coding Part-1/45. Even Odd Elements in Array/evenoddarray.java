//                                          Day 45 Coding Statement 

// Write a Java Program to find number of even and odd elements in an array

// Description
//  Get an array as input from the user and then count the number of even and odd elements present in the array.

// Input
//  Enter size of array: 4
//  Enter the elements : 1 3 4 5
// Output
//  Number of even elements : 1
//  Number of odd elements : 3

import java.util.Scanner;
class evenoddarray{
 public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.print("Enter the Array Elements: ");
    for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

    int e = 0, o = 0;  // e = even & o = odd
    for(int i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 0)
            e += 1;
        else
            o += 1;
    }
    System.out.println("Number of even Elements: "+e);
    System.out.println("Number of Odd Elements: "+o);
    }
}