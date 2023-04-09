//                                 Day 23 coding Statement

// Write a Java program to express a number as a sum of two prime numbers

// In this program, we'll learn to check whether a given number can be expressed as a sum of two prime numbers or not.

// First lets see What is Prime Number ?
// A prime number is a number that is greater than 1 and can be divided by 1 and itself without leaving a remainder.
// The numbers 0 and 1 are not prime numbers.
// The only even prime number is 2. All other even numbers are divisible by 2

// Description
//  Get a number as input from the user and express that number as sum of two prime numbers.

// Input   
//  Enter a Number: 4
// Output
//  4 can be expressed as sum of 2 and 2

// Input   
// Enter a number : 10
// Output
// 10 can be expressed as the sum of 3 and 7
// 10 can be expressed as the sum of 5 and 5

import java.util.*;
public class sumofprime{
    static int sumprimes(int n){
        int i, isPrime = 1;
        for(i = 2; i <= n/2; ++i){
            if(n % i == 0){
                isPrime = 0;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 2; i <= num/2; ++i){
            if(sumprimes(i) == 1){
                if(sumprimes(num - i) == 1){
                    System.out.print(num+" can be expressed as the sum of "+i+" and "+(num - i));
                    flag = 1;
                }
            }
        }
        if(flag == 0)
            System.out.print(num+" cannot be expressed as the sum of two Primes");
    }
}

