//                                 Day 21 coding Statement 

//  Write a Java program to identify if the number is Prime number or not

// Prime number in Java: 
//  Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//  In other words, prime numbers can't be divided by other numbers than itself or 1. 
//  For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. 

//  Note: 0 and 1 are not prime numbers. 
//        The 2 is the only even prime number because all the other even numbers can be divided by 2.

// Description
//  Get a number as input from the user and check whether that number is prime or not.

// Input
//  Enter a number: 1
// Output
//  1 is not a prime number

// Input
//  Enter a number: 5
// Output
//  5 is a prime number 

// Code 1 → Write a Java program to identify if the number is Prime number or not

// import java.util.Scanner;
// public class primeno{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();                                        // num = 10
//         int count = 0;
//         if(num <= 1)
//             System.out.print(num+" is not a Prime Number");
//         else{
//             for(int i = 2; i <= num; i++){                             // i <= 10 → i = 2,3,4,5,6,7,8,9,10
//                 if(num % i == 0){                                      // 10 % 10 == 0 true → count = 3
//                     count++;
//                 }
//             }
//             if(count >= 2)
//                 System.out.print(num+" is not a Prime Number");
//             else    
//                 System.out.print(num+" is a Prime Number");
//         } 
//     }
// }



// Code 2 → Java program to find the prime numbers between a given interval

import java.util.Scanner;
public class primeno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int lower, upper, i,j,flag;

        System.out.print("Enter lower bond of the interval: ");
        lower = sc.nextInt();

        System.out.print("Enter upper bond of the interval: ");
        upper = sc.nextInt();

        System.out.print("The Prime Numbers between "+lower+" and "+upper+" are: ");

        for(i = lower; i <= upper; i++){
            // Skip 0 and 1 they are neither prime nor composite
            if(i == 1 || i == 0 )
                continue;
            flag = 1;   // flag variable to tell if i is prime or not
            
            for(j = 2; j <= i / 2; ++j){
                if( i % j == 0){
                    flag = 0;
                    break;
                }
            }
            // flag = 1 means i is prime and flag = 0 means i is not prime
            if(flag == 1)
                System.out.print(i+" ");
        }
    }
}