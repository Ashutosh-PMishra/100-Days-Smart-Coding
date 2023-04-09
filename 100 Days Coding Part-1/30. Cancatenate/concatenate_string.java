//                              Day 30 coding Statement

// Write a Java Program to concatenate a string.

// Description
//  Get two strings as input from the user and then concatenate it.

// Input
//  Enter first string:  Hello
//  Enter second string: Hi
// Output
//  Concatenated string: HelloHi

import java.util.*;
public class concatenate_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        // System.out.println("Concatenated string: "+(str1+str2));

        String str3 = str1.concat(str2);
        System.out.println("Concatenated string: "+str3);
    }
}





































