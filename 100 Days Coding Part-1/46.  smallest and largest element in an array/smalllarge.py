#                                          Day 46 Coding Statement

# Write a Pyhon Program to find smallest and largest element in an Array

# Description
#  Get an array as input from the user and then find the smallest and largest element in the array.

# Input
#  Enter the size of the Array: 5
#  Enter the array elements   : 10 20 5 40 30
# Output
#  Smallest Number : 5
#  Largest Number  : 40

n = int(input("Enter size of Array: "))
arr = []
print("Enter Array Elements: ")
for i in range(0,n):
    arr.append(int(input()))
    
small = arr[0]
large = arr[0]

for i in range(len(arr)):
    if arr[i] < small:
        small = arr[i]
        
    if arr[i] > large:
        large = arr[i]

print("Smallest Number: ",small)
print("Largest Number: ",large)

