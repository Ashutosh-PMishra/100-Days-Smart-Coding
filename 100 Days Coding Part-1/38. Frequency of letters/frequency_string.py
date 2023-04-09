#                                          Day 38 coding Statement 

# Write a Python Program to calculate the Frequency of characters in a string

# Description
#  Get a string as the input from the user and find the frequency of characters in the string.

# Input
#  Enter a string: Simplified
# Output
#  The frequency of s is 1
#  The frequency of i is 3
#  The frequency of m is 1
#  The frequency of p is 1
#  The frequency of l is 1
#  The frequency of f is 1
#  The frequency of e is 1
#  The frequency of d is 1  


Str = input("Enter the String: ")
frequency = 0
for i in range(0, len(Str)):
    Character = Str[i]
    frequency = Str.count(Character)
    print(str(frequency)," is the frequency of ",Character)
    

