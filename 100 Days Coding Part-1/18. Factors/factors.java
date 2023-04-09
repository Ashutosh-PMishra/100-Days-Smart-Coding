//                               Day 18 coding Statement 

// Write a Java program to find the Factors of a number

// Description
//  Get an input from the user and find the factors of the number.

// • Input
//  Enter a number: 100
// • Output
//  The factors of 100 are: 1 2 4 5 10 20 25 50 100 

import java.util.Scanner;
public class factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();                

        System.out.print("The Factors of "+num+" are: ");
        for(int i = 1; i <= num; i++){         
            if(num % i == 0)                    
                System.out.print(i+" ");
        }
    }
}

// num = 4
// for(int i = 1; i <= 4; i++) i = 1,2,3,4
// if(num % i == 0) → 4 % 1 == 0 TRUE  print 1, → for i = 1 
// if(num % i == 0) → 4 % 2 == 0 TRUE  print 2, → for i = 2 
// if(num % i == 0) → 4 % 3 == 0 FALSE (print nothing) , → for i = 3 
// if(num % i == 0) → 4 % 4 == 0 TRUE  print 4, → for i = 4 

// therefore → 1,2,4 are factors of 4