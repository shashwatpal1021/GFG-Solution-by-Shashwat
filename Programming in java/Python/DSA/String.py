# Reverse String
def reverseString(self,s):
    l = 0
    r = len(s) - 1
    while l < r:
      s[l], s[r] = s[r], s[l]
      l += 1
      r -= 1
      TC:O(n)
      SC:O(1)

# Reverse Integer
def reverse(self,x):
    ans = 0
    sign = -1 if x < 0 else 1
    x *= sign
    while x:
      ans = ans * 10 + x % 10
      x //= 10
    return 0 if ans < -2**31 or ans > 2**31 - 1 else sign * ans
    TC:O(logx)
    SC:O(1)

# First Unique Character in a String
def firstUniqChar(self, s):
    count = Counter(s)
    for i, c in enumerate(s):
      if count[c] == 1:
        return i
    return -1
    TC:O(n)
    SC:O(128)
# Valid Anagram
def isAnagram(self,s, t):
    if len(s) != len(t):
      return False
    dict = Counter(s)
    for c in t:
      dict[c] -= 1
      if dict[c] < 0:
        return False
    return True
    TC:O(n)
    SC:O(128)
# Valid Palindrome
def isPalindrome(self,s):
    l = 0
    r = len(s) - 1
    while l < r:
      while l < r and not s[l].isalnum():
        l += 1
      while l < r and not s[r].isalnum():
        r -= 1
      if s[l].lower() != s[r].lower():
        return False
      l += 1
      r -= 1
    return True
    TC:O(n)
    SC:O(1)
# String to Integer (atoi)
def myAtoi(self,s):
    s = s.strip()
    if not s:
      return 0
    sign = -1 if s[0] == '-' else 1
    if s[0] in {'-', '+'}:
      s = s[1:]
    num = 0
    for c in s:
      if not c.isdigit():
        break
      num = num * 10 + ord(c) - ord('0')
      if sign * num <= -2**31:
        return -2**31
      if sign * num >= 2**31 - 1:
        return 2**31 - 1
    return sign * num
    TC:O(n)
    SC:O(1)
# Implement strStr()
def strStr(self,haystack, needle):
    m = len(haystack)
    n = len(needle)
    for i in range(m - n + 1):
      if haystack[i:i + n] == needle:
        return i
    return -1
    TC:O((m-n)n)
    SC:O(1)
# Longest Common Prefix
def longestCommonPrefix(self, strs):
    if not strs:
      return ''
    for i in range(len(strs[0])):
      for j in range(1, len(strs)):
        if i == len(strs[j]) or strs[j][i] != strs[0][i]:
          return strs[0][:i]
    return strs[0]
    