// Day 2 coding Statement: 

// Write a Java program to identify if the character is a vowel or consonant.
// Vowels :- aeiou AEIOU

// Description of the program: 
// Take an input character from the user and check whether the given input is a vowel or consonant.

// • Input
//   → A
// • Output
//   → Vowel

// • Input
//   → m
// • Output
//   → Consonant

// • Input
//   → 3 # @ - 90999
// • Output
//   → Invalid Input

import java.util.*;
public class vowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = sc.next().charAt(0);   //dont write this index word it is by default in vs code

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("The Entered Character "+ch+" is a Vowel.");
        }

        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("The Entered Character "+ch+" is a Consonant.");
        }

        else{
            System.out.println("Invalid Input! Please enter an Alphabet.");
        }
    }
}


















