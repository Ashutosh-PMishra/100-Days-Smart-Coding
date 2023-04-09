//                                   Day 25 coding Statement 

// Write a Java  program to find Area of a circle

// Description
//  Get the value for radius from the user and calculate the area of the circle for the given radius.
//  Area of circle = pi * radius * radius = 3.14 * radius * radius

// Input
//  Enter radius of circle: 3
// Output
//  Area of circle: 28.26

import java.util.Scanner;
public class areaofcircle
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.print("Area of Circle is: "+area);
    }
}

















