# area of triangle = (s*(s-a)*(s-b)*(s-c))**0.5


a=float(input("enter first side: "))
b=float(input("enter second side: "))
c=float(input("enter third side: "))

# semi-perimeter

s=(a+b+c)/2

area = (s*(s-a)*(s-b)*(s-c))**0.5

print("the area of triangle is %0.2f" %area)