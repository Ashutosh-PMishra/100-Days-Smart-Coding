#                                        Day 39 coding Statement 

# Write a Python Program to print Non-repeating characters in a string

# Description
#   Get a string as the input from the user and print the non-repeating characters in a string.

# Input
#   Enter a string: Hello
# Output
#   Non repeating characters are: H e o

Str = input("Enter the String: ")
print("Non repeating characters are: ")
for i in Str:
    count = 0
    for j in Str:
        #check for repeated characters
        if i == j:
            count += 1
        #if character is found more than 1 time brerak the loop
        if count > 1:
            break      
    #print for nonrepeating characters
    if count == 1:
        print(i, end = " ")