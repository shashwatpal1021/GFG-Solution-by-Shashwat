arr=[1,2,3,4,5]
n=3

for i in range(0,len(arr)):
    print(arr[i],end=" ")

for i in range(0,n):
    first=arr[0]
    for j in range(0,len(arr)-1):
        arr[j]=arr[j+1]
    arr[len(arr)-1]=first
print()
for i in range(len(arr)):
    print(arr[i],end=' ')