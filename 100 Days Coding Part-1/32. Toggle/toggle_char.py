#                                          Day 32 coding Statement 

# Write a Python Program to Toggle each character in a string

# Description
#  Get an input string from user and then convert the lower case of alphabets to upper case and 
#  all upper-case alphabets into lower case.

# Input
#  Enter a String : Hello
# Output
#  Toggle String : hELLO


# Method 1 :→ 

# str = input("Enter a String: ")
# str1 = ""        # initialize an empty string
# for i in str:
#     if i.isupper():
#         i = i.lower()
#         str1 = str1 + i
#     else:
#         i = i.upper()
#         str1 = str1 + i
# print("Toggle String : ",str1)        

# Method 2 :→ 

str = input("Enter a String: ")
print("Toggle String : ", str.swapcase())