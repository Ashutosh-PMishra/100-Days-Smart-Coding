#                               Day 20 coding Statement 

# Write a Python program to identify if the number is Armstrong number or not

# A positive integer is called an Armstrong number of order n if
# abcde..... = pow(a, n) + pow(b, n) + pow(c, n) + pow(d, n) + pow(e, n) + ......... 
#  abcd... = a^n + b^n + c^n + d^n + ...

# Description
#   Get an input number from user and check whether the given number is an Armstrong number or not.

# E.g. Let the number be 1634,  here n = 4
# Here 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
# Therefore, this is an Armstrong number

# Input
#   Enter a number: 153  
# Output
#   153 is an Armstrong number.  (1*1*1 + 5*5*5 + 3*3*3 = 153)

# Input
#   Enter a number: 121
# Output
#   121 is not an Armstrong number  

# CODE 1 → ARMSTRONG NUMBER OF N NUMBER

# take input from user
# num = int(input("Enter a number: "))
# sum = 0 
# change num variable to string and calculate length(number of digits)
# order = len(str(num))

# temp = num
# while temp > 0:
#     digit = temp % 10
#     sum += digit ** order  # sum = sum + digit ** order
#     temp = temp // 10    # temp //= 10

# display result
# if num == sum:
#     print(num," is an Armstrong Number")
# else:
#     print(num," is not an Armstrong Number")


# Enter a number: 153  
# sum = 0 
# order = 3
# temp = num = 153

# while temp > 0:
#   digit = 153 % 10 = 3
#   sum += digit ** order = 0 + 3 ** 3 = 27
#   temp = temp // 10  = 153 // 10 = 15

#   temp = 15
#   digit = 15 % 10 = 5
#   sum += digit ** order = 27 + 5 ** 3 = 152
#   temp = temp // 10  = 15 // 10 = 1

#   temp = 1
#   digit = 1 % 10 = 1
#   sum += digit ** order = 152 + 1 ** 3 = 153
#   temp = temp // 10  = 1 // 10 = 0

#   temp = 0
# if num == sum: True so print num is an Armstrong Number



# CODE 2 → ARMSTRONG NUMBER IN A GIVEN RANGE

lower = int(input("Enter lower range: "))
upper = int(input("Enter upper range: "))

print("The Armstrong Number from ",lower," to ",upper," are ")
for num in range(lower, upper + 1):
    sum = 0 
    temp = num
    order = len(str(num))    
    while temp > 0:
        digit = temp % 10
        sum += digit ** order  # sum = sum + digit ** order
        temp = temp // 10    # temp //= 10
    if num == sum:
        print(num, end=" , ")
