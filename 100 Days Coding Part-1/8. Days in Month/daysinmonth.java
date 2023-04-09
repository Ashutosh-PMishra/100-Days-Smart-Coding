//                                 Day 8 Coding Statement

// Write a Java program to find Number of days in a given month of a given year

// Description
//     Get the number of month and year as input from the user and check the number of days present in that month.

// Input
// Enter month : 2
// Enter year : 2004
// Output
// 29

// Approach :-
//  1) Check if the given month is February.                                               
//  2) If True Check if the year is a year leap or not.
//  3) If year is a leap year Print 29 Days, Else Print 28 Days.
//  4) If Condition in Step 3 is False Check the month. 
//  5) Print the number of days assigned to specific Month.

import java.util.*;
public class daysinmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        if(((month == 2) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0)))
            System.out.println("Number of days is 29");

        else if(month == 2)
            System.out.println("Number of days is 28");

        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("Number of Days is 31");

        else 
            System.out.println("Number os days is 30");
    }
}

// 1. January - 31 days
// 2. February - 28 days in a common year and 29 days in leap years
// 3. March - 31 days
// 4. April - 30 days
// 5. May - 31 days
// 6. June - 30 days
// 7. July - 31 days
// 8. August - 31 days
// 9. September - 30 days
// 10. October - 31 days
// 11. November - 30 days
// 12. December - 31 days

































