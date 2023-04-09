#                                      Day 19 coding Statement 

# Write a Python program to Add two fractions

# Description
#  Get the values for numerator and denominator of two fractions, 
#   then add that fractions. Consider the following format

# x3/y3 = (x1/y1) + (x2/y2)
# here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

# • Input
#      Enter value for x1: 2
#      Enter value for y1: 3
#      Enter value for x2: 4
#      Enter value for y2: 3
# • Output
#    Sum of fractions is: 2/3   → (2 / 3) + (4 / 3) = (2 / 1)

x1 = int(input("Enter value for x1 : "))
y1 = int(input("Enter value for y1 : "))
x2 = int(input("Enter value for x2 : "))
y2 = int(input("Enter value for y2 : "))

x3 = (x1*y2) + (x2*y1)
y3 = y1 * y2
div = 0
if(x3 > y3):
    div = y3
else:
    div = x3
for i in range(div,0,-1):
    if(x3 % i == 0 and y3 % i == 0):
        x3 = x3 // i
        y3 = y3 // i
print("Sum of fractions is: ",x3,"/",y3)