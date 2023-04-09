#                                          Day 31 coding Statement 

# Write a Python Program to print Length of the string without using strlen() function

# Description
#  Get a string as input from user and print the length of the string without using strlen() function.

# Input
#  Enter a string: Hello World
# Output
#  Length of the string = 11

# Input
#  Enter a string: Simplified Learner
# Output
#  Length of the string = 18

str1 = input("Enter a string: ")
count = 0
for s in str1:
    count = count + 1
print("Length of the string = ", count)
    