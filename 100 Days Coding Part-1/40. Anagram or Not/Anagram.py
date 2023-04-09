#                                       Day 40 coding Statement

# Write a Python Program to check if two strings are Anagram or not

# Description
#  Get two strings as input from the user and check whether it is Anagram or not.

# Two strings are said to be anagram if we can form one string by arranging the characters of another string. 
# For example, Race and Care. Here, we can form Race by arranging the characters of Care.

# Input
#  Enter first string:  race 
#  Enter second string: care
# Output
#  race and care are Anagram

Str1 = input("Enter first string:  ")
Str2 = input("Enter second string: ")

# convert both the strings into lowercase
Str1 = Str1.lower()
Str2 = Str2.lower()

if len(Str1) != len(Str2):
    print("Not Anagram") 
else:
    #sort the strings
    sorted_str1 = sorted(Str1)
    sorted_str2 = sorted(Str2)
    
    # if sorted char arrays are same
    if sorted_str1 == sorted_str2:
        print(Str1, " and ", Str2, " are Anagram")
    else:
        print(Str1, " and ", Str2, " are not Anagram")


