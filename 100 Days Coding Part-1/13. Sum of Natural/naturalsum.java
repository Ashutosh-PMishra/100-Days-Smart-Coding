//                                  Day 13 Coding Statement

// Write a Java program to find Sum of N natural numbers

// Description
//  Get the input from the user for the value of n and then find the sum of first n natural numbers.
//  e.g. let the n value = 5
//  then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
//  Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15

// Input
//      6 (1+2+3+4+5+6)
// Output
//     21

import java.util.*;
public class naturalsum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();                               
        int sum = 0;                                                             

        for(int i = 0; i <= n; i++)                      
            sum = sum + i;                               
        System.out.println("The sum of first "+n+" natural number is : "+sum);    
    }                                                    
}

// n = 4
// sum = 0    
// (i <= 6) => i = 1,2,3,4
// sum = sum + i; 
// sum = 0 + 1 = 1   for i = 1
// sum = 1 + 2 = 3   for i = 2
// sum = 3 + 3 = 6   for i = 3        
// sum = 6 + 4 = 10  for i = 4
// print(sum) which is 10.


























