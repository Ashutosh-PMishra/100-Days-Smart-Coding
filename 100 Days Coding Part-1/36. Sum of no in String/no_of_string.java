//                                    Day 36 Coding Statement 

// Write a Java Program to Count the sum of numbers in a string

// Description
//  Get a string from the user and find the sum of numbers in the string.

// Input
//  Enter a string: Simplified22 Learner2023
// Output
//  Sum is: 11  (2+2+2+0+2+3)

// Algorithm​
// • Take a string input from user and store it in the variable called str1.
// • Take a i for loop start from i=0 to i<str1.length().
// • Check the condition that character is digit or not.
// • Calculate sum of each digit and store it in the sum variable.
// • After that simply print the value of sum.


import java.util.Scanner;
public class no_of_string
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < str1.length(); i++)
        {
            if(Character.isDigit(str1.charAt(i)))
            sum = sum + Character.getNumericValue(str1.charAt(i));
        }
        System.out.println("Sum is: "+sum);
    }
}
