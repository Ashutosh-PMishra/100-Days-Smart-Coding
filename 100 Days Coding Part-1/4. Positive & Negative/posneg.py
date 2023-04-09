#                               Day 4 Coding Statement

# Write a Python program to identify of the a number is positive or negative

# Description :-
#  → Get an input number from the user and check whether it is a positive or negative number.

# Input : -20
# Output : Negative number

# Input :0
# Output : Neither positive nor negative

# Input :55
# Output : Positive number


# Method 1 :- (using if....elif...else)

# n = float(input("Enter any Number: "))    # n can be int, float or double
# if n > 0:
#     print(n , " is a Positive Number.")
    
# elif n == 0:
#     print(n, " is Zero.")

# else:
#     print(n, "is a Negative Number.")
    
    
# Method 2 :- (using nested if)

n = float(input("Enter any Number: "))    # n can be int, float or double
if n >= 0:
    if n == 0:
        print(n, "is Zero.")
    else:
        print(n, " is a Positive Number.")

else:
    print(n, "is a Negative Number.")        

