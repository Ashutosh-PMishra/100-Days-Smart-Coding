#                                          Day 49 Coding Statement 

# Write a Python Program to remove duplicate elements in an Array

# Description
#  Get an array as input from the user and then remove all the duplicate elements in that array.

# Input
#  Enter the size of Array    : 5
#  Enter the elements of Array: 35 35 60 60 45
# Output
#  35 45 60


# This function returns new size of modified array.
def removDup(arr,n):
    # Return, if array is empty or contains a single element
    if n == 0 or n == 1:
        return n
    
    temp = list(range(n))
    
    #start traversing elements
    j = 0;
    for i in range(0, n - 1):
        # If current element is not equal to next element then store that current element
        if arr[i] != arr[i+1]:
            temp[j] = arr[i]
            j += 1
            
    temp[j] = arr[n-1]
    j += 1
    
    #modify original array
    for i in range(0,j):
        arr[i] = temp[i]
    
    return j

n = int(input("Enter size of array: "))
arr = []
print("Enter the elements of Array: ")
for i in range(0,n):
    arr.append(int(input()))
    
arr.sort()

n = removDup(arr,n)

for i in range(n):
    print("%d"%(arr[i]), end = " ")
