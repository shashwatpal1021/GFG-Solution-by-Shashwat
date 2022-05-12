def factorial(n):
    fact=1
    if n<0:
        print("factorial does not exist for negative num")
    elif n==0:
        print("factorial of 0 is 1")
    else:
        for i in range(1,n+1):
            fact *= i
        print("the factorial of ",n," is ",fact)

factorial(10)


def fact(n):  
    return 1 if (n==1 or n==0) else n * fact(n - 1);  
  