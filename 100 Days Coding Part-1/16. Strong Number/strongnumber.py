#                                         Day 16 coding Statement 

# Write a Python program to identify if the number is Strong number or not

# Description
#  Get a number as input from user and then check whether that number is a strong number or not. 
#  Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.

#  E.g. let the number be 145
#  Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.


# Input  : Enter a number: 145
# Output : Strong Number
# Sum of digit factorials = 1! + 4! + 5!
#                         = 1 + 24 + 120
#                         = 145


# Input : Enter a number: = 534
# Output : Not a Strong Number
# Sum of digit factorials = 5! + 3! + 4!
#                         = 120 + 6 + 24
#                         = 150 

# Problem Solution
# 1. Take the number as input and store the number in a variable.
# 2. Extract the digits of the number and find the factorial of each digit.
# 3. Calculate the sum of the factorial of each digit.
# 4. If the sum is equal to the number. print The number is Strong Number.
# 5. If the sum is not equal to the number. print The number is not a Strong Number.

num = int(input("Enter any number : "))
sum = 0
temp = num
fact = 1
if(num == 0):
    Sum = sum+fact
    print("It is not a valid input to check Strong Number, 0 factorial is ", Sum)
else:
    while(num):
        i = 1
        fact = 1
        rem = num % 10    #last digit(remainder)
        while(i <= rem):
            fact = fact * i
            i = i+1
        sum = sum + fact
        num = num // 10  # one digit less 
    if(sum == temp):
        print("Given number ",temp," is a STRONG NUMBER")
    else:
        print("Given number ",temp," is not a STRONG NUMBER")
        
# let say n = 145 
# temp = n = 145

# First Iteration : 
# rem = n % 10;  rem = 145 % 10 = 5
# while(i <= rem) ( i <= 5) means i = 1,2,3,4,5
#  fact *= i; = fact = 120
# sum += fact;  = sum = 120 
# n = n // 10 = 145 // 10 = 14

# Second Iteration : 
# rem = n % 10;  rem = 14 % 10 = 4
# while(i <= rem) ( i <= 4) means i = 1,2,3,4
#  fact *= i; = 24
# sum += fact;  = 120+24 = 144
# n = n // 10 = 14 // 10 = 1

# Third Iteration : 
# rem = n % 10;  rem = 1 % 10 = 1
# while(i <= rem) ( i <= 1) means i = 1
#  fact *= i; = 1
# sum += fact;  =  144 + 1 = 145
# n = n // 10 = 1 // 10 = 0