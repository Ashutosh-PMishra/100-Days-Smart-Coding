//                              Day 26 coding Statement 

// Write a Java program to print Pyramid pattern using stars

// Description
//  Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

// Input
//  Enter the number of rows: 10
// Output
//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
//  *****************
// *******************

import java.util.Scanner;
public class starpattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();                   // rows = 3
        for(int i = 1; i <= rows; i++)             // i <= 3, i=1,2,3
        {
            for(int j = i; j < rows; j++)         // j = 3, j<3; j = 1,2
                System.err.print(" ");          
            for(int k = 1; k <= (2*i-1); k++)      // k=3, k <= (2*3-1)= 5
                System.out.print("*");            //  * 
                System.out.println(" ");          // ***
        }                                           // *****
    }
}