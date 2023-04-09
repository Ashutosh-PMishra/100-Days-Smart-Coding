#                                Day 24 coding Statement 

# Write a Python program to Replace all 0’s with 1 in a given integer

# Description
#  Get a number as input from the user and find the zeros present in that number.
#  Then convert the zeros into one and then print it.

# Appraoch → 
# • We will convert the integer into string.
# • Then we will convert it into list and then we will traverse through the list.
# • Wherever we find a ‘0’ we will replace with ‘1’.

# Input
#  Enter a number: 850020
# Output
#  New number is: 851121

# Python program to replace all 0's with 1 in a given integer  :→

# num = int(input("Enter number: "))
# num2 = 0

# if num == 0:
#     num2 = 1
    
# while num > 0:           
#     rem = num % 10        
#     if rem == 0:
#         rem = 1           
#     num = num // 10       
#     num2 = num2 * 10 + rem   
    
# num = 0
# while num2 > 0:
#     r = num2 % 10
#     num = num * 10 + r
#     num2 = num2 // 10

# print("Converted Number is: ",num)
    
    
    
# Method 2 → Easiest one

num = int(input("Enter number: "))
# change type to string
num = str(num)
Replaced = num.replace('0','1')
print("Converted Number is: ", Replaced)