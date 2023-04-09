# Day 2 coding Statement: 
# Write a Python program to identify if the character is a vowel or consonant.
# Vowel :- aeoiu AEIOU

# Description of the program: 

# Take an input character from the user and check whether the given input is a vowel or consonant.

# • Input
#   → A
# • Output
#   → Vowel

# • Input
#   → m
# • Output
#   → Consonant

# • Input
#   → 3
# • Output
#   → Invalid Input


ch = input("Enter any Character: ")
if(ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u' or 
    ch == 'A' or ch == 'E' or ch == 'I' or ch == 'O' or ch == 'U'):
    print(ch," is a Vowel.")

elif((ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z')):
    print(ch," is a Consonant")

else:
    print("Invalid Input! Please enter an Alphabet.")
    