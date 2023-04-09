#                               Day 18 coding Statement 

# Write a Python program to find the Factors of a number

# Description
#  Get an input from the user and find the factors of the number.

# • Input
#  Enter a number: 100
# • Output
#  The factors of 100 are: 1 2 4 5 10 20 25 50 100 

num = int(input("Enter a Number: "))
print("Factors of ",num," are: ")
for i in range(1,num+1):
    if num % i == 0:
        print(i, end=" ")