#                                                Day 48 Coding Statement 

# Write a Python Program to find longest palindrome in an Array

# Description
# Get an Array as the input from the user and find the longest palindrome in that Array.

# Input
#  Enter the size of Array: 3
#  Enter the elements of Array : 121 10456 1000001
# Output: 
#  Longest palindrome number in the Array 1000001

# Input
#  Enter the size of Array: 4
#  Enter the elements of Array : 21 32 41 27
# Output: 
#  There is no palindrome in the Array



def isPalindrome(n):
    return(str(n) == str(n)[::-1])

n=int(input("Enter the size of Array: "))
arr=[]
print("Enter the elements of Array: ")
for i in range(n):
    arr.append(int(input()))
    
arr.sort(reverse = True)
flag = 1
for i in arr:
    if isPalindrome(i):
        print("Longest palindrome number in the Array: ",i)
        flag = 0
        break

if(flag):
    print("There is no palindrome in the Array")