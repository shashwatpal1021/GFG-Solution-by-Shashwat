public class Solution {
   public static void main(String[] args) {
      int[] a = { 5, 12, 30, 2, 34 };
      System.out.println(isSorted(a));
   }

   static boolean isSorted(int[] a) {
      for (int i = 1; i < a.length; i++) {
         if (a[i] < ar[i - 1])
            return false;
      }
      return true;
   }
}
