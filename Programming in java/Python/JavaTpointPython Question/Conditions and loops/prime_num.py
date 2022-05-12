def prime(n):
    if n>1:
        for i in range(2,int(n/2)+1):
            if(n%i==0):
                print(n, "not a prime number")
                break       
        else:
            print(n,"prime number")
    else:
        print(n," hello not a prime number")

n=int(input())
prime(n)