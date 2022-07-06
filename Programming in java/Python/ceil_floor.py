# Your code here

def floorSearch(arr,low,high,x):
    low,high=0,len(arr)-1
    if (low > high):
        return -1
 
    # If last element is smaller than x
    if (x >= arr[high]):
        return high
 
    # Find the middle point
    mid = int((low + high) / 2)
 
    # If middle point is floor.
    if (arr[mid] == x):
        return mid
 
    # If x lies between mid-1 and mid
    if (mid > 0 and arr[mid-1] <= x
                and x < arr[mid]):
        return mid - 1
 
    # If x is smaller than mid,
    # floor must be in left half.
    if (x < arr[mid]):
        return floorSearch(arr, low, mid-1, x)
 
    # If mid-1 is not floor and x is greater than
    # arr[mid],
    return floorSearch(arr, mid + 1, high, x)

def ceil(arr,x):
    low,high=0,len(arr)-1

    if x <= arr[low]:
        return low
 
    # Otherwise, linearly search for ceil value */
    i = low
    for i in range(high):
        if arr[i] == x:
            return i
 
        # if x lies between arr[i] and arr[i+1] including
        # arr[i+1], then return arr[i+1] */
        if arr[i] < x and arr[i+1] >= x:
            return i+1
         
    # If we reach here then x is greater than the last element
    # of the array,  return -1 in this case */
    return -1

    
def patter(n):
    for i in range(n):
        return i

print(patter(5))
# t=int(input())
# arr=[]
# n=int(input())
# while t>0:
#     b=int(input())
#     arr.append(b)
#     t-=1

# while t>0:
#     x=int(input())
#     print(patter(x))
#     t-=1