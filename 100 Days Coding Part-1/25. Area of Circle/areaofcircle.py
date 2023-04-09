#                          Day 25 coding Statement 

# Write a Python program to find Area of a circle

# Description
#  Get the value for radius from the user and calculate the area of the circle for the given radius.
#  Area of circle = pi * radius * radius = 3.14 * radius * radius

# Input
#  Enter radius of circle: 5
# Output
#  Area of circle: 78.5

# Method 1

# radius = float(input("Enter radius of circle: "))
# area = 3.14 * radius * radius
# print("Area of circle: ",area)


# Method 2

from math import pi
radius = float(input("Enter radius of circle: "))
area = pi * radius * radius
print("Area of circle: ",area)