def leap_year(year):
    if (year%400==0) or (year%100 !=0) and (year%4==0):
        print("leap year")
    else:
        print("not a leap year")

leap_year(1700)