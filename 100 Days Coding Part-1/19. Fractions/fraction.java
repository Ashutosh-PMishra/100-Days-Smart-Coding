//                                      Day 19 coding Statement 

// Write a Java program to Add two fractions

// Description
//  Get the values for numerator and denominator of two fractions, 
//   then add that fractions. Consider the following format

// x3/y3 = (x1/y1) + (x2/y2)
// here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

// • Input
//      Enter value for x1: 1
//      Enter value for y1: 3
//      Enter value for x2: 3
//      Enter value for y2: 9
// • Output
//    Sum of fractions is: 2/3   → (1 / 3) + (3 / 9) = (6 / 9) = (2 / 3)

import java.util.Scanner;
public class fraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x1 : ");
        int x1 = sc.nextInt(); 
        System.out.print("Enter value of y1 : ");
        int y1 = sc.nextInt(); 
        System.out.print("Enter value of x2 : ");
        int x2 = sc.nextInt(); 
        System.out.print("Enter value of y2 : ");
        int y2 = sc.nextInt(); 
        
        int Div;
        int x3 = (x1*y2) + (x2*y1);
        int y3 = y1*y2;
        if(x3 > y3)
            Div = y3;
        else
            Div = x3;
        for(int i = Div; i > 0; i--){
            if(x3 % i == 0 && y3 % i == 0){
                x3 = x3 / i;
                y3 = y3 / i;
            }
        }
        System.out.print("Sum of fractions is : "+x3+"/"+y3);
    }
}