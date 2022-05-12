# Number of 1 Bits
def hammingWeight(self, n: int) -> int:
    ans = 0
    for i in range(32):
      if (n >> i) & 1:
        ans += 1
    return ans
    TC:O(1)
    SC:O(1)

# Hamming Distance
def hammingDistance(x,y):
    ans=0
    while x > 0 or y > 0 :
        ans += (x & 1) ^ (y & 1)
        x >>= 1
        y >>= 1
    return ans
    TC:O(1)
    SC:O(1)

# Reverse Bits
def reverseBits(self, n: int) -> int:
    ans = 0
    for i in range(32):
      if n >> i & 1:
        ans |= 1 << 31 - i
    return ans
    TC:O(1)
    SC:O(1)
# Pascal's Triangle
def generate(self, numRows):
    ans = []
    for i in range(numRows):
      ans.append([1] * (i + 1))
    for i in range(2, numRows):
      for j in range(1, len(ans[i]) - 1):
        ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j]
    return ans
    TC:O(n2)
    SC:O(n2)

# Valid Parentheses
def isValid(self, s):
    stack = []
    for c in s:
      if c == '(':
        stack.append(')')
      elif c == '{':
        stack.append('}')
      elif c == '[':
        stack.append(']')
      elif not stack or stack.pop() != c:
        return False
    return not stack
    TC:O(n)
    SC:O(n)
# Missing Number
def missingNumber(self, nums):
    ans = len(nums)
    for i, num in enumerate(nums):
      ans ^= i ^ num
    return ans
    TC:O(n)
    SC:O(1)
# Sum of Two Integers
def getSum(self, a, b):
    mask = 0xFFFFFFFF
    kMax = 2000
    while b:
      a, b = (a ^ b) & mask, ((a & b) << 1) & mask
    return a if a < kMax else ~(a ^ mask)
    TC:O(32)
    SC:O(1)

# Evaluate Reverse Polish Notation
def evalRPN(self, tokens):
    stack = []
    operators = {
        '+': lambda a, b: a + b,
        '-': lambda a, b: a - b,
        '*': lambda a, b: a * b,
        '/': lambda a, b: int(a / b),
    }
    for token in tokens:
      if token in operators:
        b = stack.pop()
        a = stack.pop()
        stack.append(operators[token](a, b))
      else:
        stack.append(int(token))
    return stack[0]
    TC:O(n)
    SC:O(n)
# Majority Element
def majorityElement(self, nums):
    ans = None
    count = 0
    for num in nums:
      if count == 0:
        ans = num
      count += (1 if num == ans else -1)
    return ans
    TC:O(n)
    SC:O(1)
# Trapping Rain Water
def trap(self, height):
    if not height:
        return 0
    ans = 0
    l = 0
    r = len(height) - 1
    maxL = height[l]
    maxR = height[r]
    while l < r:
      if maxL < maxR:
        ans += maxL - height[l]
        l += 1
        maxL = max(maxL, height[l])
      else:
        ans += maxR - height[r]
        r -= 1
        maxR = max(maxR, height[r])
    return ans
    TC:O(n)
    SC:O(1)