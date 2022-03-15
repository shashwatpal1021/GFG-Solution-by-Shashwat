public class MaxDiffEfficient {
   public static void main(String[] args) {
      int[] a = { 2, 3, 10, 6, 4, 8, 1 };
      System.out.println(maxDiff(a));
   }

   static int maxDiff(int[] a) {
      int res = a[1] - a[0];
      int minVal = a[0];
      for (int i = 1; i < a.length; i++) {
         res = Math.max(res, a[i] - minVal);
         minVal = Math.min(minVal, a[i]);
      }
      return res;
   }
}
