#                                 Day 23 coding Statement

# Write a Python program to express a number as a sum of two prime numbers

# In this program, we'll learn to check whether a given number can be expressed as a sum of two prime numbers or not.

# First lets see What is Prime Number ?
# A prime number is a number that is greater than 1 and can be divided by 1 and itself without leaving a remainder.
# The numbers 0 and 1 are not prime numbers.
# The only even prime number is 2. All other even numbers are divisible by 2

# Description
#  Get a number as input from the user and express that number as sum of two prime numbers.

# Input   
#   Enter the Number: 20
# Output
#   20 can be expressed as the sum of 3 and 17
#   20 can be expressed as the sum of 7 and 13

# Input   
#   Enter a number : 50
# Output
#   50 can be expressed as the sum of 3 and 47
#   50 can be expressed as the sum of 7 and 43
#   50 can be expressed as the sum of 13 and 37
#   50 can be expressed as the sum of 19 and 31

num = int(input("Enter a Number: "))
arr = []
# find the prime numbers
for i in range(2, num):
    flag = 0
    for j in range(2, i):
        if i % j == 0:
            flag = 1
    # append prime number to array
    if flag == 0:
        arr.append(i)
# possible combinations
flag = 0
for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        # if condition is True Print number
        if arr[i] + arr[j] == num:
            flag = 1
            print(str(num)," can be expressed as the sum of ",str(arr[i])," and ",str(arr[j]))
            break
if flag == 0:
    print("No Prime Numbers can give sum of ",str(num))

