
# iterative
def binarySearch(arr,target):
    l=0
    h=len(arr)-1
    while l<=h:
        mid=l+(h-l)//2
        if arr[mid]>target:
            h=mid-1
        elif arr[mid]<target:
            l=mid+1
        else:
            return mid
    return -1

# recursive

def binary_Search(arr,l,h,target):
    while l<=h:
        mid=l+(h-l)//2
        if arr[mid]>target:
            return binary_Search(arr,l,mid-1,target)
        elif arr[mid]<target:
            return binary_Search(arr,mid+1,h,target)
        else:
            return mid
    return -1

arr = [12, 24, 32, 39, 45, 50, 54]  
n=len(arr)-1
target = 32  

print(binarySearch(arr,target))
print(binary_Search(arr,0,n,target))