public class TrappingNaive {
   public static void main(String[] args) {
      int[] a = { 3, 0, 1, 2, 5 };
      System.out.println(getWater(a));
   }

   static int getWater(int[] a) {
      int res = 0;
      for (int i = 1; i < a.length - 1; i++) {
         int lMax = a[i];
         for (int j = 0; j < i; j++) {
            lMax = Math.max(lMax, a[j]);
         }
         int rMax = a[i];
         for (int j = i + 1; j < a.length; j++) {
            rMax = Math.max(rMax, a[j]);
         }
         res = res + (Math.min(lMax, rMax) - a[i]);
      }
      return res;
   }
}
