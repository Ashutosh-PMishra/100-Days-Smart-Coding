#                                            Day 41 Coding Statement 

# Write a Python Program to Replace substring in a string

# Description
#  Get a string as input from the user and then get another string which has to be removed from the string.
#  Get the third input, the new substring which is placed in that substring position.
#  Finally print the output by replacing the substring with new string.

# Input
#  Enter a string: 23 Jan 2022
#  Enter substring which has to be replaced : 2022
#  Enter substring with which string has to be replaced : 2023
# Output : 
#  String after replacement: 23 Jan 2023

string = input("Enter a string: ")
str1 = input("Enter substring which has to be replaced : ")
str2 = input("Enter substring with which string has to be replaced : ")

string = string.replace(str1, str2)
print("String after replacement: ",string)