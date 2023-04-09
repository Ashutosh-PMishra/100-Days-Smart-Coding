//                                              Day 12 coding Statement: 

// Write a Java program to find Fibonacci series up to n

// Description
//   Fibonacci series is a special series where nth term is the sum of previous two terms in the series. 
//   The series starts with 0 and 1 as the first and second term of the series respectively.
//   Here we need to get the value for nth term from user and then print Fibonacci series containing n terms.

// Input
//   4
// Output
//   0,1,1,2

// Input
//   8
// Output
//   0,1,1,2,3,5,8,13

import java.util.*;
public class fibo {
    public static void main(String args[]){
        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();                                                  // n = 4
        System.out.print("The Fibonacci Series till "+n+" is : ");
        for(int i = 1; i <= n; i++){                                        // for(i = 1, i <= 4; i++)
            a = b;                                                          // a = 0        for i = 1                       
            b = c;                                                          // b = 0
            c = a + b;                                                      // c = 0+1= 1        
            System.out.print(a + " ");
        }
    }
}



