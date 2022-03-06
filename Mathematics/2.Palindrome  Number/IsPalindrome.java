public class IsPalindrome {
   public static void main(String[] args) {

      int num = 4553;
      System.out.println(isPalindrome(num));
   }

   static boolean isPalindrome(int n) {
      int rev = 0;
      int temp = n;
      while (temp != 0) {
         int element = temp % 10;
         rev = rev * 10 + element;
         temp /= 10;
      }
      return rev == n;
   }
}
