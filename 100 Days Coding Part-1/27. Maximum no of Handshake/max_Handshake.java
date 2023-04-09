//                                    Day 27 coding Statement 

// Write a Java program to calculate Maximum number of handshakes

// Description
//   Get the number of people in the room as input from the user. 
//   Then calculate the maximum number of handshakes possible among that people.

// For example →  
//  If there are N people in the room then the first person has to shake hand with N-1 people and
//  second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
// So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0 → (N * (N-1) / 2)

// Input : N = 2
// Output : 1
// There are only 2 persons in the room. 1 handshake take place.

// Input
//  Enter the number of people in the room: 10
// Output
//  Total number of handshakes = 45  → N * (N-1) / 2 → 10*(10-1)/2 = 10*9/2 = 90/2 = 45

import java.util.Scanner;
public class max_Handshake 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people in the room: ");
        int num = sc.nextInt();
        int total = num * (num - 1) / 2;
        System.out.println("Total number of handshakes = "+total);
    }
}