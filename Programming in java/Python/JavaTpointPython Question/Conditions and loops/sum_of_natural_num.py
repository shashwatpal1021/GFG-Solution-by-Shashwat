def sum_natural(n):
    if n<0:
        print("enter positive num")
    else:
        ans=0
        while n>0:
            ans += n
            n -= 1
        print(ans)

sum_natural(5)