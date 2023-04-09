//                                          Day 29 coding Statement 

// Write a Java Program to reverse a string.

// Description
//     Get an input string from user and print it in reverse order.

// Input
//     Enter a string: Hello
// Output
//     Reversed string: olleH

// Input
//     Enter a string: Simplified Learner
// Output
//     Reversed string: renraeL deifilpmiS

import java.util.Scanner;
public class reverse_string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = "";
        for(int i = str1.length() - 1; i >= 0; i--)   // Hello (i=4; i >= 0; i--), i = 4,3,2,1,0
            str2 = str2 + str1.charAt(i);             // olleH
        System.out.println("Reversed string: "+str2);
    }
}








































