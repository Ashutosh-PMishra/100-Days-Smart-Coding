#                                          Day 45 Coding Statement 

# Write a Python Program to find number of even and odd elements in an array

# Description
#  Get an array as input from the user and then count the number of even and odd elements present in the array.

# Input
#  Enter size of array: 5
#  Enter the elements : 1 3 4 5 12
# Output
#  Number of even elements : 2
#  Number of odd elements : 3

n = int(input("Enter size of Array: "))
arr = []
print("Enter Array Elements: ")
for i in range(0,n):
    arr.append(int(input()))
even = 0
odd = 0
for i in range(0,n):
    if arr[i] % 2 == 0:
        even += 1
    else:
        odd += 1
print("Number of Even Elements: ",even)
print("Number of Odd Elements:  ",odd)        