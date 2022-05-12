def fib(n):
    n1=0
    n2=1
    count=0
    if n <= 0:
        print("plz enter positive integer")
    elif n==1:
        print("the fibonacci sequence of the num upto ",n)
        print(n1)
    else:
        print("the fibonacci sequence of the num is: ")
        while count < n:
            print(n1,end=" ")
            nth=n1+n2
            n1=n2
            n2=nth
            count+=1

fib(13)