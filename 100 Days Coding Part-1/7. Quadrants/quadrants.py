#                                  Day 7 coding Statement

# Write a Python program to find the Quadrants in which coordinates lie

# Description → 
#  Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

# If both numbers are positive then, it displays the first quadrant.
# Example: Input = 5, 4
# Output = 1st quadrant

# If the first number is negative and the second number is positive then, it displays the second quadrant.
# Example: Input = -5, 4
# Output= 2nd quadrant

# If the first number is negative and the second number is also negative then, it displays the third quadrant.
# Example: Input = -5,-4
# Output= 3rd quadrant

# If the first number is positive and the second number is negative then, it displays the fourth quadrant.
# Example: Input = 5,-4
# Output = 4th quadrant


# Input
# 10 20
# Output
# This point lies in first quadrant.

# Input
# -10 20
# Output
# This point lies in second quadrant.

x = int(input("Enter the value of x: "))
y = int(input("Enter the value of y: "))

if x > 0 and y > 0:          # 5, 4
    print("points (",x,",",y, ") lies in the First Quadrant.")
    
elif x < 0 and y > 0:        # -5, 4
    print("points (",x,",",y, ") lies in the Second Quadrant.")
    
elif x < 0 and y < 0:       # -5, -4
    print("points (",x,",",y, ") lies in the Third Quadrant.")

elif x > 0 and y < 0:       # 5, -4
    print("points (",x,",",y, ") lies in the Fourth Quadrant.")
    
elif x == 0 and y == 0:
    print("points (",x,",",y, ") lies at the Origin.")
    
elif y == 0 and x != 0:   # on x-axis
    print("points (",x,",",y, ") lies on x-axis")
    
elif x == 0 and y != 0:    # on y-axis
    print("points (",x,",",y, ") lies on at y-axis")
    