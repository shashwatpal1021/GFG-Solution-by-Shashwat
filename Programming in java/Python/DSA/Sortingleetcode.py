# Merge Sorted Array
def merge(self, nums1, m, nums2, n):   
    i=m-1
    j=n-1
    k=m+n-1        
    while j>=0:
        if i>=0 and nums1[i] > nums2[j]:
            nums1[k] = nums1[i]
            k -= 1
            i -= 1
        else:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1

# First Bad Version
def firstBadVersion(self, n: int) -> int:
    l = 1
    r = n
    while l < r:
      m = (l + r) >> 1
      if isBadVersion(m):
        r = m
      else:
        l = m + 1
    return l
    TC:O(log n)
    SC:O(1)
# Sort Colors
def sortColors(self, nums):
    zero = -1
    one = -1
    two = -1
    for num in nums:
      if num == 0:
        two += 1
        one += 1
        zero += 1
        nums[two] = 2
        nums[one] = 1
        nums[zero] = 0
      elif num == 1:
        two += 1
        one += 1
        nums[two] = 2
        nums[one] = 1
      else:
        two += 1
        nums[two] = 2
# Find Peak Element
def findPeakElement(self, nums):
    l = 0
    r = len(nums) - 1
    while l < r:
      m = (l + r) // 2
      if nums[m] >= nums[m + 1]:
        r = m
      else:
        l = m + 1
    return l
    TC:O(log n)
    SC:O(1)
# Search for a Range
def searchRange(self, nums, target):
    l,r=0,len(nums)-1
    left=-1        
    while(l<r):
        mid=l+(r-l)//2            
        if(nums[mid] > target):
            l=mid+1
        elif(nums[mid] < target):
            r=mid-1        
        elif(nums[mid]==target && nums[mid-1] != target):
            left=mid
            else:
                r=mid-1
            elif(num):
            pass

# Merge Intervals
def merge(self, intervals):
    ans = []
    for interval in sorted(intervals):
      if not ans or ans[-1][1] < interval[0]:
        ans.append(interval)
      else:
        ans[-1][1] = max(ans[-1][1], interval[1])
    return ans
    TC:O(log n)
    SC:O(n)
# Search in Rotated Sorted Array
def search(self, nums, target):
    l = 0
    r = len(nums) - 1
    while l <= r:
      m = (l + r) // 2
      if nums[m] == target:
        return m
      if nums[l] <= nums[m]:  # nums[l..m] are sorted
        if nums[l] <= target < nums[m]:
          r = m - 1
        else:
          l = m + 1
      else:  # nums[m..n - 1] are sorted
        if nums[m] < target <= nums[r]:
          l = m + 1
        else:
          r = m - 1
    return -1
    TC:O(log n)
    SC:O(1)
# Search a 2D Matrix II
def searchMatrix(self, matrix, target):
    r = 0
    c = len(matrix[0]) - 1

    while r < len(matrix) and c >= 0:
      if matrix[r][c] == target:
        return True
      if target < matrix[r][c]:
        c -= 1
      else:
        r += 1

    return False
    TC:O(m+n)
    SC:O(1)
# Search a 2D Matrix II
def searchMatrix(self, matrix, target):
    if not matrix:
      return False
    m = len(matrix)
    n = len(matrix[0])
    l = 0
    r = m * n
    while l < r:
      mid = (l + r) // 2
      i = mid // n
      j = mid % n
      if matrix[i][j] == target:
        return True
      if matrix[i][j] < target:
        l = mid + 1
      else:
        r = mid
    return False
    TC:O(mn log mn)
    SC:O(1)

# Kth Smallest Element in a Sorted Matrix
# Approach Heap
def kthSmallest(self, matrix, k):
    minHeap = []  # (matrix[i][j], i, j)
    i = 0
    while i < k and i < len(matrix):
      heapq.heappush(minHeap, (matrix[i][0], i, 0))
      i += 1
    while k > 1:
      k -= 1
      _, i, j = heapq.heappop(minHeap)
      if j + 1 < len(matrix[0]):
        heapq.heappush(minHeap, (matrix[i][j + 1], i, j + 1))
    return minHeap[0][0]
#approach BInary Search
def kthSmallest(self, matrix, k):
    l = matrix[0][0]
    r = matrix[-1][-1]
    def numsNoGreaterThan(m):
      count = 0
      j = len(matrix[0]) - 1
      # for each row, find the first index j s.t. row[j] <= m
      # so numsNoGreaterThan m for this row will be j + 1
      for row in matrix:
        while j >= 0 and row[j] > m:
          j -= 1
        count += j + 1
      return count
    while l < r:
      m = (l + r) // 2
      if numsNoGreaterThan(m) >= k:
        r = m
      else:
        l = m + 1
    return l
    TC:O(nlog(max−min))
    SC:O(1)
# Median of Two Sorted Arrays
def findMedianSortedArrays(self, nums1, nums2):
    n1 = len(nums1)
    n2 = len(nums2)
    if n1 > n2:
      return self.findMedianSortedArrays(nums2, nums1)
    l = 0
    r = n1
    while l <= r:
      partition1 = (l + r) // 2
      partition2 = (n1 + n2 + 1) // 2 - partition1
      maxLeft1 = -2**31 if partition1 == 0 else nums1[partition1 - 1]
      maxLeft2 = -2**31 if partition2 == 0 else nums2[partition2 - 1]
      minRight1 = 2**31 - 1 if partition1 == n1 else nums1[partition1]
      minRight2 = 2**31 - 1 if partition2 == n2 else nums2[partition2]
      if maxLeft1 <= minRight2 and maxLeft2 <= minRight1:
        return (max(maxLeft1, maxLeft2) + min(minRight1, minRight2)) * 0.5 if (n1 + n2) % 2 == 0 else max(maxLeft1, maxLeft2)
      elif maxLeft1 > minRight2:
        r = partition1 - 1
      else:
        l = partition1 + 1
    TC:O(log min(m,n))
    SC:O(1)
       