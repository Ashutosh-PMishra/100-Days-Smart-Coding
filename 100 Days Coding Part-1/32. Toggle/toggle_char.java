//                                          Day 32 coding Statement 

// Write a Java Program to Toggle each character in a string

// Description
//  Get an input string from user and then convert the lower case of alphabets to upper case and 
//  all upper-case alphabets into lower case.

// Input
//  Enter a String : Hello
// Output
//  Toggle String : hELLO

import java.util.Scanner;
public class toggle_char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a String : ");
        String str = sc.nextLine();                                           // Hello
        String str1 = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))                       
                str1 = str1 + Character.toLowerCase(str.charAt(i));        // hELLO
            else
                str1 = str1 + Character.toUpperCase(str.charAt(i));
        }
        System.out.println("Toggle String : "+str1);
    }
}