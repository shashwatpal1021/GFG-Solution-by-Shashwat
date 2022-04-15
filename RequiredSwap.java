class RequiredSwap {

   static boolean isPalindrome(char[] str) {
      int len = str.length;
      if (len == 1)
         return true;
      int ptr1 = 0;
      int ptr2 = len - 1;

      while (ptr2 >= ptr1) {
         if (str[ptr1] != str[ptr2])
            return false;
         ptr1++;
         ptr2--;
      }
      return true;
   }

   static String noOfAppends(String s) {
      char[] str= s.toCharArray();
      if (isPalindrome(str))
         return str.toString();
      // s = s.substring(1);

      // return 1 + noOfAppends(s);
      int l = 0, r = str.length - 1;
      while (l <= r) {
         if (str[l] == str[r]) {
            l++;
            r--;
         } else {
            r--;
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
         }
         noOfAppends(str.toString());

         return "-1";
      }
   }

   // Driver code
   public static void main(String arr[]) {
      String s = "kyaak";
      System.out.printf("%d\n", noOfAppends(s));
   }
}

// This code contributed by Rajput-Ji

// static boolean palindrome(String s) {
// int l = 0, r = s.length() - 1;
// while (l < r) {
// if (s.charAt(l) == s.charAt(r)) {
// return true;
// l++;
// r--;
// } else {
// return false;
// }
// }
// }

// static void makePalindrome(String s) {
// int l = 0, r = s.length() - 1;
// String reset = "";
// while (l <= r) {
// if (s.charAt(l) == s.charAt(r)) {
// l++;
// r--;
// }else {

// }
// }