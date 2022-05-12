def linear_Search(arr,target):
    for i in range(len(arr)):
        if arr[i]==target:
            return i

arr=[1 ,3, 5, 4, 7, 9]

print(linear_Search(arr,7))