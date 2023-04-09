#                                          Day 29 coding Statement 

# Write a Python Program to reverse a string.

# Description
#     Get an input string from user and print it in reverse order.

# Input
#     Enter a string: Hello
# Output
#     Reversed string: olleH

# Input
#     Enter a string: Simplified Learner
# Output
#     Reversed string: renraeL deifilpmiS

# Method 1: Reversing a String using String slicing

# str1 = input("Enter a string: ")
# print("Reversed string: ",str1[::-1])

# Explanation :→
#   The slicing function accepts three variables in the format  →   [start:stop:step]

# The start holds the starting index of the string, the stop holds the last-1 element’s index, 
# step holds the value of the number of steps while iteration.

# In the code, string[::-1], when we pass -1 as the step and the empty start and end take 0 and len(string)-1 by 
# default. This reverses the string with step 1 in the reverse direction.


# Method 2: Reversing a String using reversed() function

# str1 = input("Enter a string: ")
# print("Reversed string: ",''.join(list(reversed(str1))))

# Explanation.
#   The reversed() takes string values and returns the reversed string. → reversed(str1)

# In the above code, we take string using input() function. input() function returns a list, 
# which is stored in the string variable. We pass the list string in reversed() function 
# which returns a list of reversed string elements.
# The string list is then converted to a string variable using .join() function.

# Method 3: usinf for loop

str1 = input("Enter a string: ")
str2 = ""
for i in str1:
    str2 = i + str2
print("Reversed string: ",str2)