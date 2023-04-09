#                              Day 36 Coding Statement 

# Write a Python Program to Count the sum of numbers in a string

# Description
#  Get a string from the user and find the sum of numbers in the string.

# Input
#  Enter a string: Simplified22 Learner2023
# Output
#  Sum is: 11  (2+2+2+0+2+3)

# Method 1 :

# Str = input("Enter a string: ")
# sum1 = 0
# for i in Str:
#     # Check if the values lies between range of number or not according to ASCII table (0,1,2....9)
#     if ord(i) >= 48 and ord(i) <= 57:
#         sum1 = sum1 + int(i)
# print("Sum is: ", str(sum1))
    

# Method → 2 
   
Str = input("Enter a string: ")
sum = 0
for i in Str:
    if i.isdigit():
        sum = sum + int(i)
print("Sum is: ", sum)