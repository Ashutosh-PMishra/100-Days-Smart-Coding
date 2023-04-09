//                                                Day 48 Coding Statement 

// Write a Java Program to find longest palindrome in an Array

// Description
// Get an Array as the input from the user and find the longest palindrome in that Array.

// Algorithm
// Step 1. Initialize arrays.
// Step 2. Declare the scanner class for taking input.
// Step 3. take array size from the user.
// Step 4. Take an element of the array from the user.
// Step 5. store the return value of function largest in a larger variable.

//      largest(int a[], int size)
// Step 1. Initialise temp variable.
// Step 2. Initialise the two-loop for sorting.
// Step 3. perform sorting.
// Step 4. Initialise backward for loop for checking the large palindrome number.
// Step 5. Check the current index value is a palindrome or not to call the ispalindrome Function. 
//          and return the current element.
// Step 6. if there is not any palindrome number so return -1.

//      boolean isPalindrome(int n)
// Step 1. Copy the original number which is passed from the main function.
// Step 2. Initialise while loop to find the reverse of the number.
// Step 3. If the reverse of the number is equal to the original number then return true otherwise, return false. 


// Input
//  Enter the size of Array: 3
//  Enter the elements of Array : 121 10456 1000001
// Output: 
//  Longest palindrome number in the Array 1000001

// Input
//  Enter the size of Array: 4
//  Enter the elements of Array : 21 32 41 27
// Output: 
//  There is no palindrome in the Array


import java.util.Scanner;
public class long_palin
{
    public static boolean isPalindrome(int n)
    {
        int rem, num, rev = 0;
        num = n;
        // while loop for finding the reverse of the number
        while(n != 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10; 
        }
        // check is palindrome or not
        if(num == rev)
            return true;
        else
            return false;
    }

    public static int largest(int []arr, int n)
    {
        int i, j, temp;
        // Sorting of number in ascending order
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //check from the last index of array that number is palindrome or not
        //start from last because we want longest palindrome number that is the reason of the sorting
        for(i = n -1; i >= 0; --i)
        {
            if(isPalindrome(arr[i]))
                return arr[i];
        }
        return -1;
    }
public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of Array: ");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int larger = largest(arr, size);
        if(larger == -1)
            System.out.println(" There is no palindrome in the Array");
        else
            System.out.println("Longest palindrome number in the Array: "+larger);
    }   
}