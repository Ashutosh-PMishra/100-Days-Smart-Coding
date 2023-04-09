//                                         Day 44 Coding Statement 

// Write Java Program to find the Array type

// Description
// Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

// Input
//  Enter the size of the array: 3
//  Enter the array elements   : 1 3 5
// Output
//  Type of the Array is Odd


import java.util.*;
public class arraytype
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Array elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int o = 0, e = 0;   // o = odd , e = even
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 1)
                o++;
            else
                e++;
        }
        if( o == n)
            System.out.println("Type of the Array is Odd");
        else if(e == n)
            System.out.println("Type of the Array is Even");
        else
            System.out.println("Type of the Array is Mixed");
    }
}
