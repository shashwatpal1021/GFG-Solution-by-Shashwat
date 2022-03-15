// TC:O(n)
// SC:O(1)

// Author: Shashwat Pal

class TrailingZeros {
   public static void main(String[] args) {
      int number = 251;
      System.out.println(countTrailingZeros(number));
   }

   static int countTrailingZeros(int n) {
      int res = 0;
      for (int i = 5; i <= n; i = i * 5) {
         res = res + (n / i);
      }
      return res;
   }
}