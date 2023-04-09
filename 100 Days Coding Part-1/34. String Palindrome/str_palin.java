//                                       Day 34 coding Statement

// Write a Java Program to check if String is a palindrome or not

// Description
//  Get an input string from the user and then check whether it is a palindrome string or not.

// A palindrome is a string that reads exactly the same, whether it is read from left to right or right to left.

// Input
//  Enter a string: youtube
// Output
//  youtube is Not a palindrome

// Input
//  Enter a string: madam
// Output
//  madam is Palindrome

import java.util.Scanner;
public class str_palin {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int length = str.length();

        for(int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if(str.equals(rev))
            System.out.println(str+" is a Palindrome");
        else
            System.out.println(str+" is not a Plaindrome");
    }
}