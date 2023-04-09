//                                          Day 40 coding Statement

// Write a Java Program to check if two strings are Anagram or not

// Description
//  Get two strings as input from the user and check whether it is Anagram or not.

// Two strings are said to be anagram if we can form one string by arranging the characters of another string. 
// For example, Race and Care. Here, we can form Race by arranging the characters of Care.

// Input
//  Enter first string:  race 
//  Enter second string: care
// Output
//  race and care are Anagram

import java.util.Arrays;
import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take two strings as input from user
        System.out.print("Enter first string:  ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if length is same
        if(str1.length() == str2.length()){
            // convert strings to char Arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();       

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same then the string is Anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result)
                System.out.println(str1 + " and " + str2 + " are Anagram" );
            else
                System.out.println(str1 + " and "+str2+" are not Anagram");
        }
        else
            System.out.println(str1+" and "+str2+" are not Anagram");
    }
}
























