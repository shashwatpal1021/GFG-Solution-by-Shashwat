public class Solution {
   public static void main(String[] args) {
      String s = "shashwat";
      System.out.println(isPalindrome(s, 0, s.length() - 1));
   }

   static boolean isPalindrome(String str, int start, int end) {
      if(start>=end)
         return true;

      return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1));
   }
}
