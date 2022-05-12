


def num(n):
    for i in range(n+1):
        for j in range(n-i):
            print(" ",end=" ")
        for j in range(n-i,n+1):
            print(j,end=" ")
        print()

num(5)


def anagram(str1,str2):
    n,m=len(str1),len(str2)
	if n != m:
		return "NO"
	else:
		a=str1.sort()
		b=str2.sort()
		if a == b:
			return "Yes"
	return "NO"



s1 = naman
s2 = manan

# print(anagram(s1,s2))