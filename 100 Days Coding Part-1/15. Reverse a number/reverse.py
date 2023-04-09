#                                   Day 15 Coding Statement

# Write a Python program to reverse a given number

# Description
#  Get an input from the user and the print the reverse of the given number as the output

# E.g. let the number be 1234 then the reverse of the number is 4321

# Input
#     2869
# Output
#     9682

n = int(input("Enter any Number: "))
rev = 0

while n > 0:
    rem = n % 10
    rev = (rev * 10) + rem
    n = n // 10
print("The Reverse of the given number is: ", rev)

# Let n = 1234   → 4 iteration will occur(till n becomes 0)
# Iteration 1
# n = 1234
#  rem = n % 10 → 1234 % 10 = 4
#  rev = rev * 10 + rem; → 0 * 10 + 4 = 4
#  n = n // 10 → 1234 / 10 = 123 

# Iteration 2
# n = 123
#  rem = n % 10 → 123 % 10 = 3
#  rev = rev * 10 + rem → 4 * 10 + 3 = 43
#  n = n // 10 → 123 / 10 = 12

# Iteration 3
# n = 12
#  rem = n % 10 → 12 % 10 = 2
#  rev = rev * 10 + rem → 43 * 10 + 2 = 432
#  n = n // 10 → 12 / 10 = 1

# Iteration 4
# n = 1
#  rem = n % 10 → 1 % 10 = 1
#  rev = rev * 10 + rem → 432 * 10 + 1  = 4321
#  n = n // 10 → 1 / 10 = 0
