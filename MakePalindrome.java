public class MakePalindrome {
    static int countSwap(String str)
  {
 
    // Length of string
    int n = str.length();
    char[] s = str.toCharArray();
    int count = 0;
    for (int i = 0; i < n / 2; i++) {
      int left = i;
      int right = n - left - 1;
      while (left < right) {
        if (s[left] == s[right]) {
          break;
        }
        else {
          right--;
          char temp=s[left];
          s[left]=s[right];
          s[right]=temp;
          return ispal
        }
      }

    return ;
  }
  //reverse character array
  static void reverse(char a[])
  {
    int n=a.length;
    char[] b = new char[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      b[j - 1] = a[i];
      j = j - 1;
    }
  }
 
  // Driver Code
  public static void main(String[] args)
  {
    String s = "kyaak";
 
    // Function calling
    int ans1 = countSwap(s);
 
    char[] charArray = s.toCharArray();
    reverse(charArray);
    s = new String(charArray);
 
    int ans2 = countSwap(s);
 
    if (ans1 > ans2)
      System.out.println(ans1);
    else
      System.out.println(ans2);
  }
}

