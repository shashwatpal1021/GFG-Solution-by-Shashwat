a=int(input("enter the value of a: "))
b=int(input("enter the value of b: "))
# 1st Approach
temp=a
a=b
b=temp

# 2nd Approach

a,b = b,a

# 3rd Approach

a=a+b
b=a-b
a=a-b

# 4th Approach

a=a*b
b=a/b
a=a/b

# 5th Approach

a=a^b
b=a^b
a=a^b

print("value of a: ",a,"\nvalue of b: ",b)

