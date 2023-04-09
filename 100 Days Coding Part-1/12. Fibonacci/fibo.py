#                                  Day 12 coding Statement: 

# Write a Python program to find Fibonacci series up to n

# Description
#   Fibonacci series is a special series where nth term is the sum of previous two terms in the series. 
#   The series starts with 0 and 1 as the first and second term of the series respectively.
#   Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

# Input
#   4
# Output
#   0,1,1,2

# Input
#   8
# Output
#   0,1,1,2,3,5,8,13

n = int(input("Enter the value of n : "))     
a,b = 0, 1
count = 0

if n <= 0:
    print("Please Enter a Positive Number")

elif n == 1:
    print("Fibonacci Series upto ", n, ": ")
    print(a)
    
else:
    print("Fibonacci Series upto ",n,": ")
    while count < n:                            
        print(a)
        c = a + b                                 
        a = b                                          
        b = c                                      
        count += 1
        