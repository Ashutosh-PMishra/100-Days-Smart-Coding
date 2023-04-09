//                                          Day 31 coding Statement 

// Write a Java Program to print Length of the string without using strlen() function

// Description
//  Get a string as input from user and print the length of the string without using strlen() function.

// Input
//  Enter a string: Hello World
// Output
//  Length of the string = 11

// Input
//  Enter a string: Simplified Learner
// Output
//  Length of the string = 18

import java.util.Scanner;
public class lenofString
{
    public static void main(String[] args) 
    {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        // char ch[] = str1.toCharArray();
        for( char c : str1.toCharArray())
        {
            i++;
        }
        System.out.println("Length of the string = "+i);
    }
}




























