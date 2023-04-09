#                                       Day 33 coding Statement 

#  Write a Python Program to Remove vowels from a string

# Description
#  Get a string as the input from the user and then remove all the vowel letters from the string 
#  and give the output.

#  Vowels :→ a,e i,o,u,A,E,I,O,U

# Input
#  Enter a string: Simplified Learner
# Output
#  String after removing vowel :  Smplfd Lrnr

# Input
#  Enter a string: YouTube
# Output
#  String after removing vowel :  YTb

# Method 1 : Simple iteration on String using for loop

# str1 = input("Enter a string: ")
# vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
# result = ""

# for i in range(len(str1)):
#     if str1[i] not in vowels:
#         result = result + str1[i]
# print("String after removing vowel : ",result)


# Method 2 : Using regex

# import the module for regular expression (re)
import re
str1 = input("Enter a string: ")
print("String after removing vowel : ",re.sub("[aeiouAEIOU]","",str1))