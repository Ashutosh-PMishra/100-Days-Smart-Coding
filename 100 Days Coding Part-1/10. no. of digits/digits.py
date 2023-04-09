#                                      Day 10 Coding Statement

# Write a Python program to find Number of digits in an integer

# Description :→
#  Take an integer as the input from the user and then calculate the number of digits 
#  in the given input and print it as the output.

# Input
#     32561
# Output
#     5

# Input
#     0003350
# Output
#     4

# Problem Solution :→
# 1. Take the value of the integer and store in a variable.
# 2. Using a while loop, get each digit of the number and increment the count each time a digit is obtained.
# 3. Print the number of digits in the given integer.
# 4. Exit.

# method 1
# n = int(input("Enter Number : "))
# count = 0;
# while(n > 0):
#     count = count + 1     # count += 1
#     n = n // 10           #n //= 10 
# print("The number of digits in the entered number are :", count)

# Method 2

n = int(input("Enter Number : "))
print("The number of digits in the entered number are :",len(str(n)))