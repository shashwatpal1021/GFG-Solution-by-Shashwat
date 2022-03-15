public class Solution {
   public static void main(String[] args) {
      int[] a = { 7, 2, 30, 10 };
      System.out.println(isSorted(a));
   }

   static boolean isSorted(int[] a) {
      for (int i = 0; i < a.length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[i])
               return false;
         }
      }
      return true;
   }
}
