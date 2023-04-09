#                              Day 26 coding Statement 

# Write a Python program to print Pyramid pattern using stars

# Description
#  Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

# Input
#  Enter the number of rows: 10
# Output
#          *
#         ***
#        *****
#       *******
#      *********
#     ***********
#    *************
#   ***************
#  *****************
# *******************

rows = int(input("Enter the number of rows: "))
for i in range(0, rows+1):
    for j in range(i,rows):        # rows = 3 (1,3)
        print(" ",end="")
    for k in range(0, 2*(i-1)+1):  #2*(3-1)+1 = 5 one star will be printed
        print("*", end="")
    print()
        
    

