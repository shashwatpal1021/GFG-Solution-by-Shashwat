# def anagram(str1,str2):
#     n,m=len(str1),len(str2)
#     if n != m:
#         return "NO"
#     else:
#         a=sorted(str1)
#         b=sorted(str2)
#         if a == b:
#             return "Yes"
#     return "NO"

# s1=input()
# s2=input()

# print(anagram(s1,s2))

# Your code here

# Your code here

# def check(s1):
#     s=set(s1)
#     alpha = [ ch for ch in s if ord(ch) in range(ord('a'), ord('z')+1)]
#     if len(alpha)==26 :
#         print("1")
#     else:
#         print("0")
        
# s=int(input())
# while(s > 0):
#     s1=input().lower()
#     check(s1)
#     s -= 1

# Your code here


# def areDistinct(str, i, j):
#     visited = [0] * (26)
 
#     for k in range(i, j + 1):
#         if (visited[ord(str[k]) -
#                    ord('a')] == True):
#             return False
             
#         visited[ord(str[k]) - ord('a')] = True
 
#     return True
# def longestUniqueSubsttr(str):
     
#     n = len(str)
     
#     # Result
#     res = 0
     
#     for i in range(n):
#         for j in range(i, n):
#             if (areDistinct(str, i, j)):
#                 res = max(res, j - i + 1)
                 
#     return res


# t=int(input())

# while t > 0:
#     s=input()
#     print(longestUniqueSubsttr(s))
#     t -= 1    




def pairsum(l,s):
    for i in range(len(l)):
        for j in range(i + 1, len(l)):
            if l[i] + l[j] == s:
                return 1
                break
 
    return 0



if __name__=="__main__":
    t=int(input())
    s=int(input())
    l=[]
    for i in range(t):
        l.append(int(input()))

    # print(len(l))

    print(pairsum(l,s))