//                                      Day 35 coding Statement 

// Write a Java Program to Remove brackets from an algebraic expression

// Description
//   Get an algebraic expression as input from the user and then remove all the brackets in that.

// Input
//  Enter algebraic expression: 7x+(2*y)
// Output
//  Expression without brackets : 7x+2*y

import java.util.Scanner;
public class remove_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter algebraic expression: ");
        String str = sc.nextLine();
        String newstr = str.replaceAll("[(){}]", "");
        System.out.println("Expression without brackets : "+newstr);
    }
}