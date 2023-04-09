//                                          Day 42 Coding Statement 

// Check if two strings match where one string contains wildcard characters

// Description
//  Get two strings as input from the user, first with wildcard characters (* and ?) and 
//  second without wildcard characters. Then check whether they match or not.

// Input
//  Enter string containing wild characater : Simp*ifi?d Learner
//  Enter string to be matched : Simplified Learner
// Output
//  Yes it matches

// Algorithm
// Take two input string wild and str.
// Check both strings character by character.
// If a character of wild string contains a ‘*’ , take the next character from wild string and 
//  check for that character in string which you want to match.
// If they match, continue checking the next character. Else, return false.
// If the character of wild string contains a ‘?’, check if the immediate next character of wild string and
//   the next character of string to be matched.
// If they match, continue checking  the next characters. Else, return false.
// Print the result

import java.util.*;
public class wildcard_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String containing wild Charcater: ");
        String wild = sc.nextLine();
        System.out.print("Enter String to be matched: ");
        String str = sc.nextLine();

        boolean flagA = true, flagB = false;
        int m = wild.length(), n = str.length();
        boolean check[][] = new boolean[m + 1][n + 1]; 
        check[0][0] = true;

        for(int i = 1; i <= n; i++)
            check[0][i] = false;
        for(int i = 1; i <= m; i++){
            if(wild.charAt(i - 1) == '*')
                check[i][0] = check[i - 1][0];
            else
                check[i][0] = false;
        }        

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(wild.charAt(i - 1) == str.charAt(j - 1))
                    check[i][j] = check[i - 1][j - 1];
                else if(wild.charAt(i - 1) == '?')
                    check[i][j] =  check[i - 1][j - 1];
                else if(wild.charAt(i - 1) == '*')
                    check[i][j] = check[i - 1][j] || check[i][j - 1];
                else 
                    check[i][j] = false;
            }
        }

        if(check[m][n])
            System.out.println("Yes it matches");
        else
            System.out.println("No it is not matching");
    }
}