#                                 Day 8 Coding Statement

# Write a Python program to find Number of days in a given month of a given year

# Description
#     Get the number of month and year as input from the user and check the number of days present in that month.

# 1. January - 31 days
# 2. February - 28 days in a common year and 29 days in leap years
# 3. March - 31 days
# 4. April - 30 days
# 5. May - 31 days
# 6. June - 30 days
# 7. July - 31 days
# 8. August - 31 days
# 9. September - 30 days
# 10. October - 31 days
# 11. November - 30 days
# 12. December - 31 days


# Input
# Enter month : 2
# Enter year : 2004
# Output
# 29

# Approach :-
#  1) Check if the given month is February.                                               
#  2) If True Check if the year is a year leap or not.
#  3) If year is a leap year Print 29 Days, Else Print 28 Days.
#  4) If Condition in Step 3 is False Check the month. 
#  5) Print the number of days assigned to specific Month.

month = int(input("Enter the Month: "))
year = int(input("Enter the Year: "))

if(month == 2 and (year % 400 == 0) or ((year % 100 != 0) and (year % 4 == 0))):
    print("Number of days is 29")
    
elif(month == 2):
    print("Number of days is 28")

elif(month == 1 or month == 3 or month == 5 or month == 7 or month == 8 or month == 10 or month == 12 ):
    print("Number of days is 31")
    
else:
    print("Number of days is 30")
