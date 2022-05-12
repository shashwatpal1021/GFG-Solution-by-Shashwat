# Easy

# Remove Duplicates from Sorted Array
def removeDuplicates(self, nums):  
    index = 1
    for num in nums:
        if num != nums[index-1]:
            nums[index] = num
            index += 1
    return index
    # OR
def removeDuplicates(self, nums):
    i = 0
    for num in nums:
      if i < 1 or num > nums[i - 1]:
        nums[i] = num
        i += 1
    return i
    TC:O(n)
    SP:O(1)

# Best Time to Buy and Sell Stock I
def maxProfit(self,prices):
    sellOne = 0
    holdOne = -math.inf
    for price in prices:
      sellOne = max(sellOne, holdOne + price)
      holdOne = max(holdOne, -price)
    return sellOne
# Best Time to Buy and Sell Stock II
def maxProfit(self, prices):
    sell = 0
    hold = -math.inf
    for price in prices:
      sell = max(sell, hold + price)
      hold = max(hold, sell - price)
    return sell
    TC:O(n)
    SP:O(1)

# Rotate Array
def rotate(self, nums, k):
    k %= len(nums)
    self.reverse(nums, 0, len(nums) - 1)
    self.reverse(nums, 0, k - 1)
    self.reverse(nums, k, len(nums) - 1)

def reverse(self,nums,l,r):
    while l < r:
        nums[l], nums[r] = nums[r], nums[l]
        l += 1
        r -= 1
    TC:O(n)
    SP:O(1)

# Contains Duplicate
def containsDuplicate(self, nums):
    return len(nums) != len(set(nums))
    TC:O(n)
    SP:O(n)

# Single Number
def singleNumber(self, nums):
    return reduce(lambda x, y: x ^ y, nums, 0)
    TC:O(n)
    SP:O(1)
# Intersection of Two Arrays 
def intersection(self, nums1, nums2):
    ans = []
    nums1 = set(nums1)
    for num in nums2:
      if num in nums1:
        ans.append(num)
        nums1.remove(num)
    return ans
    TC:O(n)
    SP:O(n)
# Intersection of Two Arrays II
# Hashset approach
def intersect(self,nums1,nums2):
    if len(nums1) > len(nums2):
      return self.intersect(nums2, nums1)
    ans = []
    count = Counter(nums1)
    for num in nums2:
      if count[num] > 0:
        ans.append(num)
        count[num] -= 1
    return ans
# Plus One
def plusOne(self, digits):    
    num = int(''.join([str(a) for a in digits])) + 1
    return [int(b) for b in str(num)]
# Move Zeroes
def moveZeroes(self,nums):
    j = 0
    for num in nums:
      if num != 0:
        nums[j] = num
        j += 1
    for i in range(j, len(nums)):
      nums[i] = 0
# Two Sum
def twoSum(self, nums, target):
    for i in range(len(nums)):
      for j in range(i+1,len(nums)):
        if nums[i]+nums[j]==target:
          return [i,j]
# Rotate Image
# using reverse
def rotate(self, matrix):
    matrix.reverse()
    for i in range(len(matrix)):
      for j in range(i + 1, len(matrix)):
        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        
