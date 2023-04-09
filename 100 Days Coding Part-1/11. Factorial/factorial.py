#                                        Day 11 Coding Statement

# Write a Python program to find Factorial of a number

# What is factorial ?
#  Factorial is a non-negative integer. 
#  It is the product of all positive integers less than or equal to that number you ask for factorial. 
#  It is denoted by an exclamation sign (!).

# Example:
# n! = n* (n-1) * (n-2) *........1  
# 4! = 4x3x2x1 = 24  
# 3! = 3*2*1 = 6
  
# Description:→
#   Get a number from user for which you need to fin the factorial, 
#   then calculate the factorial and give it as the output.


n = int(input("Enter a Number: "))                  # n = 4
fact = 1
if n < 0:           # -6, -8, -987 etc 
    print("Factorial does not exit for negative numbers")
    
elif n == 0:
    print("The Factorial of 0 is 1")  #by default
    
else:
    for i in range(1, n + 1):              # range(1, 4+1) → range(1,5)    i = 1,2,3,4 
        fact = fact * i                     # fact = 24
    print("The factorial of ",n," is ",fact )        










































