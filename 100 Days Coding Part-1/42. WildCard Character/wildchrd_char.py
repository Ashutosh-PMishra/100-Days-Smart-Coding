#                                         Day 42 Coding Statement 

# Check if two strings match where one string contains wildcard characters

# Description
#  Get two strings as input from the user, first with wildcard characters (* and ?) and 
#  second without wildcard characters. Then check whether they match or not.

# Input
#  Enter string containing wild characater : Simp*ifi?d Learner
#  Enter string to be matched : Simplified Learner
# Output
#  Yes it matches

# Algorithm:
# Initialize the variables.
# Accept the input.
# Check both the strings character by character.
# If a character of wild  string contains a ‘*’, take the next character from wild string and check for that character in string which you want to match.
# If they match, continue checking the next character
# Else return false.
# If the character of wild string contains a ‘?’, check if the immediate next character of wild string and the next character of string to be matched.
# If they match, continue checking  the next characters.
# Else, return false.
# Print result.


def solve(a,b):
    n,m = len(a), len(b)
    if n == 0 and m == 0:
        return "Yes it matches" # return  True    
    
    if n > 1 and a[0] == '*' and m == 0:
        return False         # return "No it is not matching" 
    
    if(n > 1 and a[0] == '?') or (n != 0 and m != 0 and a[0] == b[0]):
        return solve(a[1:], b[1:]);
    
    if n != 0 and a[0] == '*':
        return solve(a[1:], b) or solve(a,b[1:])
    
    return False

str1 = input("Enter string containing wild characater : ")
str2 = input("Enter string to be matched : ")
print(solve(str1,str2))