# Indexing
def rotate(self, matrix):
    for min in range(len(matrix) // 2):
      max = len(matrix) - min - 1
      for i in range(min, max):
        offset = i - min
        top = matrix[min][i]
        matrix[min][i] = matrix[max - offset][min]
        matrix[max - offset][min] = matrix[max][max - offset]
        matrix[max][max - offset] = matrix[i][max]
        matrix[i][max] = top
# 3Sum
def threeSum(self, nums):
    if len(nums) < 3:
      return []
    ans = []
    nums.sort()
    for i in range(len(nums) - 2):
      if i > 0 and nums[i] == nums[i - 1]:
        continue
      l = i + 1
      r = len(nums) - 1
      while l < r:
        sum = nums[i] + nums[l] + nums[r]
        if sum == 0:
          ans.append((nums[i], nums[l], nums[r]))
          l += 1
          r -= 1
          while nums[l] == nums[l - 1] and l < r:
            l += 1
          while nums[r] == nums[r + 1] and l < r:
            r -= 1
        elif sum < 0:
          l += 1
        else:
          r -= 1

    return ans

# Set Matrix Zeroes
def setZeroes(self, matrix):
    row=[]
    col=[]    
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if (matrix[i][j] == 0):
                row.append(i)
                col.append(j)
    for i in range(len(matrix)):
        for r in row:
            if(i==r):
                for j in range(len(matrix[0])):
                    matrix[r][j] = 0    
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            for c in col:
                if(j==c):
                    matrix[i][c] = 0
    return matrix

# Group Anagrams
def groupAnagrams(self, strs):
    dict = defaultdict(list)
    for str in strs:
      key = ''.join(sorted(str))
      dict[key].append(str)
    return dict.values()

# Longest Substring Without Repeating Characters
def lengthOfLongestSubstring(self,s):
    ans = 0
    count = Counter()
    l = 0
    for r, c in enumerate(s):
      count[c] += 1
      while count[c] > 1:
        count[s[l]] -= 1
        l += 1
      ans = max(ans, r - l + 1)
    return ans

# Longest Palindromic Substring
def longestPalindrome(self,s):
    if not s:
      return ''
    def extend(s, i,j):
      while i >= 0 and j < len(s):
        if s[i] != s[j]:
          break
        i -= 1
        j += 1
      return i + 1, j - 1
    indices = [0, 0]
    for i in range(len(s)):
      l1, r1 = extend(s, i, i)
      if r1 - l1 > indices[1] - indices[0]:
        indices = l1, r1
      if i + 1 < len(s) and s[i] == s[i + 1]:
        l2, r2 = extend(s, i, i + 1)
        if r2 - l2 > indices[1] - indices[0]:
          indices = l2, r2
    return s[indices[0]:indices[1] + 1]
    TC:O(n2)
    SP:O(n)

# Increasing Triplet Subsequence
def increasingTriplet(self, nums):
    first = math.inf
    second = math.inf
    for num in nums:
      if num <= first:
        first = num
      elif num <= second:  # first < num <= second
        second = num
      else:
        return True  # first < second < num (third)
    return False
# Product of Array Except Self
def productExceptSelf(self, nums):
    n = len(nums)
    prefix = [1] * n  # prefix product
    suffix = [1] * n  # suffix product
    for i in range(1, n):
      prefix[i] = prefix[i - 1] * nums[i - 1]
    for i in reversed(range(n - 1)):
      suffix[i] = suffix[i + 1] * nums[i + 1]
    return [prefix[i] * suffix[i] for i in range(n)]
    TC:O(n)
    SP:O(n)
def productExceptSelf(self, nums):
    n = len(nums)
    ans = [1] * n
    # use ans as the prefix product array
    for i in range(1, n):
      ans[i] = ans[i - 1] * nums[i - 1]
    suffix = 1  # suffix product
    for i, num in reversed(list(enumerate(nums))):
      ans[i] *= suffix
      suffix *= num
    return ans
    TC:O(n)
    SP:O(1)

# Spiral Matrix
def spiralOrder(self, matrix):
    if not matrix:
      return []
    m = len(matrix)
    n = len(matrix[0])
    ans = []
    r1 = 0
    c1 = 0
    r2 = m - 1
    c2 = n - 1
    # repeatedly add matrix[r1..r2][c1..c2] to ans
    while len(ans) < m * n:
      j = c1
      while j <= c2 and len(ans) < m * n:
        ans.append(matrix[r1][j])
        j += 1
      i = r1 + 1
      while i <= r2 - 1 and len(ans) < m * n:
        ans.append(matrix[i][c2])
        i += 1
      j = c2
      while j >= c1 and len(ans) < m * n:
        ans.append(matrix[r2][j])
        j -= 1
      i = r2 - 1
      while i >= r1 + 1 and len(ans) < m * n:
        ans.append(matrix[i][c1])
        i -= 1
      r1 += 1
      c1 += 1
      r2 -= 1
      c2 -= 1
    return ans
    TC:O(mn)
    SP:O(1)
# 4Sum II
def fourSumCount(self,A,B,C,D):
    count = Counter(a + b for a in A for b in B)
    return sum(count[-c - d] for c in C for d in D)
    TC:O(n2)
    SP:O(n2)
# Container With Most Water
def maxArea(self,height):
    ans = 0
    l = 0
    r = len(height) - 1
    while l < r:
      minHeight = min(height[l], height[r])
      ans = max(ans, minHeight * (r - l))
      if height[l] < height[r]:
        l += 1
      else:
        r -= 1
    return ans
    TC:O(1)
    SP:O(1)
# Game of Life
def gameOfLife(self, board):
    m = len(board)
    n = len(board[0])
    for i in range(m):
      for j in range(n):
        ones = 0
        for x in range(max(0, i - 1), min(m, i + 2)):
          for y in range(max(0, j - 1), min(n, j + 2)):
            ones += board[x][y] & 1
        # any live cell with 2 or 3 live neighbors
        # lives on to the next generation
        if board[i][j] == 1 and (ones == 3 or ones == 4):
          board[i][j] |= 0b10
        # any dead cell with exactly 3 live neighbors
        # becomes a live cell, as if by reproduction
        if board[i][j] == 0 and ones == 3:
          board[i][j] |= 0b10
    for i in range(m):
      for j in range(n):
        board[i][j] >>= 1
    TC:O(mn)
    SP:O(1)
# First Missing Positive
def firstMissingPositive(self,nums):
    n = len(nums)
    # Correct slot:
    # nums[i] = i + 1
    # nums[i] - 1 = i
    # nums[nums[i] - 1] = nums[i]
    for i in range(n):
      while nums[i] > 0 and nums[i] <= n and nums[nums[i] - 1] != nums[i]:
        nums[nums[i] - 1], nums[i] = nums[i], nums[nums[i] - 1]
    for i, num in enumerate(nums):
      if num != i + 1:
        return i + 1
    return n + 1
    TC:O(n)
    SP:O(1)
# Longest Consecutive Sequence
def longestConsecutive(self,nums):
    ans = 0
    seen = set(nums)
    for num in nums:
      if num - 1 in seen:
        continue
      length = 0
      while num in seen:
        num += 1
        length += 1
      ans = max(ans, length)
    return ans
    TC:O(n)
    SP:O(n)
# Find the Duplicate Number
def findDuplicate(self, nums):
    slow = nums[nums[0]]
    fast = nums[nums[nums[0]]]
    while slow != fast:
      slow = nums[slow]
      fast = nums[nums[fast]]
    slow = nums[0]
    while slow != fast:
      slow = nums[slow]
      fast = nums[fast]
    return slow
    TC:O(n)
    SP:O(1)
# Sliding Window Maximum
def maxSlidingWindow(self, nums, k):
    ans = []
    q = deque()  # max queue
    for i, num in enumerate(nums):
      while q and q[-1] < num:
        q.pop()
      q.append(num)
      if i >= k and nums[i - k] == q[0]:  # out of bound
        q.popleft()
      if i >= k - 1:
        ans.append(q[0])
    return ans
    TC:O(n)
    SP:O(n)
# Minimum Window Substring
def minWindow(self, s, t):
    count = Counter(t)
    required = len(t)
    bestLeft = -1
    minLength = len(s) + 1
    l = 0
    for r, c in enumerate(s):
      count[c] -= 1
      if count[c] >= 0:
        required -= 1
      while required == 0:
        if r - l + 1 < minLength:
          bestLeft = l
          minLength = r - l + 1
        count[s[l]] += 1
        if count[s[l]] > 0:
          required += 1
        l += 1
    return '' if bestLeft == -1 else s[bestLeft: bestLeft + minLength]
    TC:O(s+t)
    SC:O(128)

    