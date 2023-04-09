#                                         Day 44 Coding Statement 

# Write Python Program to find the Array type

# Description
# Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

# Input
#  Enter the size of the array: 4
#  Enter the array elements   : 12 4 22 88
# Output
#  Type of the Array is Even

n = int(input("Enter the size of the array: "))
arr = []
print("Enter the array elements: ")
for i in range(0,n):
    # temp = int(input())
    # arr.append(temp)
    arr.append(int(input()))
    o = 0  # odd count
    e = 0  # even count
    
for i in range(0,n):
    if(arr[i] % 2 == 1):
        o = o + 1
    else:
        e = e + 1

if(o == n):
    print("Type of the Array is Odd")
elif(e == n):
    print("Type of the Array is Even")
else:
    print("Type of the Array is Mixed")