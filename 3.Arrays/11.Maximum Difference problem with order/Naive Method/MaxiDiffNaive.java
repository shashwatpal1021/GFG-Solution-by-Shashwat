public class MaxiDiffNaive {
   public static void main(String[] args) {
      int[] a = { 2, 3, 10, 6, 4, 8, 1 };
      System.out.println(maxDiff(a));
   }

   static int maxDiff(int[] a) {
      int res = a[1] - a[0];
      for (int i = 0; i < a.length - 1; i++) {
         for (int j = i + 1; j < a.length; j++) {
            res = Math.max(res, a[j] - a[i]);
         }
      }
      return res;
   }
}
