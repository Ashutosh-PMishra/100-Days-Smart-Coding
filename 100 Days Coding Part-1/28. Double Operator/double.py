#                                    Day 28 coding Statement 

# Write a Python program to find the double of the given number without using arithmetic operator

# Description
#  For the given input number calculate the double of it without using arithmetic operator.

# Input
#  Enter the number: 4          00000100 << 1 → 00001000
# Output
#  Double of 4 is 8

# Input
#  Enter the number: 5          00000101 << 1 → 00001010
# Output
#  Double of 5 is 10

num = int(input("Enter the number: "))
# print("Double of ",num," is ")

print("Double of ",num," is ",num<<1)