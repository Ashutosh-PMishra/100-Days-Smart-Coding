#                                            Day 50 Coding Statement 

# Code in Python 
# Given 2 integer Arrays X and Y of same size. 
# Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors

# Sample input:
#  Enter the size of the Array: 3
#  Enter the Array1 Elements  : 5 -2 0 → -2 0 5  ascending order
#  Enter the Array2 Elements  : 4 6 8  →  8 6 4  descending order
# Sample output :
#  Minimum Scalar Product is: 4

# Explanation :
#  (-2*8 + 0*6 + 5*4) = 4

n = int(input("Enter the size of the Array: "))
arr1 = []
print("Enter the Array1 Elements: ")
for i in range(0,n):
    arr1.append(int(input()))
    
arr2 = []
print("Enter the Array2 Elements: ")
for i in range(0,n):
    arr2.append(int(input()))

# sort arr1 in ascending order
for i in range(n):
    for j in range(i+1, n):
        if arr1[i] > arr1[j]:
            arr1[i], arr1[j] = arr1[j], arr1[i]
            
# sort arr2 in descending order
for i in range(n):
    for j in range(i+1, n):
       if arr2[i] < arr2[j]:
           arr2[i], arr2[j] = arr2[j], arr2[i]
           
product = 0
for i in range(n):
    product += arr1[i] * arr2[i]
    
print("Minimum Scalar Product is:",product)