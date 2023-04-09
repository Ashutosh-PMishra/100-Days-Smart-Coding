//                                           Day 22 coding Statement 

//  Write a Java program to identify if the number is Palindrome or not

// A palindrome number is a number that is same after reverse. 
// For example 121, 15451, 1111, 24542 are the palindrome numbers. 
// It can also be a string like REFER, LOL, MADAM, MALAYALAM etc.

// Description
//  Get a number as input from the user and check whether that number is a Palindrome or not.

// Input
//  Enter any number: 121
// Output
//  The Entered number 121 is a Palindrome Number

// Input
//  Enter any number: 34
// Output
//  The Entered number 34 is not a Palindrome

// CODE →  TO CHECK WHETHER A NUMBER IS PALINDROME OR NOT TAKING INPUTS FROM USER

import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();                       // n = 252
        int resv, sum = 0;
        int temp = n;                               // temp = n = 252

        while(n > 0){                               
            resv = n % 10;                          // 252 % 10 = 2,   25 % 10 = 5,     2 % 10 = 2
            sum = (sum * 10) + resv;                // (0*10) + 2 = 2, (2 * 10)+5 = 25, (25 * 10) + 2 = 252
            n = n / 10;                             // 252 / 10 = 25,  25/10 = 2,       2/10 = 0
        }
        
        if(temp == sum)
            System.out.print("The Entered number "+temp+" is a Palindrome");
        else    
            System.out.print("The Entered number "+temp+" is not a Palindrome");
    }
}