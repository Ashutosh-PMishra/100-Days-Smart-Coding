#                                   Day 9 Coding Statement

# Write a Python program to find roots of a quadratic equation

# Description :→
#      Get the values of a, b and c (coefficients of quadratic equation) as input from the user and
#      calculate the roots and print as the output.

# The standard form of a quadratic equation is:
#               ax² + bx + c = 0, where
#               a, b and c are real numbers and   a != 0
                       
# The term b² - 4ac is known as the discriminant of a quadratic equation. 
# It tells the nature of the roots.

# • If the discriminant is greater than 0, the roots are real and different.
# • If the discriminant is equal to 0, the roots are real and equal.
# • If the discriminant is less than 0, the roots are complex and different.

# Input
#  Enter the value of a, b and c : 1 -6 9
# Output
#  Roots are equal
#  Root1  = Root2 = 3.00

import math
a = float(input("Enter value of a: "))
b = float(input("Enter value of b: "))
c = float(input("Enter value of c: "))

if a == 0:
    print("Invalid Input! a cannot be zero")
    
else:
    d = b**2 - 4*a*c   # Calculate discriminant : b² - 4ac
    root = math.sqrt(abs(d))
    
    if d > 0:
        print("Roots are Real and Different.")
        print("Root1 : ",(-b + root)/2*a)
        print("Root2 : ",(-b - root)/2*a)
        
    elif d == 0:
        print("Roots are equal")
        print("Root1 = Root2 =  ", (-b / (2*a)))
    
    else:
        print("No Real Roots")
        print("Root1 = ",-b / (2*a),'+',root,'i')
        print("Root2 = ",-b / (2*a),'-',root,'i')

        
        
        
