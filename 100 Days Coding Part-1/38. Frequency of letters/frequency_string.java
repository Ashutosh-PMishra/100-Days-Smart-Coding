//                                                Day 38 coding Statement 

// Write a Java Program to calculate the Frequency of characters in a string

// Description
//  Get a string as the input from the user and find the frequency of characters in the string.

// Input
//  Enter a string: Simplified
// Output
//  The frequency of s is 1
//  The frequency of i is 3
//  The frequency of m is 1
//  The frequency of p is 1
//  The frequency of l is 1
//  The frequency of f is 1
//  The frequency of e is 1
//  The frequency of d is 1  

// Algorithm
// • Take string input from user and store it in the variable called str.
// • After that make frequency array having size of length of string.
// • Convert string to char array .
// • Run for loop start from i=0 to str<length() store 1 to frequency array.
// • Run j loop start from j=i+1 to j<str.length().
// • check condition if(strnew[i] == strnew[j]) then do freqency[i]++  and set strnew[j]=’0′ .
// • After that display frequency of character one by one.


import java.util.Scanner;
public class frequency_string{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freqency = new int[str.length()];
        int i,j;

        // Convert given string into character array
        char strnew[] = str.toCharArray();
        for(i = 0; i < str.length(); i++){
            freqency[i] = 1;
            for(j = i+1; j < str.length(); j++){
                if(strnew[i] == strnew[j]){
                    freqency[i]++;
                    // Set strnew[j] to 0 to avoid printing visited character
                    strnew[j] = '0';
                }
            }
        }
        // Display the each character and their frequency
        System.out.println("Frequencies of Characters: ");
        for(i = 0; i < freqency.length; i++){
            if(strnew[i] != ' ' && strnew[i] != '0')
            System.out.println(strnew[i] + " - " + freqency[i]);
        }
    }
}