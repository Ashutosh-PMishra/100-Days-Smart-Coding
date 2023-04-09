#                                       Day 34 coding Statement

# Write a Python Program to check if String is a palindrome or not

# Description
#  Get an input string from the user and then check whether it is a palindrome string or not.

# A palindrome is a string that reads exactly the same, whether it is read from left to right or right to left.

# Input
#  Enter a string: youtube
# Output
#  youtube is Not a palindrome

# Input
#  Enter a string: madam
# Output
#  madam is Palindrome

# Method :→ 1

# str = input("Enter a string: ").upper()
# # str = str.casefold()

# rev = reversed(str)  # reverse the String

# if list(str) == list(rev):
#    print(str," is a Palindrome")
# else:
#    print(str," is not a Palindrome")


# Method :→ 2

str = input("Enter a string: ")
str = str.casefold()
if str == str[::-1]:
   print(str," is a Palindrome")
else:
   print(str," is not a Palindrome")

       

