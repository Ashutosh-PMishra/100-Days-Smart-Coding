#                                    Day 14 Coding Statement

#  Write a Python program to find Sum of digits of a number


# Description
# Get a number from user and then find the sum of the digits in the given number.
# E.g. let the number = 341
# Sum of digits is 3+4+1= 8

# Input
#     4521 
# Output
#    4+5+2+1 = 12

n = int(input("Enter a number : "))
Sum = 0
while n != 0:
    Sum = Sum + n % 10  # Find the remainder by using the modulo(%) operator. It gives the last digit of the number(n).
    n = n // 10        # Divide the number(n) by 10. It removes the last digit of the number.
print("The Sum of the given Digit is : ", Sum)


# let say n = 341 is input

# First iteration
# sum = 0 + 341 % 10 = 1
# n = 341 // 10 = 34

# Second iteration
# sum = 1 + 34 % 10 = 1+4= 5
# n =  34 // 10 = 3

# Third iteration
# sum = 5 + 3 % 10 = 5+3 = 8
# n = 3 // 10 = 0