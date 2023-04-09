#                                  Day 13 Coding Statement

# Write a Python program to find Sum of N natural numbers

# Description
#  Get the input from the user for the value of n and then find the sum of first n natural numbers.
#  e.g. let the n value = 5
#  then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum
#  Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15

# Input
#      6 (1+2+3+4+5+6)
# Output
#     21

# Method 1

# n = int(input("Enter a number : "))
# sum = 0
# for i in range(1, n+1):                                      
#     sum = sum + i
# print("The sum of first ",n," natural number is : ",sum)

# n = 4
# for i in range(1,5) → i = 1,2,3,4
# sum = sum + i
# sum = 0 + 1 = 1    for i = 1
# sum = 1 + 2 = 3    for i = 2
# sum = 3 + 3 = 6    for i = 3
# sum = 6 + 4 = 10   for i = 4

# Method 2

def Sum(n):
    if n != 0:
        return n + Sum(n - 1)             
    else:
        return 0

n = int(input("Enter a number : "))
value = Sum(n)
print("The sum of first ",n," natural number is : ",value)
