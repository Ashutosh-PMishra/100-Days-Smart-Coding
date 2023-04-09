#                                          Day 37 Coding Statement 

# Write a Python Program to Capitalize the first and last letter of each word of a string

# Description
#  Get a string from the user and then change the first and last letter to uppercase.

# Input
#  Enter a string:  simplified
# Output
#  String after Capitalising First & Last Letter: SimplifieD


Str1 = input("Enter a String: ")
Str1 = Str1[0:1].upper() + Str1[1:len(Str1) - 1] + Str1[len(Str1) - 1 : len(Str1)].upper()
print("String after Capitalising First & Last Letter: ",Str1)