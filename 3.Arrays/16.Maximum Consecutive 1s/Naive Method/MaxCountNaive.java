public class MaxCountNaive {
   public static void main(String[] args) {
      int[] a = { 0, 1, 1, 1, 0, 1, 1 };
      System.out.println(maxConsecutiveOnes(a));
   }

   static int maxConsecutiveOnes(int[] a) {
      int res = 0;
      for (int i = 0; i < a.length; i++) {
         int curr = 0;
         for (int j = i; j < a.length; j++) {
            if (a[j] == 1)
               curr++;
            else
               break;
         }
         res = Math.max(res, curr);
      }
      return res;
   }
}
