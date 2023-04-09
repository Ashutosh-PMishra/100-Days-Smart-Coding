#                                        Day 43 Coding Statement 

# Write Python Program to check if two Arrays are the same or not

# Description
#  Get two arrays as the input from the user and check whether it is the same or not.

# Input
#  Enter size of array1    : 4                                                                                                             
#  Enter element of array1 : 2 4 13 1                                                       
#  Enter size of array2    : 4                                                                                                                            
#  Enter element of array2 : 4 2 1 13       
# Output                                                                                                                                                                                                                         
#   Both Arrays are same 

n = int(input("Enter size of array1: "))
arr1 = []
print("Enter element of array1: ")
for i in range(n):
    arr1.append(int(input()))
    
m = int(input("Enter size of array2: "))
arr2 = []
print("Enter element of array2: ")
for i in range(m):
    arr2.append(int(input()))
    
arr1.sort()
arr2.sort()

if(arr1 == arr2):
    print("Both Arrays are same ")
else:
      print("Both Arrays are not same ")