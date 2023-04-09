#                                  Day 17 coding Statement 

# Write a Python program to identify if the number is Perfect number or not

# What is a perfect number in Java?
# A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. 
# In other words, if the sum of positive divisors (excluding the number itself) of a number 
# equals the number itself is called a perfect number. 

# Description
#  Get the input from the user and check whether that number is a perfect number or not.
#  E.g. Let number is 28, 
#   factors of 28 are 1,2,4,7,14. 
#   Now the sum of all these factors(1+2+4+7+14) are 28 itself.

# Input
#  Enter any Number : 28
# Output
#  28 is a Perfect Number

# Input
#  Enter any Number : 4         (1,2) = (1+2 = 3)not equals to 4 so not a perfect number
# Output
#  4 is Not a perfect number 
    
    
num = int(input("Enter a Number: "))
sum = 0
for i in range(1,num):
    if num % i == 0:
        sum = sum + i
if(sum == num):
    print(num," is a Perfect Number")
else:
    print(num," is not a Perfect Number")


# let say num = 28
# for i in range(1,num): → for i in range(1,28): → i = 1,2,3,4,5,6,7,8,9......27
#  if num % i == 0: → 28 % 1 == 0 TRUE    for i = 1
#      sum = sum + i → 0 + 1 = 1

#  if num % i == 0: → 28 % 2 == 0 TRUE    for i = 2
#      sum = sum + i → 1+2 = 3

#  if num % i == 0: → 28 % 3 == 0 False    for i = 3
#  if num % i == 0: → 28 % 4 == 0 True     for i = 4
#       sum = sum + i → 3+4 = 7

#  if num % i == 0: → 28 % 5 == 0 false     for i = 5
#  if num % i == 0:→ 28 % 6 == 0 false      for i = 6
#  if num % i == 0: → 28 % 7 == 0 True      for i = 7
#      sum = sum + i → 7+7 = 14
#  if num % i == 0: → 28 % 8 == 0 false     for i = 8
#  if num % i == 0: → 28 % 9 == 0 false     for i = 9
#  if num % i == 0: → 28 % 10 == 0 false    for i = 10
#  if num % i == 0: → 28 % 11 == 0 false    for i = 11
#  if num % i == 0: → 28 % 12 == 0 false    for i = 12
#  if num % i == 0: → 28 % 13 == 0 false    for i = 13
#  if num % i == 0: → 28 % 14 == 0 True     for i = 14
#      sum = sum + i → 14+14= 28

#  if num % i == 0: → 28 % 15 == 0 false    for i = 15
#  if num % i == 0: → 28 % 16 == 0 false    for i = 16
#  if num % i == 0: → 28 % 17 == 0 false    for i = 17
#  if num % i == 0: → 28 % 18 == 0 false    for i = 18
#  if num % i == 0: → 28 % 19 == 0 false    for i = 19
#  if num % i == 0: → 28 % 20 == 0 false    for i = 20
#  if num % i == 0: → 28 % 21 == 0 false    for i = 21
#  if num % i == 0: → 28 % 22 == 0 false    for i = 22
#  if num % i == 0: → 28 % 23 == 0 false    for i = 23
#  if num % i == 0: → 28 % 24 == 0 false    for i = 24
#  if num % i == 0: → 28 % 25 == 0 false    for i = 25
#  if num % i == 0: → 28 % 26 == 0 false    for i = 26
#  if num % i == 0: → 28 % 27 == 0 false    for i = 27