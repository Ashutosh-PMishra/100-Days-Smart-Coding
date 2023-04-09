#               Day 5 Coding Statement

# Write a Python program to identify if the number is even or odd

# Description
#    → Get a number as input from the user and check whether the given number is odd or even

# •Input
#    12
# •Output
#    Even

# •Input
#   15
# •Output
#   Odd

n = int(input("Enter a Number: "))  #take input from user
if(n % 2 == 0):               # if remainder is zero then even
    print(n , " is Even." )
else:                         # if remainder is 1 then odd
    print(n," is Odd") 