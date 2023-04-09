#                              Day 3 Coding Statement 

# Write a Python program to identify if the character is an alphabet or not.

# Description: 
#     Take an input character from user and check whether it is an alphabet or not.

# • Input : A
# → Output:  Alphabet

# • Input: 7 / @ # 
# → Output: Not an alphabet

# Method_1 (using if else condition)

# ch = input("Please Enter any Character: ")
# if((ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')):
#     print("The entered Character ", ch ," is an Alphabet.")
# else:
#     print("The entered Character ", ch ," is not an Alphabet.")

# Method_2 (using "isalpha()")

# ch = input("Please Enter any Character: ")
# if(ch.isalpha()):
#     print("The en3tered Character ", ch ," is an Alphabet.")
# else:
#     print("The entered Character ", ch ," is not an Alphabet.")

#  Surprise Code for you all

# write a Python program to check character is Alphabet, Digit or special Character.

ch = input("Please Enter any Character: ")

if((ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')):
    print("The entered Character ", ch ," is an Alphabet.")
    
elif(ch >= '0' and ch <= '9'):
    print("The entered Character ", ch ," is a Digit.")
    
else:
    print("The entered Character ", ch ," is a Special Character.")

