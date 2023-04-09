#                                           Day 22 coding Statement 

#  Write a Python program to identify if the number is Palindrome or not

# A palindrome number is a number that is same after reverse. 
# For example 121, 15451, 1111, 24542 are the palindrome numbers. 
# It can also be a string like REFER, LOL, MADAM, MALAYALAM etc.

# Description
#  Get a number as input from the user and check whether that number is a Palindrome or not.

# Input
#  Enter any number: 121
# Output
#  The Entered number 121 is a Palindrome Number

# Input
#  Enter any number: 34
# Output
#  The Entered number 34 is not a Palindrome

# CODE →  TO CHECK WHETHER A NUMBER IS PALINDROME OR NOT TAKING INPUTS FROM USER

#  Using while loop (for integers)

n = int(input("Enter a number: "))
temp = n
rev = 0
while(n > 0):
    a = n % 10
    rev = rev * 10 + a
    n = n // 10
if(temp == rev):
    print("The Entered number ",temp," is a Palindrome")
else:
    print("The Entered number ",temp," is not a Palindrome")
    

    
    