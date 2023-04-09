//                              Day 3 Coding Statement 

// Write a Java program to identify if the character is an alphabet or not.

// Description: 
//     Take an input character from user and check whether it is an alphabet or not.

// • Input : A
// → Output:  Alphabet

// • Input: 7 / @ # 
// → Output: Not an alphabet

// Method_1 (using if else condition)

// import java.util.*;
// public class Alphabet {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any Character: ");
//         char ch = sc.next().charAt(0);

//         if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
//             System.out.println("The Entered Character "+ch+" is an Alphabet.");
        
//         else
//             System.out.println("The entered character "+ch+" is not an Alphabet.");
//     }
// }

// Method_2 (Here we will use "Character.isAlphabetic()" function)

import java.util.*;
public class Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch = sc.next().charAt(0);

        if(Character.isAlphabetic(ch))
            System.out.println(ch + " is an Aplhabet.");

        else
            System.out.println(ch+" is not an Alphabet.");
    }
}