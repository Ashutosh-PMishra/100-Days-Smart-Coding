#                                           Day 35 coding Statement 

# Write a Python Program to Remove brackets from an algebraic expression

# Description
#   Get an algebraic expression as input from the user and then remove all the brackets in that.

# Input
#  Enter algebraic expression: (a-b)+[c*d]+{e/f}
# Output
#  Expression without brackets : a-b+c*d+e/f

# Method :→ 1

# str = input("Enter algebraic expression: ")
# str1 = ""
# for i in str:
#     if ord(i) == 41 or ord(i) == 40 or ord(i) == 91 or ord(i) == 93 or ord(i) == 123 or ord(i) == 125:
#         pass
#     else:
#         str1 = str1 + i
# print("Expression without brackets : ",str1)
        

# Method :→ 2     
 
str = input("Enter algebraic expression: ")
str1 = ""
for i in str:
    if i == '(' or i == ')' or i == '[' or i == ']' or i == '{' or i == '}':
        continue
    else:
        str1 = str1 + i
print("Expression without brackets : ",str1)