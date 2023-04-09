//                                            Day 41 Coding Statement 

// Write a Java Program to Replace substring in a string

// Description
//  Get a string as input from the user and then get another string which has to be removed from the string.
//  Get the third input, the new substring which is placed in that substring position.
//  Finally print the output by replacing the substring with new string.

// Input
//  Enter a string: YouTubeLearner
//  Enter substring which has to be replaced : YouTube
//  Enter substring with which string has to be replaced : Simplified
// Output : 
//  String after replacement: Simplified Learner

import java.util.Scanner;
public class replace_substring
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter substring which has to be replaced : ");
        String oldstr = sc.nextLine();

        System.out.print("Enter substring with which string has to be replaced : ");
        String newstr = sc.nextLine();

        String repstr = str.replace(oldstr, newstr);
        System.out.print("String after replacement : "+repstr);
    }
}

