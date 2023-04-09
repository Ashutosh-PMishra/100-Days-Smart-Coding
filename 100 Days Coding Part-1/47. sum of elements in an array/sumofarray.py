#                                         Day 47 Coding Statement 

# Write a Python Program to find sum of elements in an Array

# Description
#  Get an array as the input from the user and find the sum of the elements.

# Input
#  Enter the size of the Array: 3
#  Enter the Array elements   : 5 10 15
# Output
#  Sum of elements in an Array: 30

n = int(input("Enter the size of the Array: "))
arr = []
print("Enter the Array elements: ")
for i in range(0,n):
    arr.append(int(input()))

Sum = 0
for i in range(len(arr)):
    Sum = Sum + arr[i]

print("Sum of elements in an Array: ", Sum)    
