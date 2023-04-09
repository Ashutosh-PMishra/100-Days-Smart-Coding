//                                          Day 33 coding Statement 

//  Write a Java Program to Remove vowels from a string

// Description
//  Get a string as the input from the user and then remove all the vowel letters from the string 
//  and give the output.

//  Vowels :→ a,e i,o,u,A,E,I,O,U

// Input
//  Enter a string: Simplified Learner
// Output
//  String after removing vowel :  Smplfd Lrnr

import java.util.Scanner;
public class remove_vowels {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String s1 = "";
    s1 = str.replaceAll("[aeiouAEIOU]", "");
    System.out.println("String after removing vowel : "+s1);
    }
}
